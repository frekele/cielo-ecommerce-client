package org.frekele.cielo.ecommerce.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecurrentSale {

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
