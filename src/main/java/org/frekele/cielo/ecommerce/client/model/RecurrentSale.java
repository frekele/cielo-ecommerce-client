package org.frekele.cielo.ecommerce.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceModel;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public class RecurrentSale implements CieloEcommerceModel {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Customer")
    private Customer customer;

    @JsonProperty("RecurrentPayment")
    private RecurrentPayment recurrentPayment;

    public RecurrentSale() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RecurrentPayment getRecurrentPayment() {
        return recurrentPayment;
    }

    public void setRecurrentPayment(RecurrentPayment recurrentPayment) {
        this.recurrentPayment = recurrentPayment;
    }
}
