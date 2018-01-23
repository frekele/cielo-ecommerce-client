package org.frekele.cielo.ecommerce.client.repository;

import org.frekele.cielo.ecommerce.client.model.Customer;
import org.frekele.cielo.ecommerce.client.model.Payment;
import org.frekele.cielo.ecommerce.client.model.Sale;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
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
    Sale createSale(@HeaderParam("MerchantId") String merchantId,
                    @HeaderParam("MerchantKey") String merchantKey,
                    @HeaderParam("RequestId") String requestId,
                    Sale sale);

    @PUT
    @Path("RecurrentPayment/{recurrentPaymentId}/Customer")
    void updateRecurrentSaleCustomer(@HeaderParam("MerchantId") String merchantId,
                                     @HeaderParam("MerchantKey") String merchantKey,
                                     @HeaderParam("RequestId") String requestId,
                                     @PathParam("recurrentPaymentId") String recurrentPaymentId,
                                     Customer customer);

    @PUT
    @Path("RecurrentPayment/{recurrentPaymentId}/EndDate")
    void updateRecurrentSaleEndDate(@HeaderParam("MerchantId") String merchantId,
                                    @HeaderParam("MerchantKey") String merchantKey,
                                    @HeaderParam("RequestId") String requestId,
                                    @PathParam("recurrentPaymentId") String recurrentPaymentId,
                                    String endDate);

    @PUT
    @Path("RecurrentPayment/{recurrentPaymentId}/Interval")
    void updateRecurrentSaleInterval(@HeaderParam("MerchantId") String merchantId,
                                     @HeaderParam("MerchantKey") String merchantKey,
                                     @HeaderParam("RequestId") String requestId,
                                     @PathParam("recurrentPaymentId") String recurrentPaymentId,
                                     Integer interval);

    @PUT
    @Path("RecurrentPayment/{recurrentPaymentId}/RecurrencyDay")
    void updateRecurrentSaleDay(@HeaderParam("MerchantId") String merchantId,
                                @HeaderParam("MerchantKey") String merchantKey,
                                @HeaderParam("RequestId") String requestId,
                                @PathParam("recurrentPaymentId") String recurrentPaymentId,
                                Integer recurrencyDay);

    @PUT
    @Path("RecurrentPayment/{recurrentPaymentId}/Amount")
    void updateRecurrentSaleAmount(@HeaderParam("MerchantId") String merchantId,
                                   @HeaderParam("MerchantKey") String merchantKey,
                                   @HeaderParam("RequestId") String requestId,
                                   @PathParam("recurrentPaymentId") String recurrentPaymentId,
                                   Long amount);

    @PUT
    @Path("RecurrentPayment/{recurrentPaymentId}/NextPaymentDate")
    void updateRecurrentSaleNextPaymentDate(@HeaderParam("MerchantId") String merchantId,
                                            @HeaderParam("MerchantKey") String merchantKey,
                                            @HeaderParam("RequestId") String requestId,
                                            @PathParam("recurrentPaymentId") String recurrentPaymentId,
                                            String nextPaymentDate);

    @PUT
    @Path("RecurrentPayment/{recurrentPaymentId}/Payment")
    void updateRecurrentSalePayment(@HeaderParam("MerchantId") String merchantId,
                                    @HeaderParam("MerchantKey") String merchantKey,
                                    @HeaderParam("RequestId") String requestId,
                                    @PathParam("recurrentPaymentId") String recurrentPaymentId,
                                    Payment payment);

    @PUT
    @Path("RecurrentPayment/{recurrentPaymentId}/Deactivate")
    void deactivateRecurrentSale(@HeaderParam("MerchantId") String merchantId,
                                 @HeaderParam("MerchantKey") String merchantKey,
                                 @HeaderParam("RequestId") String requestId,
                                 @PathParam("recurrentPaymentId") String recurrentPaymentId);

    @PUT
    @Path("RecurrentPayment/{recurrentPaymentId}/Reactivate")
    void reactivateRecurrentSale(@HeaderParam("MerchantId") String merchantId,
                                 @HeaderParam("MerchantKey") String merchantKey,
                                 @HeaderParam("RequestId") String requestId,
                                 @PathParam("recurrentPaymentId") String recurrentPaymentId);
}
