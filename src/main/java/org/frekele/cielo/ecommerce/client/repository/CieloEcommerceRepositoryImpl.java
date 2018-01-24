package org.frekele.cielo.ecommerce.client.repository;

import org.frekele.cielo.ecommerce.client.auth.CieloAuth;
import org.frekele.cielo.ecommerce.client.core.Cielo;
import org.frekele.cielo.ecommerce.client.enumeration.RecurrentIntervalEnum;
import org.frekele.cielo.ecommerce.client.model.CardToken;
import org.frekele.cielo.ecommerce.client.model.Customer;
import org.frekele.cielo.ecommerce.client.model.Payment;
import org.frekele.cielo.ecommerce.client.model.Sale;
import org.frekele.cielo.ecommerce.client.model.response.CaptureResponse;
import org.frekele.cielo.ecommerce.client.model.response.PaymentsQueryResponse;
import org.frekele.cielo.ecommerce.client.util.CieloUtils;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.inject.Inject;
import java.math.BigDecimal;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@Cielo
public class CieloEcommerceRepositoryImpl implements CieloEcommerceRepository {

    private static final long serialVersionUID = 1L;

    private final ResteasyClient client;

    private final CieloAuth auth;

    @Inject
    public CieloEcommerceRepositoryImpl(@Cielo ResteasyClient client, @Cielo CieloAuth auth) {
        CieloUtils.throwInjection(client, auth);
        CieloUtils.throwAuth(auth);
        this.client = client;
        this.auth = auth;
    }

    public ResteasyClient getClient() {
        return client;
    }

    public CieloAuth getAuth() {
        return auth;
    }

    public CieloEcommerceApiRequestProxyClient getApiRequestProxyClient() {
        ResteasyClient client = this.getClient();
        ResteasyWebTarget webTarget = client.target(this.getAuth().getEnvironment().getTargetApiRequestUrl());
        return webTarget.proxy(CieloEcommerceApiRequestProxyClient.class);
    }

    public CieloEcommerceApiQueryProxyClient getApiQueryProxyClient() {
        ResteasyClient client = this.getClient();
        ResteasyWebTarget webTarget = client.target(this.getAuth().getEnvironment().getTargetApiQueryUrl());
        return webTarget.proxy(CieloEcommerceApiQueryProxyClient.class);
    }

    @Override
    public Sale createSale(Sale sale) {
        CieloUtils.throwObject(sale, "Sale");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        return proxyClient.createSale(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            sale);
    }

    @Override
    public CardToken createCardToken(CardToken cardToken) {
        CieloUtils.throwObject(cardToken, "CardToken");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        return proxyClient.createCardToken(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            cardToken);
    }

    @Override
    public void updateRecurrentSaleCustomer(String recurrentPaymentId, Customer customer) {
        CieloUtils.throwObject(recurrentPaymentId, "recurrentPaymentId");
        CieloUtils.throwObject(customer, "Customer");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        proxyClient.updateRecurrentSaleCustomer(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            recurrentPaymentId, customer);
    }

    @Override
    public void updateRecurrentSaleEndDate(String recurrentPaymentId, String endDate) {
        CieloUtils.throwObject(recurrentPaymentId, "recurrentPaymentId");
        CieloUtils.throwObject(endDate, "endDate");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        proxyClient.updateRecurrentSaleEndDate(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            recurrentPaymentId, endDate);
    }

    @Override
    public void updateRecurrentSaleInterval(String recurrentPaymentId, RecurrentIntervalEnum interval) {
        CieloUtils.throwObject(recurrentPaymentId, "recurrentPaymentId");
        CieloUtils.throwObject(interval, "RecurrentIntervalEnum");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        proxyClient.updateRecurrentSaleInterval(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            recurrentPaymentId, interval.getInterval());
    }

    @Override
    public void updateRecurrentSaleDay(String recurrentPaymentId, Integer recurrencyDay) {
        CieloUtils.throwObject(recurrentPaymentId, "recurrentPaymentId");
        CieloUtils.throwObject(recurrencyDay, "recurrencyDay");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        proxyClient.updateRecurrentSaleDay(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            recurrentPaymentId, recurrencyDay);
    }

