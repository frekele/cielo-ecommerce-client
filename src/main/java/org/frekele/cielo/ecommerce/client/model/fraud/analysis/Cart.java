package org.frekele.cielo.ecommerce.client.model.fraud.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceModel;

public class Cart implements CieloEcommerceModel {

    private static final long serialVersionUID = 1L;

    @JsonProperty("IsGift")
    private Boolean isGift;

    @JsonProperty("ReturnsAccepted")
    private Boolean returnsAccepted;

    public Cart() {
        super();
    }

    public Boolean getGift() {
        return isGift;
    }

    public void setGift(Boolean gift) {
        isGift = gift;
    }

    public Boolean getReturnsAccepted() {
        return returnsAccepted;
    }

    public void setReturnsAccepted(Boolean returnsAccepted) {
        this.returnsAccepted = returnsAccepted;
    }
}
