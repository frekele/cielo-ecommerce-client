package org.frekele.cielo.ecommerce.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceEntity;
import org.frekele.cielo.ecommerce.client.enumeration.CurrencyEnum;
import org.frekele.cielo.ecommerce.client.enumeration.ProviderEnum;
import org.frekele.cielo.ecommerce.client.enumeration.RecurrentIntervalEnum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RecurrentPayment implements CieloEcommerceEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("RecurrentPaymentId")
    private String recurrentPaymentId;

    @JsonProperty("NextRecurrency")
    private String nextRecurrency;

    @JsonProperty("StartDate")
    private String startDate;

    @JsonProperty("EndDate")
    private String endDate;

    @JsonProperty("Interval")
    private RecurrentIntervalEnum interval;

    @JsonProperty("Amount")
    private Integer amount;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("CreateDate")
    private String createDate;

    @JsonProperty("Currency")
    private CurrencyEnum currency;

    @JsonProperty("CurrentRecurrencyTry")
    private Integer currentRecurrencyTry;

    @JsonProperty("Provider")
    private ProviderEnum provider;

    @JsonProperty("RecurrencyDay")
    private Integer recurrencyDay;

    @JsonProperty("SuccessfulRecurrences")
    private Integer successfulRecurrences;

    @JsonProperty("AuthorizeNow")
    private Boolean authorizeNow;

    @JsonProperty("ReasonCode")
    private Integer reasonCode;

    @JsonProperty("ReasonMessage")
    private String reasonMessage;

    @JsonProperty("Status")
    private Integer status;

    @JsonProperty("Links")
    private List<Link> links;

    @JsonProperty("RecurrentTransactions")
    private List<RecurrentTransaction> recurrentTransactions;

    public RecurrentPayment() {
        super();
    }

    public String getRecurrentPaymentId() {
        return recurrentPaymentId;
    }

    public void setRecurrentPaymentId(String recurrentPaymentId) {
        this.recurrentPaymentId = recurrentPaymentId;
    }

    public String getNextRecurrency() {
        return nextRecurrency;
    }

    public void setNextRecurrency(String nextRecurrency) {
        this.nextRecurrency = nextRecurrency;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public RecurrentIntervalEnum getInterval() {
        return interval;
    }

    public void setInterval(RecurrentIntervalEnum interval) {
        this.interval = interval;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    public Integer getCurrentRecurrencyTry() {
        return currentRecurrencyTry;
    }

    public void setCurrentRecurrencyTry(Integer currentRecurrencyTry) {
        this.currentRecurrencyTry = currentRecurrencyTry;
    }

    public ProviderEnum getProvider() {
        return provider;
    }

    public void setProvider(ProviderEnum provider) {
        this.provider = provider;
    }

    public Integer getRecurrencyDay() {
        return recurrencyDay;
    }

    public void setRecurrencyDay(Integer recurrencyDay) {
        this.recurrencyDay = recurrencyDay;
    }

    public Integer getSuccessfulRecurrences() {
        return successfulRecurrences;
    }

    public void setSuccessfulRecurrences(Integer successfulRecurrences) {
        this.successfulRecurrences = successfulRecurrences;
    }

    public Boolean getAuthorizeNow() {
        return authorizeNow;
    }

    public void setAuthorizeNow(Boolean authorizeNow) {
        this.authorizeNow = authorizeNow;
    }

    public Integer getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Integer reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonMessage() {
        return reasonMessage;
    }

    public void setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<RecurrentTransaction> getRecurrentTransactions() {
        return recurrentTransactions;
    }

    public void setRecurrentTransactions(List<RecurrentTransaction> recurrentTransactions) {
        this.recurrentTransactions = recurrentTransactions;
    }
}
