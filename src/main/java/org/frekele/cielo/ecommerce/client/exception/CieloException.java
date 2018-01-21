package org.frekele.cielo.ecommerce.client.exception;

import java.io.Serializable;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public class CieloException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;

    public CieloException(String message) {
        super(message);
    }

    public CieloException(Throwable cause) {
        super(cause);
    }

    public CieloException(String message, Throwable cause) {
        super(message, cause);
    }

    public CieloException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
