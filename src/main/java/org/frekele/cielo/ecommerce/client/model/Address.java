package org.frekele.cielo.ecommerce.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

    @JsonProperty("Street")
    private String street;

    @JsonProperty("Number")
    private String number;

    @JsonProperty("Complement")
    private String complement;

    @JsonProperty("ZipCode")
    private String zipCode;

    @JsonProperty("City")
    private String city;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("District")
    private String district;

    public Address() {
        super();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}