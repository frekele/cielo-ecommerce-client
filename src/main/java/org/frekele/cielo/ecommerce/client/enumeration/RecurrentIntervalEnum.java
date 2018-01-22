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
public enum RecurrentIntervalEnum {

    MONTHLY("Monthly"),
    BIMONTHLY("Bimonthly"),
    QUARTERLY("Quarterly"),
    SEMI_ANNUAL("SemiAnnual"),
    ANNUAL("Annual");

    private String value;

    private RecurrentIntervalEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @XmlValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static RecurrentIntervalEnum fromValue(String value) {
        if (value != null && value.length() != 0) {
            for (RecurrentIntervalEnum obj : getAll()) {
                if (obj.value.equals(value)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static List<RecurrentIntervalEnum> getAll() {
        return Arrays.asList(RecurrentIntervalEnum.values());
    }
}
