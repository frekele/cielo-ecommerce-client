package org.frekele.cielo.ecommerce.client.auth;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CieloAuthTest {

    @Test
    public void testNewInstance() throws Exception {
        String merchantId = "ac8cf29b-c3dd-49fa-a358-2f96aa7aa89a";
        String merchantKey = "QWIERUOIRTETRJHDSFASLVMFBKTRGWPOQAK";
        EnvironmentCieloEnum environment = EnvironmentCieloEnum.SANDBOX;

        CieloAuth auth = new CieloAuth(merchantId, merchantKey, environment);

        assertNotNull(auth);
        assertEquals(merchantId, auth.getMerchantId());
        assertEquals(merchantKey, auth.getMerchantKey());
        assertEquals(environment, auth.getEnvironment());
    }

    @Test
    public void testNewInstance2() throws Exception {
        String merchantId = "ac8cf29b-c3dd-49fa-a358-2f96aa7aa89a";
        String merchantKey = "QWIERUOIRTETRJHDSFASLVMFBKTRGWPOQAK";
        String environment = "SANDBOX";

        CieloAuth auth = new CieloAuth(merchantId, merchantKey, environment);

        assertNotNull(auth);
        assertEquals(merchantId, auth.getMerchantId());
        assertEquals(merchantKey, auth.getMerchantKey());
        assertNotNull(auth.getEnvironment());
        assertEquals(environment, auth.getEnvironment().getValue());

        auth = CieloAuth.newBuilder()
            .withMerchantId(merchantId)
            .withMerchantKey(merchantKey)
            .withEnvironment(environment)
            .build();

        assertNotNull(auth);
        assertEquals(merchantId, auth.getMerchantId());
        assertEquals(merchantKey, auth.getMerchantKey());
        assertNotNull(auth.getEnvironment());
        assertEquals(environment, auth.getEnvironment().getValue());
    }
}
