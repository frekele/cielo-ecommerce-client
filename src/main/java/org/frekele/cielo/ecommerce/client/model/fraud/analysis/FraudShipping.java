package org.frekele.cielo.ecommerce.client.model.fraud.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceEntity;
import org.frekele.cielo.ecommerce.client.enumeration.fraud.analysis.FraudShippingMethodEnum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FraudShipping implements CieloEcommerceEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Addressee")
    private String addressee;

    @JsonProperty("Method")
    private FraudShippingMethodEnum method;

    @JsonProperty("Phone")
    private String phone;

    public FraudShipping() {
        super();
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public FraudShippingMethodEnum getMethod() {
        return method;
    }

    public void setMethod(FraudShippingMethodEnum method) {
        this.method = method;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
