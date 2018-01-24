package org.frekele.cielo.ecommerce.client.model.fraud.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FraudAnalysis implements CieloEcommerceEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Sequence")
    private String sequence;

    @JsonProperty("SequenceCriteria")
    private String sequenceCriteria;

    @JsonProperty("FingerPrintId")
    private String fingerPrintId;

    @JsonProperty("Browser")
    private FraudBrowser browser;

    @JsonProperty("Cart")
    private FraudCart cart;

    @JsonProperty("Items")
    private List<FraudItem> items;

    @JsonProperty("MerchantDefinedFields")
    private List<FraudMerchantDefinedField> merchantDefinedFields;

    @JsonProperty("Shipping")
    private FraudShipping shipping;

    @JsonProperty("Travel")
    private FraudTravel travel;

    public FraudAnalysis() {
        super();
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getSequenceCriteria() {
        return sequenceCriteria;
    }

    public void setSequenceCriteria(String sequenceCriteria) {
        this.sequenceCriteria = sequenceCriteria;
    }

    public String getFingerPrintId() {
        return fingerPrintId;
    }

    public void setFingerPrintId(String fingerPrintId) {
        this.fingerPrintId = fingerPrintId;
    }

    public FraudBrowser getBrowser() {
        return browser;
    }

    public void setBrowser(FraudBrowser browser) {
        this.browser = browser;
    }

    public FraudCart getCart() {
        return cart;
    }

    public void setCart(FraudCart cart) {
        this.cart = cart;
    }

    public List<FraudItem> getItems() {
        return items;
    }

    public void setItems(List<FraudItem> items) {
        this.items = items;
    }

    public List<FraudMerchantDefinedField> getMerchantDefinedFields() {
        return merchantDefinedFields;
    }

    public void setMerchantDefinedFields(List<FraudMerchantDefinedField> merchantDefinedFields) {
        this.merchantDefinedFields = merchantDefinedFields;
    }

    public FraudShipping getShipping() {
        return shipping;
    }

    public void setShipping(FraudShipping shipping) {
        this.shipping = shipping;
    }

    public FraudTravel getTravel() {
        return travel;
    }

    public void setTravel(FraudTravel travel) {
        this.travel = travel;
    }
}
