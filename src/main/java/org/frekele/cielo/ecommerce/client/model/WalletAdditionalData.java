package org.frekele.cielo.ecommerce.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceModel;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public class WalletAdditionalData implements CieloEcommerceModel {

    private static final long serialVersionUID = 1L;

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
