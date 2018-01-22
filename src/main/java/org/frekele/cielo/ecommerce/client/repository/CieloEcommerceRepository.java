package org.frekele.cielo.ecommerce.client.repository;

import java.io.Serializable;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public interface CieloEcommerceRepository extends Serializable {

    public String saleGetByMerchantOrderId(String merchantOrderId);
}
