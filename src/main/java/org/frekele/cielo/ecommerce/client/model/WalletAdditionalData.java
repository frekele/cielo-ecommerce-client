package org.frekele.cielo.ecommerce.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class WalletAdditionalData implements CieloEcommerceEntity {

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
