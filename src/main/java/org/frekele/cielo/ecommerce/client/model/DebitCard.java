package org.frekele.cielo.ecommerce.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceEntity;
import org.frekele.cielo.ecommerce.client.enumeration.CardBrandEnum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DebitCard implements CieloEcommerceEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("CardNumber")
    private String cardNumber;

    @JsonProperty("Holder")
    private String holder;

    @JsonProperty("ExpirationDate")
    private String expirationDate;

    @JsonProperty("SecurityCode")
    private String securityCode;

    @JsonProperty("Brand")
    private CardBrandEnum brand;

    public DebitCard() {
        super();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public CardBrandEnum getBrand() {
        return brand;
    }

    public void setBrand(CardBrandEnum brand) {
        this.brand = brand;
    }
}
