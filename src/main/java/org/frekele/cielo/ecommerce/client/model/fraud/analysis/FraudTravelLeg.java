package org.frekele.cielo.ecommerce.client.model.fraud.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceModel;

public class FraudTravelLeg implements CieloEcommerceModel {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Destination")
    private String destination;

    @JsonProperty("Origin")
    private String origin;

    public FraudTravelLeg() {
        super();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
