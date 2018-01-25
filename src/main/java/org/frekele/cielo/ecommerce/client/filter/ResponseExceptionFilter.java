package org.frekele.cielo.ecommerce.client.filter;

import org.apache.commons.io.IOUtils;

import javax.annotation.Priority;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@Priority(Priorities.USER)
public class ResponseExceptionFilter implements ClientResponseFilter {

    @Override
    public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext) throws IOException {
        int status = responseContext.getStatus();
        switch (status) {
            case 400:
                throw new BadRequestException(this.getBodyAsMessage(responseContext, Response.Status.BAD_REQUEST));
            case 404:
                throw new NotFoundException(this.getBodyAsMessage(responseContext, Response.Status.NOT_FOUND));
            case 500:
                throw new InternalServerErrorException(this.getBodyAsMessage(responseContext, Response.Status.INTERNAL_SERVER_ERROR));
        }
    }

    private String getBodyAsMessage(ClientResponseContext responseContext, Response.Status status) throws IOException {
        if (responseContext.hasEntity()) {
            try (InputStream entityStream = responseContext.getEntityStream()) {
                Charset charset = null;
                MediaType mediaType = responseContext.getMediaType();
                if (mediaType != null) {
                    String charsetName = mediaType.getParameters().get("charset");
                    if (charsetName != null) {
                        charset = Charset.forName(charsetName);
                    }
                }
                if (charset == null) {
                    charset = Charset.defaultCharset();
                }
                //HTTP 400 Bad Request
                StringBuilder sb = new StringBuilder("HTTP ");
                sb.append(status.getStatusCode());
                sb.append(" ");
                sb.append(status.getReasonPhrase());
                sb.append(": \n");
                sb.append(IOUtils.toString(entityStream, charset));
                return sb.toString();
            }
        }
        return null;
    }
}
