package org.frekele.cielo.ecommerce.client.repository;

import org.frekele.cielo.ecommerce.client.model.Sale;

import java.io.Serializable;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public interface CieloEcommerceRepository extends Serializable {

    public Sale createSale(Sale sale);

    public String saleGetByMerchantOrderId(String merchantOrderId);
}
