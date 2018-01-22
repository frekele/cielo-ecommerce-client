package org.frekele.cielo.ecommerce.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecurrentTransaction {

    @JsonProperty("PaymentId")
    private String paymentId;

    @JsonProperty("PaymentNumber")
    private Integer paymentNumber;

    @JsonProperty("TryNumber")
    private Integer tryNumber;

    public RecurrentTransaction() {
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(Integer paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public Integer getTryNumber() {
        return tryNumber;
    }

    public void setTryNumber(Integer tryNumber) {
        this.tryNumber = tryNumber;
    }
}
