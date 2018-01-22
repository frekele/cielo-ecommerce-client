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
public enum WalletTypeEnum {

    VISA_CHECKOUT("VisaCheckout"),
    MASTERPASS("Masterpass");

    private String value;

    private WalletTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @XmlValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static WalletTypeEnum fromValue(String value) {
        if (value != null && value.length() != 0) {
            for (WalletTypeEnum obj : getAll()) {
                if (obj.value.equals(value)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static List<WalletTypeEnum> getAll() {
        return Arrays.asList(WalletTypeEnum.values());
    }
}
