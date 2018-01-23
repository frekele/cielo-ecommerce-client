package org.frekele.cielo.ecommerce.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceModel;
import org.frekele.cielo.ecommerce.client.enumeration.CardBrandEnum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditCard implements CieloEcommerceModel {

    private static final long serialVersionUID = 1L;

    @JsonProperty("CardNumber")
    private String cardNumber;

    @JsonProperty("Holder")
    private String holder;

    @JsonProperty("ExpirationDate")
    private String expirationDate;

    @JsonProperty("SecurityCode")
    private String securityCode;

    @JsonProperty("SaveCard")
    private Boolean saveCard;

    @JsonProperty("Brand")
    private CardBrandEnum brand;

    @JsonProperty("CardToken")
    private String cardToken;

    public CreditCard() {
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

    public Boolean getSaveCard() {
        return saveCard;
    }

    public void setSaveCard(Boolean saveCard) {
        this.saveCard = saveCard;
    }

    public CardBrandEnum getBrand() {
        return brand;
    }

    public void setBrand(CardBrandEnum brand) {
        this.brand = brand;
    }

    public String getCardToken() {
        return cardToken;
    }

    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }
}
