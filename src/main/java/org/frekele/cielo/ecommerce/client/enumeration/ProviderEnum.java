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
public enum ProviderEnum {

    CIELO("Cielo"),
    BRADESCO("Bradesco"),
    BANCO_DO_BRASIL("BancoDoBrasil"),
    BRADESCO_2("Bradesco2"),
    BANCO_DO_BRASIL_2("BancoDoBrasil2"),
    SIMULADO("Simulado");

    private String value;

    private ProviderEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @XmlValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static ProviderEnum fromValue(String value) {
        if (value != null && value.length() != 0) {
            for (ProviderEnum obj : getAll()) {
                if (obj.value.equals(value)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static List<ProviderEnum> getAll() {
        return Arrays.asList(ProviderEnum.values());
    }
}