    @Override
    public void updateRecurrentSaleAmount(String recurrentPaymentId, BigDecimal amount) {
        CieloUtils.throwObject(recurrentPaymentId, "recurrentPaymentId");
        CieloUtils.throwObject(amount, "amount");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        proxyClient.updateRecurrentSaleAmount(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            recurrentPaymentId, amount.unscaledValue().longValue());
    }

    @Override
    public void updateRecurrentSaleNextPaymentDate(String recurrentPaymentId, String nextPaymentDate) {
        CieloUtils.throwObject(recurrentPaymentId, "recurrentPaymentId");
        CieloUtils.throwObject(nextPaymentDate, "nextPaymentDate");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        proxyClient.updateRecurrentSaleNextPaymentDate(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            recurrentPaymentId, nextPaymentDate);
    }

    @Override
    public void updateRecurrentSalePayment(String recurrentPaymentId, Payment payment) {
        CieloUtils.throwObject(recurrentPaymentId, "recurrentPaymentId");
        CieloUtils.throwObject(payment, "Payment");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        proxyClient.updateRecurrentSalePayment(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            recurrentPaymentId, payment);
    }

    @Override
    public void deactivateRecurrentSale(String recurrentPaymentId) {
        CieloUtils.throwObject(recurrentPaymentId, "recurrentPaymentId");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        proxyClient.deactivateRecurrentSale(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            recurrentPaymentId);
    }

    @Override
    public void reactivateRecurrentSale(String recurrentPaymentId) {
        CieloUtils.throwObject(recurrentPaymentId, "recurrentPaymentId");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        proxyClient.reactivateRecurrentSale(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            recurrentPaymentId);
    }

    @Override
    public CaptureResponse captureSale(String paymentId) {
        CieloUtils.throwObject(paymentId, "paymentId");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        return proxyClient.captureSale(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            paymentId);
    }

    @Override
    public CaptureResponse captureSale(String paymentId, BigDecimal amount) {
        CieloUtils.throwObject(paymentId, "paymentId");
        CieloUtils.throwObject(amount, "amount");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        return proxyClient.captureSale(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            paymentId, amount.unscaledValue().longValue());
    }

    @Override
    public CaptureResponse captureSale(String paymentId, BigDecimal amount, BigDecimal serviceTaxAmount) {
        CieloUtils.throwObject(paymentId, "paymentId");
        CieloUtils.throwObject(amount, "amount");
        CieloUtils.throwObject(serviceTaxAmount, "serviceTaxAmount");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        return proxyClient.captureSale(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            paymentId, amount.unscaledValue().longValue(), serviceTaxAmount.unscaledValue().longValue());
    }

    @Override
    public CaptureResponse cancelSale(String paymentId) {
        CieloUtils.throwObject(paymentId, "paymentId");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        return proxyClient.cancelSale(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            paymentId);
    }

    @Override
    public CaptureResponse cancelSale(String paymentId, BigDecimal amount) {
        CieloUtils.throwObject(paymentId, "paymentId");
        CieloUtils.throwObject(amount, "amount");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        return proxyClient.cancelSale(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            paymentId, amount.unscaledValue().longValue());
    }

    @Override
    public CaptureResponse cancelSaleByMerchantOrderId(String merchantOrderId) {
        CieloUtils.throwObject(merchantOrderId, "merchantOrderId");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        return proxyClient.cancelSaleByMerchantOrderId(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            merchantOrderId);
    }

    @Override
    public CaptureResponse cancelSaleByMerchantOrderId(String merchantOrderId, BigDecimal amount) {
        CieloUtils.throwObject(merchantOrderId, "merchantOrderId");
        CieloUtils.throwObject(amount, "amount");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        return proxyClient.cancelSaleByMerchantOrderId(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            merchantOrderId, amount.unscaledValue().longValue());
    }

    @Override
    public Sale findSale(String paymentId) {
        CieloUtils.throwObject(paymentId, "paymentId");
        CieloEcommerceApiQueryProxyClient proxyClient = this.getApiQueryProxyClient();
        return proxyClient.findSale(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            paymentId);
    }

    @Override
    public PaymentsQueryResponse findPayments(String merchantOrderId) {
        CieloUtils.throwObject(merchantOrderId, "merchantOrderId");
        CieloEcommerceApiQueryProxyClient proxyClient = this.getApiQueryProxyClient();
        return proxyClient.findPayments(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            merchantOrderId);
    }
}
