package org.frekele.cielo.ecommerce.client.model.fraud.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FraudCart implements CieloEcommerceModel {

    private static final long serialVersionUID = 1L;

    @JsonProperty("IsGift")
    private Boolean isGift;

    @JsonProperty("ReturnsAccepted")
    private Boolean returnsAccepted;

    public FraudCart() {
        super();
    }

    public Boolean getIsGift() {
        return isGift;
    }

    public void setIsGift(Boolean isGift) {
        this.isGift = isGift;
    }

    public Boolean getReturnsAccepted() {
        return returnsAccepted;
    }

    public void setReturnsAccepted(Boolean returnsAccepted) {
        this.returnsAccepted = returnsAccepted;
    }
}
