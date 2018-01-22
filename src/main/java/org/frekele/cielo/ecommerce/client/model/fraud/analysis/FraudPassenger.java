package org.frekele.cielo.ecommerce.client.model.fraud.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceModel;

public class FraudPassenger implements CieloEcommerceModel {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Identity")
    private String identity;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Rating")
    private String rating;

    @JsonProperty("Phone")
    private String phone;

    @JsonProperty("Status")
    private String status;

    public FraudPassenger() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
