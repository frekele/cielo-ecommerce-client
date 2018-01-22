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
public enum PaymentTypeEnum {

    CREDIT_CARD("CreditCard"),
    DEBIT_CARD("DebitCard"),
    ELECTRONIC_TRANSFER("ElectronicTransfer"),
    BOLETO("Boleto");

    private String value;

    private PaymentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @XmlValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static PaymentTypeEnum fromValue(String value) {
        if (value != null && value.length() != 0) {
            for (PaymentTypeEnum obj : getAll()) {
                if (obj.value.equals(value)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static List<PaymentTypeEnum> getAll() {
        return Arrays.asList(PaymentTypeEnum.values());
    }
}
