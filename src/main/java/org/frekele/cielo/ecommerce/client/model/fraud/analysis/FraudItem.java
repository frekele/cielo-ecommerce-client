package org.frekele.cielo.ecommerce.client.model.fraud.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.frekele.cielo.ecommerce.client.converter.deserialize.BigDecimalJsonDeserialize;
import org.frekele.cielo.ecommerce.client.converter.serialize.BigDecimalJsonSerialize;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceEntity;
import org.frekele.cielo.ecommerce.client.enumeration.fraud.analysis.FraudHostHedgeEnum;
import org.frekele.cielo.ecommerce.client.enumeration.fraud.analysis.FraudNonSensicalHedgeEnum;
import org.frekele.cielo.ecommerce.client.enumeration.fraud.analysis.FraudObscenitiesHedgeEnum;
import org.frekele.cielo.ecommerce.client.enumeration.fraud.analysis.FraudPhoneHedgeEnum;
import org.frekele.cielo.ecommerce.client.enumeration.fraud.analysis.FraudRiskEnum;
import org.frekele.cielo.ecommerce.client.enumeration.fraud.analysis.FraudTimeHedgeEnum;
import org.frekele.cielo.ecommerce.client.enumeration.fraud.analysis.FraudVelocityHedgeEnum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FraudItem implements CieloEcommerceEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("GiftCategory")
    private String giftCategory;

    @JsonProperty("HostHedge")
    private FraudHostHedgeEnum hostHedge;

    @JsonProperty("NonSensicalHedge")
    private FraudNonSensicalHedgeEnum nonSensicalHedge;

    @JsonProperty("ObscenitiesHedge")
    private FraudObscenitiesHedgeEnum obscenitiesHedge;

    @JsonProperty("PhoneHedge")
    private FraudPhoneHedgeEnum phoneHedge;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Quantity")
    private Integer quantity;

    @JsonProperty("Sku")
    private String sku;

    @JsonDeserialize(using = BigDecimalJsonDeserialize.class)
    @JsonSerialize(using = BigDecimalJsonSerialize.class)
    @JsonProperty("UnitPrice")
    private BigDecimal unitPrice;

    @JsonProperty("Risk")
    private FraudRiskEnum risk;

    @JsonProperty("TimeHedge")
    private FraudTimeHedgeEnum timeHedge;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("VelocityHedge")
    private FraudVelocityHedgeEnum velocityHedge;

    @JsonProperty("Passenger")
    private FraudPassenger passenger;

    @JsonProperty("MerchantDefinedFields")
    private List<FraudMerchantDefinedField> merchantDefinedFields;

    public FraudItem() {
        super();
    }

    public String getGiftCategory() {
        return giftCategory;
    }

    public void setGiftCategory(String giftCategory) {
        this.giftCategory = giftCategory;
    }

    public FraudHostHedgeEnum getHostHedge() {
        return hostHedge;
    }

    public void setHostHedge(FraudHostHedgeEnum hostHedge) {
        this.hostHedge = hostHedge;
    }

    public FraudNonSensicalHedgeEnum getNonSensicalHedge() {
        return nonSensicalHedge;
    }

    public void setNonSensicalHedge(FraudNonSensicalHedgeEnum nonSensicalHedge) {
        this.nonSensicalHedge = nonSensicalHedge;
    }

    public FraudObscenitiesHedgeEnum getObscenitiesHedge() {
        return obscenitiesHedge;
    }

    public void setObscenitiesHedge(FraudObscenitiesHedgeEnum obscenitiesHedge) {
        this.obscenitiesHedge = obscenitiesHedge;
    }

    public FraudPhoneHedgeEnum getPhoneHedge() {
        return phoneHedge;
    }

    public void setPhoneHedge(FraudPhoneHedgeEnum phoneHedge) {
        this.phoneHedge = phoneHedge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public FraudRiskEnum getRisk() {
        return risk;
    }

    public void setRisk(FraudRiskEnum risk) {
        this.risk = risk;
    }

    public FraudTimeHedgeEnum getTimeHedge() {
        return timeHedge;
    }

    public void setTimeHedge(FraudTimeHedgeEnum timeHedge) {
        this.timeHedge = timeHedge;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FraudVelocityHedgeEnum getVelocityHedge() {
        return velocityHedge;
    }

    public void setVelocityHedge(FraudVelocityHedgeEnum velocityHedge) {
        this.velocityHedge = velocityHedge;
    }

    public FraudPassenger getPassenger() {
        return passenger;
    }

    public void setPassenger(FraudPassenger passenger) {
        this.passenger = passenger;
    }

    public List<FraudMerchantDefinedField> getMerchantDefinedFields() {
        return merchantDefinedFields;
    }

    public void setMerchantDefinedFields(List<FraudMerchantDefinedField> merchantDefinedFields) {
        this.merchantDefinedFields = merchantDefinedFields;
    }
}
