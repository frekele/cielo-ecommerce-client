package org.frekele.cielo.ecommerce.client.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceModel;
import org.frekele.cielo.ecommerce.client.model.BasePayment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentQueryRequest implements CieloEcommerceModel {

    private static final long serialVersionUID = 1L;

    @JsonProperty("ReasonCode")
    private String reasonCode;

    @JsonProperty("ReasonMessage")
    private String reasonMessage;

    @JsonProperty("Payments")
    private List<BasePayment> payments;

    public PaymentQueryRequest() {
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonMessage() {
        return reasonMessage;
    }

    public void setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
    }

    public List<BasePayment> getPayments() {
        return payments;
    }

    public void setPayments(List<BasePayment> payments) {
        this.payments = payments;
    }
}
