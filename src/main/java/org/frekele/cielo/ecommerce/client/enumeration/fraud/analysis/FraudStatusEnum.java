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
public enum FraudStatusEnum {

    STARTED("Started"),
    ACCEPT("Accept"),
    REVIEW("Review"),
    REJECT("Reject"),
    UNFINISHED("Unfinished"),
    PENDENT("Pendent"),
    PROVIDER_ERROR("ProviderError");

    private String value;

    private FraudStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @XmlValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static FraudStatusEnum fromValue(String value) {
        if (value != null && value.length() != 0) {
            for (FraudStatusEnum obj : getAll()) {
                if (obj.value.equals(value)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static List<FraudStatusEnum> getAll() {
        return Arrays.asList(FraudStatusEnum.values());
    }
}
