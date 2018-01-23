package org.frekele.cielo.ecommerce.client.repository;

import org.frekele.cielo.ecommerce.client.enumeration.RecurrentIntervalEnum;
import org.frekele.cielo.ecommerce.client.model.Customer;
import org.frekele.cielo.ecommerce.client.model.Payment;
import org.frekele.cielo.ecommerce.client.model.Sale;
import org.frekele.cielo.ecommerce.client.model.response.PaymentsQueryResponse;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public interface CieloEcommerceRepository extends Serializable {

    public Sale createSale(Sale sale);

    public void updateRecurrentSaleCustomer(String recurrentPaymentId, Customer customer);

    public void updateRecurrentSaleEndDate(String recurrentPaymentId, String endDate);

    public void updateRecurrentSaleInterval(String recurrentPaymentId, RecurrentIntervalEnum interval);

    public void updateRecurrentSaleDay(String recurrentPaymentId, Integer recurrencyDay);

    public void updateRecurrentSaleAmount(String recurrentPaymentId, BigDecimal amount);

    public void updateRecurrentSaleNextPaymentDate(String recurrentPaymentId, String nextPaymentDate);

    public void updateRecurrentSalePayment(String recurrentPaymentId, Payment payment);

    public void deactivateRecurrentSale(String recurrentPaymentId);

    public void reactivateRecurrentSale(String recurrentPaymentId);

    public Sale findSale(String paymentId);

    public PaymentsQueryResponse findPayments(String merchantOrderId);
}
