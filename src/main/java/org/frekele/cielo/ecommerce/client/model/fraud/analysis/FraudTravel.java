package org.frekele.cielo.ecommerce.client.model.fraud.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.frekele.cielo.ecommerce.client.converter.deserialize.OffsetDateTimeJsonDeserialize;
import org.frekele.cielo.ecommerce.client.converter.serialize.OffsetDateTimeJsonSerialize;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FraudTravel implements CieloEcommerceEntity {

    private static final long serialVersionUID = 1L;

    @JsonDeserialize(using = OffsetDateTimeJsonDeserialize.class)
    @JsonSerialize(using = OffsetDateTimeJsonSerialize.class)
    @JsonProperty("DepartureTime")
    private OffsetDateTime departureTime;

    @JsonProperty("JourneyType")
    private String journeyType;

    @JsonProperty("Route")
    private String route;

    @JsonProperty("Legs")
    private List<FraudTravelLeg> legs;

    public FraudTravel() {
        super();
    }

    public OffsetDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(OffsetDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getJourneyType() {
        return journeyType;
    }

    public void setJourneyType(String journeyType) {
        this.journeyType = journeyType;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public List<FraudTravelLeg> getLegs() {
        return legs;
    }

    public void setLegs(List<FraudTravelLeg> legs) {
        this.legs = legs;
    }
}
