package org.frekele.cielo.ecommerce.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WalletAdditionalData {

    @JsonProperty("CaptureCode")
    private String captureCode;

    public WalletAdditionalData() {
        super();
    }

    public String getCaptureCode() {
        return captureCode;
    }

    public void setCaptureCode(String captureCode) {
        this.captureCode = captureCode;
    }
}
