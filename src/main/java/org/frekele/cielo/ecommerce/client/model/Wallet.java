package org.frekele.cielo.ecommerce.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceEntity;
import org.frekele.cielo.ecommerce.client.enumeration.WalletTypeEnum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Wallet implements CieloEcommerceEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Type")
    private WalletTypeEnum type;

    @JsonProperty("WalletKey")
    private String WalletKey;

    @JsonProperty("Eci")
    private String eci;

    @JsonProperty("AdditionalData")
    private WalletAdditionalData additionalData;

    public Wallet() {
        super();
    }

    public WalletTypeEnum getType() {
        return type;
    }

    public void setType(WalletTypeEnum type) {
        this.type = type;
    }

    public String getWalletKey() {
        return WalletKey;
    }

    public void setWalletKey(String walletKey) {
        WalletKey = walletKey;
    }

    public String getEci() {
        return eci;
    }

    public void setEci(String eci) {
        this.eci = eci;
    }

    public WalletAdditionalData getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(WalletAdditionalData additionalData) {
        this.additionalData = additionalData;
    }
}
