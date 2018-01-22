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
public enum FraudAnalysisStatusEnum {

    STARTED("Started"),
    ACCEPT("Accept"),
    REVIEW("Review"),
    REJECT("Reject"),
    UNFINISHED("Unfinished"),
    PENDENT("Pendent"),
    PROVIDER_ERROR("ProviderError");

    private String value;

    private FraudAnalysisStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @XmlValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static FraudAnalysisStatusEnum fromValue(String value) {
        if (value != null && value.length() != 0) {
            for (FraudAnalysisStatusEnum obj : getAll()) {
                if (obj.value.equals(value)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static List<FraudAnalysisStatusEnum> getAll() {
        return Arrays.asList(FraudAnalysisStatusEnum.values());
    }
}
