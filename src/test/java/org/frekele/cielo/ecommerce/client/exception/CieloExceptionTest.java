package org.frekele.cielo.ecommerce.client.exception;

import org.frekele.cielo.ecommerce.client.testng.InvokedMethodListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(InvokedMethodListener.class)
public class CieloExceptionTest {

    String msg = "Error Message";

    IOException cause = new IOException("IO error");

    @Test(expectedExceptions = CieloException.class)
    public void testConstructorWithMessage() throws Exception {
        throw new CieloException(msg);
    }

    @Test(expectedExceptions = CieloException.class)
    public void testConstructorWithCause() throws Exception {
        throw new CieloException(cause);
    }

    @Test(expectedExceptions = CieloException.class)
    public void testConstructorWithMessageAndCause() throws Exception {
        throw new CieloException(msg, cause);
    }

    @Test(expectedExceptions = CieloException.class)
    public void testConstructorWithMessageAndCauseAndMore() throws Exception {
        throw new CieloException(msg, cause, true, true);
    }
}
