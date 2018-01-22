package org.frekele.cielo.ecommerce.client.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.frekele.cielo.ecommerce.client.auth.CieloAuth;
import org.frekele.cielo.ecommerce.client.auth.EnvironmentCieloEnum;
import org.frekele.cielo.ecommerce.client.resteasy.LoggingFilter;
import org.frekele.cielo.ecommerce.client.testng.InvokedMethodListener;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@Listeners(InvokedMethodListener.class)
public class CieloEcommerceRepositoryIT {

    private CieloEcommerceRepository repository;

    private ObjectMapper mapper = new ObjectMapper();

    @BeforeClass
    public void init() throws Exception {
        MockitoAnnotations.initMocks(this);
        String merchantId = System.getenv("CIELO_ECOMMERCE_MERCHANT_ID");
        String merchantKey = System.getenv("CIELO_ECOMMERCE_MERCHANT_KEY");

        EnvironmentCieloEnum environment = EnvironmentCieloEnum.SANDBOX;
        CieloAuth auth = CieloAuth.newBuilder()
            .withMerchantId(merchantId)
            .withMerchantKey(merchantKey)
            .withEnvironment(environment)
            .build();
        ResteasyClient client = new ResteasyClientBuilder()
            .register(LoggingFilter.class)
            .build();
        repository = new CieloEcommerceRepositoryImpl(client, auth);
    }

    @AfterMethod
    public void afterMethod() throws Exception {
        //After Method Sleep 1 seg, for prevent (HTTP 429 Unknown Code).
        this.sleep(1);
    }

    @Test
    public void testSaleGetByMerchantOrderId() throws Exception {
        String result = repository.saleGetByMerchantOrderId("2014111703");
        System.out.println(result);
    }

    private void sleep(long seconds) {
        try {
            long millis = seconds * 1000;
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            // Restore interrupted state...
            Thread.currentThread().interrupt();
        }
    }
}
