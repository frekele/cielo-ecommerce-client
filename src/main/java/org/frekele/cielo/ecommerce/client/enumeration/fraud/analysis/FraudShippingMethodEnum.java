package org.frekele.cielo.ecommerce.client.enumeration.fraud.analysis;

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
public enum FraudShippingMethodEnum {

    NONE("None"),
    SOME_DAY("SameDay"),
    ONE_DAY("OneDay"),
    TOW_DAY("TwoDay"),
    THREE_DAY("ThreeDay"),
    LOW_COST("LowCost"),
    PICKUP("Pickup"),
    OTHER("Other");

    private String value;

    private FraudShippingMethodEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @XmlValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static FraudShippingMethodEnum fromValue(String value) {
        if (value != null && value.length() != 0) {
            for (FraudShippingMethodEnum obj : getAll()) {
                if (obj.value.equals(value)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static List<FraudShippingMethodEnum> getAll() {
        return Arrays.asList(FraudShippingMethodEnum.values());
    }
}
