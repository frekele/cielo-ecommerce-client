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

    MONTHLY("Monthly", 1),
    BIMONTHLY("Bimonthly", 2),
    QUARTERLY("Quarterly", 3),
    SEMI_ANNUAL("SemiAnnual", 6),
    ANNUAL("Annual", 12);

    private String value;

    private Integer interval;

    private RecurrentIntervalEnum(String value, Integer interval) {
        this.value = value;
        this.interval = interval;
    }

    @JsonValue
    @XmlValue
    public String getValue() {
        return this.value;
    }

    public Integer getInterval() {
        return interval;
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
