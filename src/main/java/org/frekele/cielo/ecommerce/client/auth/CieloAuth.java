package org.frekele.cielo.ecommerce.client.auth;

import java.io.Serializable;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public final class CieloAuth implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String merchantId;

    private final String merchantKey;

    private final EnvironmentCieloEnum environment;

    public CieloAuth(String merchantId, String merchantKey, EnvironmentCieloEnum environment) {
        this.merchantId = merchantId;
        this.merchantKey = merchantKey;
        this.environment = environment;
    }

    public CieloAuth(String merchantId, String merchantKey, String environment) {
        this.merchantId = merchantId;
        this.merchantKey = merchantKey;
        this.environment = EnvironmentCieloEnum.fromValue(environment);
    }

    public String getMerchantId() {
        return merchantId;
    }

    public String getMerchantKey() {
        return merchantKey;
    }

    public EnvironmentCieloEnum getEnvironment() {
        return environment;
    }
}
