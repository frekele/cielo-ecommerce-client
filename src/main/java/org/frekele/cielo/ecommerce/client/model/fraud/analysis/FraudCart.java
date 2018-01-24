package org.frekele.cielo.ecommerce.client.model.fraud.analysis;

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
public class FraudCart implements CieloEcommerceEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("IsGift")
    private Boolean gift;

    @JsonProperty("ReturnsAccepted")
    private Boolean returnsAccepted;

    public FraudCart() {
        super();
    }

    public Boolean getGift() {
        return gift;
    }

    public void setGift(Boolean gift) {
        this.gift = gift;
    }

    public Boolean getReturnsAccepted() {
        return returnsAccepted;
    }

    public void setReturnsAccepted(Boolean returnsAccepted) {
        this.returnsAccepted = returnsAccepted;
    }
}
