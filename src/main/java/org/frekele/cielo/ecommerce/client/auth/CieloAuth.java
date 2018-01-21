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

    private CieloAuth(Builder builder) {
        merchantId = builder.merchantId;
        merchantKey = builder.merchantKey;
        environment = builder.environment;
    }

    public static Builder newBuilder() {
        return new Builder();
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

    public static final class Builder {

        private String merchantId;

        private String merchantKey;

        private EnvironmentCieloEnum environment;

        private Builder() {
        }

        public Builder withMerchantId(String val) {
            merchantId = val;
            return this;
        }

        public Builder withMerchantKey(String val) {
            merchantKey = val;
            return this;
        }

        public Builder withEnvironment(EnvironmentCieloEnum val) {
            environment = val;
            return this;
        }

        public Builder withEnvironment(String val) {
            return withEnvironment(EnvironmentCieloEnum.fromValue(val));
        }

        public CieloAuth build() {
            return new CieloAuth(this);
        }
    }
}
