package org.frekele.cielo.ecommerce.client.util;

import org.frekele.cielo.ecommerce.client.auth.CieloAuth;
import org.frekele.cielo.ecommerce.client.auth.EnvironmentCieloEnum;
import org.frekele.cielo.ecommerce.client.exception.CieloException;
import org.frekele.cielo.ecommerce.client.testng.InvokedMethodListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.math.BigDecimal;

@Listeners(InvokedMethodListener.class)
public class CieloUtilsTest {

    String merchantId = "ac8cf29b-c3dd-49fa-a358-2f96aa7aa89a";

    String merchantKey = "QWIERUOIRTETRJHDSFASLVMFBKTRGWPOQAK";

    EnvironmentCieloEnum environmentNull = null;

    EnvironmentCieloEnum environment = EnvironmentCieloEnum.SANDBOX;

    @Test
    public void testThrowInjection() throws Exception {
        CieloUtils c = new CieloUtils();
        CieloUtils.throwInjection("");
        CieloUtils.throwInjection("a");
        CieloUtils.throwInjection("a", "b");
        CieloUtils.throwInjection("a", "b", "c", 1, 3, 5);
        CieloUtils.throwInjection("a", "b", "c", 1, 3, 5, new BigDecimal(0.0));
    }

    @Test
    public void testThrowInjection2() throws Exception {
        CieloUtils.throwInjection();
    }

    @Test(expectedExceptions = {CieloException.class})
    public void testThrowInjectionWithError() throws Exception {
        String val = null;
        CieloUtils.throwInjection(val);
    }

    @Test(expectedExceptions = {CieloException.class})
    public void testThrowInjectionWithError2() throws Exception {
        String val1 = "";
        BigDecimal val2 = null;
        CieloUtils.throwInjection(val1, val2);
    }

    @Test
    public void testThrowAuth() throws Exception {
        CieloAuth auth = new CieloAuth(merchantId, merchantKey, environment);
        CieloUtils.throwAuth(auth);
    }

    @Test(expectedExceptions = {CieloException.class})
    public void testThrowAuthWithError() throws Exception {
        CieloUtils.throwAuth(null);
    }

    @Test(expectedExceptions = {CieloException.class})
    public void testThrowAuthWithError2() throws Exception {

        CieloAuth auth = new CieloAuth(null, null, environmentNull);
        CieloUtils.throwAuth(auth);
    }

    @Test(expectedExceptions = {CieloException.class})
    public void testThrowAuthWithError3() throws Exception {
        CieloAuth auth = new CieloAuth("", null, environmentNull);
        CieloUtils.throwAuth(auth);
    }

    @Test(expectedExceptions = {CieloException.class})
    public void testThrowAuthWithError4() throws Exception {
        CieloAuth auth = new CieloAuth(merchantId, null, environmentNull);
        CieloUtils.throwAuth(auth);
    }

    @Test(expectedExceptions = {CieloException.class})
    public void testThrowAuthWithError5() throws Exception {
        CieloAuth auth = new CieloAuth(merchantId, "", environmentNull);
        CieloUtils.throwAuth(auth);
    }

    @Test(expectedExceptions = {CieloException.class})
    public void testThrowAuthWithError6() throws Exception {
        CieloAuth auth = new CieloAuth(merchantId, merchantKey, environmentNull);
        CieloUtils.throwAuth(auth);
    }

    @Test
    public void testThrowObject() throws Exception {
        CieloUtils.throwObject("xxxxx", "value");
    }

    @Test(expectedExceptions = {CieloException.class})
    public void testThrowObjectWithError() throws Exception {
        CieloUtils.throwObject(null, "value");
    }

    @Test(expectedExceptions = {CieloException.class})
    public void testThrowObjectWithError2() throws Exception {
        CieloUtils.throwObject("", "value");
    }
}
