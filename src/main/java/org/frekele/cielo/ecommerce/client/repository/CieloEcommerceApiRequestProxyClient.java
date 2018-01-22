package org.frekele.cielo.ecommerce.client.repository;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@Path("/1")
@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
@Consumes({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
interface CieloEcommerceApiRequestProxyClient extends Serializable {

    @POST
    @Path("sales")
    String xxxxxxx(@HeaderParam("MerchantId") String merchantId,
                   @HeaderParam("MerchantKey") String merchantKey,
                   @HeaderParam("RequestId") String requestId,
                   @QueryParam("xxxx") String xxx);
}
