package org.frekele.cielo.ecommerce.client.model.recurrent;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceModel;
import org.frekele.cielo.ecommerce.client.model.Customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RecurrentSale implements CieloEcommerceModel {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Customer")
    private Customer customer;

    @JsonProperty("RecurrentPayment")
    private RecurrentPayment recurrentPayment;

    public RecurrentSale() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RecurrentPayment getRecurrentPayment() {
        return recurrentPayment;
    }

    public void setRecurrentPayment(RecurrentPayment recurrentPayment) {
        this.recurrentPayment = recurrentPayment;
    }
}
