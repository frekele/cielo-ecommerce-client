package org.frekele.cielo.ecommerce.client.auth;

import org.frekele.cielo.ecommerce.client.testng.InvokedMethodListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

@Listeners(InvokedMethodListener.class)
public class EnvironmentCieloEnumTest {

    @Test
    public void testNewInstance() throws Exception {
        EnvironmentCieloEnum environment = EnvironmentCieloEnum.fromValue("PRODUCTION");
        assertNotEquals(null, environment);
        environment = EnvironmentCieloEnum.fromValue("SANDBOX");
        assertNotEquals(null, environment);
        environment = EnvironmentCieloEnum.fromValue(null);
        assertNull(environment);
        environment = EnvironmentCieloEnum.fromValue("");
        assertNull(environment);
        environment = EnvironmentCieloEnum.fromValue("XXXXXXXXXX");
        assertNull(environment);
    }

    @Test
    public void testGetAll() throws Exception {
        List<EnvironmentCieloEnum> listAll = EnvironmentCieloEnum.getAll();
        assertNotEquals(null, listAll);
        assertEquals(listAll.size(), 2);
        assertEquals(listAll.contains(EnvironmentCieloEnum.PRODUCTION), true);
        assertEquals(listAll.contains(EnvironmentCieloEnum.SANDBOX), true);
    }
}
