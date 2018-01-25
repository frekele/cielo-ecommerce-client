package org.frekele.cielo.ecommerce.client.filter;

import org.jboss.logging.Logger;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import java.io.IOException;

/**
 * @author frekele - Leandro Kersting de Freitas
 */

public class ResponseLoggingFilter implements ClientResponseFilter {

    private Logger logger = Logger.getLogger(ResponseLoggingFilter.class.getName());

    @Override
    public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("------------------------------------------------------------------");
        sb.append("\n");
        sb.append("<-- Response Filter:");
        sb.append("\n");
        sb.append("<-- Response - Status= " + responseContext.getStatus());
        sb.append("\n");
        sb.append("------------------------------------------------------------------");
        this.getLogger().debug(sb.toString());
    }

    public Logger getLogger() {
        return logger;
    }
}
