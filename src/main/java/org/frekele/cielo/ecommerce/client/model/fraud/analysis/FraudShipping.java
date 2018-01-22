package org.frekele.cielo.ecommerce.client.model.fraud.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceModel;
import org.frekele.cielo.ecommerce.client.enumeration.fraud.analysis.FraudShippingMethodEnum;

public class FraudShipping implements CieloEcommerceModel {

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
