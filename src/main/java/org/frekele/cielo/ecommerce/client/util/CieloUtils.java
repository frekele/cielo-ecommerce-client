package org.frekele.cielo.ecommerce.client.util;

import org.frekele.cielo.ecommerce.client.auth.CieloAuth;
import org.frekele.cielo.ecommerce.client.exception.CieloException;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public final class CieloUtils {

    public static void throwInjection(Object... objects) {
        for (Object obj : objects) {
            if (obj == null) {
                String msg = "Parameters in the constructor were not injected!";
                throw new CieloException(msg);
            }
        }
    }

    public static void throwAuth(CieloAuth auth) {
        if (auth == null) {
            throw new CieloException("CieloAuth can not be Null!");
        }
        if (auth.getMerchantId() == null) {
            throw new CieloException("MerchantId can not be Null!");
        }
        if (auth.getMerchantId().trim().isEmpty()) {
            throw new CieloException("MerchantId can not be Empty!");
        }
        if (auth.getMerchantKey() == null) {
            throw new CieloException("MerchantKey can not be Null!");
        }
        if (auth.getMerchantKey().trim().isEmpty()) {
            throw new CieloException("MerchantKey can not be Empty!");
        }
        if (auth.getEnvironment() == null) {
            throw new CieloException("Environment can not be Null!");
        }
    }

    public static void throwObject(Object obj, String objectName) {
        if (obj == null || obj.toString().trim().isEmpty()) {
            throw new CieloException("" + objectName + " can not be Null or Empty!");
        }
    }
}
