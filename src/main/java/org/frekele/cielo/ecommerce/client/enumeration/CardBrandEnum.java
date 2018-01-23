package org.frekele.cielo.ecommerce.client.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import java.util.Arrays;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlType
@XmlEnum(String.class)
public enum CardBrandEnum {

    VISA("Visa"),
    MASTERCARD("Master"),
    AMERICAN_EXPRESS("Amex"),
    ELO("Elo"),
    AURA("Aura"),
    JCB("JCB"),
    DINERS_CLUB("Diners"),
    DISCOVER("Discover"),
    HIPERCARD("Hipercard");

    private String value;

    private CardBrandEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @XmlValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static CardBrandEnum fromValue(String value) {
        if (value != null && value.length() != 0) {
            for (CardBrandEnum obj : getAll()) {
                if (obj.value.equals(value)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static List<CardBrandEnum> getAll() {
        return Arrays.asList(CardBrandEnum.values());
    }
}
