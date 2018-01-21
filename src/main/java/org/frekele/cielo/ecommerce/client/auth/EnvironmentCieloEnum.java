package org.frekele.cielo.ecommerce.client.auth;

import java.util.Arrays;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public enum EnvironmentCieloEnum {

    PRODUCTION("PRODUCTION", "https://api.cieloecommerce.cielo.com.br", "https://apiquery.cieloecommerce.cielo.com.br"),
    SANDBOX("SANDBOX", "https://apisandbox.cieloecommerce.cielo.com.br", "https://apiquerysandbox.cieloecommerce.cielo.com.br");

    private String value;

    private String targetRequestUrl;

    private String targetQueryUrl;

    EnvironmentCieloEnum(String value, String targetRequestUrl, String targetQueryUrl) {
        this.value = value;
        this.targetRequestUrl = targetRequestUrl;
        this.targetQueryUrl = targetQueryUrl;
    }

    public String getTargetRequestUrl() {
        return targetRequestUrl;
    }

    public String getTargetQueryUrl() {
        return targetQueryUrl;
    }

    public String getValue() {
        return value;
    }

    public static EnvironmentCieloEnum fromValue(String value) {
        if (value != null && value.length() != 0) {
            for (EnvironmentCieloEnum obj : getAll()) {
                if (obj.getValue().equals(value)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static List<EnvironmentCieloEnum> getAll() {
        return Arrays.asList(EnvironmentCieloEnum.values());
    }

}
