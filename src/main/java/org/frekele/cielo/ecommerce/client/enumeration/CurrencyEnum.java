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
public enum CurrencyEnum {

    BRL("BRL"),
    USD("USD"),
    MXN("MXN"),
    COP("COP"),
    CLP("CLP"),
    ARS("ARS"),
    PEN("PEN"),
    EUR("EUR"),
    PYN("PYN"),
    UYU("UYU"),
    VEB("VEB"),
    VEF("VEF"),
    GBP("GBP");

    private String value;

    private CurrencyEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @XmlValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static CurrencyEnum fromValue(String value) {
        if (value != null && value.length() != 0) {
            for (CurrencyEnum obj : getAll()) {
                if (obj.value.equals(value)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static List<CurrencyEnum> getAll() {
        return Arrays.asList(CurrencyEnum.values());
    }
}
