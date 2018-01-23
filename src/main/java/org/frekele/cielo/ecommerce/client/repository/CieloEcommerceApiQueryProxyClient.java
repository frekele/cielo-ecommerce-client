package org.frekele.cielo.ecommerce.client.repository;

import org.frekele.cielo.ecommerce.client.model.Sale;
import org.frekele.cielo.ecommerce.client.model.response.PaymentsQueryResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
interface CieloEcommerceApiQueryProxyClient extends Serializable {

    @GET
    @Path("sales/{paymentId}")
    Sale findSale(@HeaderParam("MerchantId") String merchantId,
                  @HeaderParam("MerchantKey") String merchantKey,
                  @HeaderParam("RequestId") String requestId,
                  @PathParam("paymentId") String paymentId);

    @GET
    @Path("sales")
    PaymentsQueryResponse findPayments(@HeaderParam("MerchantId") String merchantId,
                                       @HeaderParam("MerchantKey") String merchantKey,
                                       @HeaderParam("RequestId") String requestId,
                                       @QueryParam("merchantOrderId") String merchantOrderId);

    @GET
    @Path("RecurrentPayment/{recurrentPaymentId}")
    void findRecurrentSale(@HeaderParam("MerchantId") String merchantId,
                           @HeaderParam("MerchantKey") String merchantKey,
                           @HeaderParam("RequestId") String requestId,
                           @PathParam("recurrentPaymentId") String recurrentPaymentId);
}
