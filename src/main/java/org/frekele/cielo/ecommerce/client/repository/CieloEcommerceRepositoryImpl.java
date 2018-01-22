package org.frekele.cielo.ecommerce.client.repository;

import org.frekele.cielo.ecommerce.client.auth.CieloAuth;
import org.frekele.cielo.ecommerce.client.core.Cielo;
import org.frekele.cielo.ecommerce.client.model.Sale;
import org.frekele.cielo.ecommerce.client.util.CieloUtils;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.inject.Inject;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@Cielo
public class CieloEcommerceRepositoryImpl implements CieloEcommerceRepository {

    private static final long serialVersionUID = 1L;

    private final ResteasyClient client;

    private final CieloAuth auth;

    @Inject
    public CieloEcommerceRepositoryImpl(@Cielo ResteasyClient client, @Cielo CieloAuth auth) {
        CieloUtils.throwInjection(client, auth);
        CieloUtils.throwAuth(auth);
        this.client = client;
        this.auth = auth;
    }

    public ResteasyClient getClient() {
        return client;
    }

    public CieloAuth getAuth() {
        return auth;
    }

    public CieloEcommerceApiRequestProxyClient getApiRequestProxyClient() {
        ResteasyClient client = this.getClient();
        ResteasyWebTarget webTarget = client.target(this.getAuth().getEnvironment().getTargetApiRequestUrl());
        return webTarget.proxy(CieloEcommerceApiRequestProxyClient.class);
    }

    public CieloEcommerceApiQueryProxyClient getApiQueryProxyClient() {
        ResteasyClient client = this.getClient();
        ResteasyWebTarget webTarget = client.target(this.getAuth().getEnvironment().getTargetApiQueryUrl());
        return webTarget.proxy(CieloEcommerceApiQueryProxyClient.class);
    }

    @Override
    public Sale createSale(Sale sale) {
        CieloUtils.throwObject(sale, "Sale");
        CieloEcommerceApiRequestProxyClient proxyClient = this.getApiRequestProxyClient();
        return proxyClient.createSale(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            sale);
    }

    @Override
    public String saleGetByMerchantOrderId(String merchantOrderId) {
        CieloUtils.throwObject(merchantOrderId, "merchantOrderId");
        CieloEcommerceApiQueryProxyClient proxyClient = this.getApiQueryProxyClient();
        return proxyClient.saleGetByMerchantOrderId(this.getAuth().getMerchantId(), this.getAuth().getMerchantKey(), CieloUtils.buildRequestId(),
            merchantOrderId);
    }
}
