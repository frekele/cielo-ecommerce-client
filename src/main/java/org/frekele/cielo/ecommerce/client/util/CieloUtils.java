package org.frekele.cielo.ecommerce.client.util;

import org.apache.commons.io.IOUtils;
import org.frekele.cielo.ecommerce.client.auth.CieloAuth;
import org.frekele.cielo.ecommerce.client.exception.CieloException;

import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.UUID;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public final class CieloUtils {

    public static void throwInjection(Object... objects) {
        for (Object obj : objects) {
            if (obj == null) {
                String msg = "Parameters in the constructor were not injected!";
                throw new CieloException(msg);
            }
        }
    }

    public static void throwAuth(CieloAuth auth) {
        if (auth == null) {
            throw new CieloException("CieloAuth can not be Null!");
        }
        if (auth.getMerchantId() == null) {
            throw new CieloException("MerchantId can not be Null!");
        }
        if (auth.getMerchantId().trim().isEmpty()) {
            throw new CieloException("MerchantId can not be Empty!");
        }
        if (auth.getMerchantKey() == null) {
            throw new CieloException("MerchantKey can not be Null!");
        }
        if (auth.getMerchantKey().trim().isEmpty()) {
            throw new CieloException("MerchantKey can not be Empty!");
        }
        if (auth.getEnvironment() == null) {
            throw new CieloException("Environment can not be Null!");
        }
    }

    public static void throwObject(Object obj, String objectName) {
        if (obj == null || obj.toString().trim().isEmpty()) {
            throw new CieloException("" + objectName + " can not be Null or Empty!");
        }
    }

    public static String buildRequestId() {
        return UUID.randomUUID().toString();
    }

    public static String responseBodyToString(ClientResponseContext responseContext) throws IOException {
        String body = null;
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
                body = IOUtils.toString(entityStream, charset);
                //Original EntityStream is closed, add InputStream again for Security.
                responseContext.setEntityStream(IOUtils.toInputStream(body, charset));
            }
        }
        return body;
    }
}
