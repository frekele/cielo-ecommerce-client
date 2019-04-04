package org.frekele.cielo.ecommerce.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.frekele.cielo.ecommerce.client.converter.deserialize.BigDecimalJsonDeserialize;
import org.frekele.cielo.ecommerce.client.converter.serialize.BigDecimalJsonSerialize;
import org.frekele.cielo.ecommerce.client.enumeration.CurrencyEnum;
import org.frekele.cielo.ecommerce.client.enumeration.PaymentTypeEnum;
import org.frekele.cielo.ecommerce.client.enumeration.ProviderEnum;
import org.frekele.cielo.ecommerce.client.model.fraud.analysis.FraudAnalysis;

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
public class Payment extends BasePayment {

    private static final long serialVersionUID = 1L;

    @JsonDeserialize(using = BigDecimalJsonDeserialize.class)
    @JsonSerialize(using = BigDecimalJsonSerialize.class)
    @JsonProperty("ServiceTaxAmount")
    private BigDecimal serviceTaxAmount;

    @JsonProperty("Installments")
    private Integer installments;

    @JsonProperty("Interest")
    private String interest;

    @JsonProperty("Capture")
    private Boolean capture;

    @JsonProperty("Authenticate")
    private Boolean authenticate;

    @JsonProperty("Recurrent")
    private Boolean recurrent;

    @JsonProperty("IsSplitted")
    private Boolean splitted;

    @JsonProperty("RecurrentPayment")
    private RecurrentPayment recurrentPayment;

    @JsonProperty("CreditCard")
    private CreditCard creditCard;

    @JsonProperty("DebitCard")
    private DebitCard debitCard;

    @JsonProperty("Wallet")
    private Wallet wallet;

    @JsonProperty("FraudAnalysis")
    private FraudAnalysis fraudAnalysis;

    @JsonProperty("Tid")
    private String tid;

    @JsonProperty("ProofOfSale")
    private String proofOfSale;

    @JsonProperty("AuthorizationCode")
    private String authorizationCode;

    @JsonProperty("SoftDescriptor")
    private String softDescriptor;

    @JsonProperty("ReturnUrl")
    private String returnUrl;

    @JsonProperty("Provider")
    private ProviderEnum provider;

    @JsonProperty("IsQrCode")
    private Boolean qrCode;

    @JsonProperty("PaymentId")
    private String paymentId;

    @JsonProperty("Type")
    private PaymentTypeEnum type;

    @JsonDeserialize(using = BigDecimalJsonDeserialize.class)
    @JsonSerialize(using = BigDecimalJsonSerialize.class)
    @JsonProperty("Amount")
    private BigDecimal amount;

    @JsonProperty("ReceivedDate")
    private String receivedDate;

    @JsonDeserialize(using = BigDecimalJsonDeserialize.class)
    @JsonSerialize(using = BigDecimalJsonSerialize.class)
    @JsonProperty("CapturedAmount")
    private BigDecimal capturedAmount;

    @JsonProperty("CapturedDate")
    private String capturedDate;

    @JsonProperty("Currency")
    private CurrencyEnum currency;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("ReturnCode")
    private String returnCode;

    @JsonProperty("ReturnMessage")
    private String returnMessage;

    @JsonProperty("Status")
    private Integer status;

    @JsonProperty("Links")
    private List<Link> links;

    @JsonProperty("ExtraDataCollection")
    private List<String> extraDataCollection;

    @JsonProperty("ExpirationDate")
    private String expirationDate;

    @JsonProperty("Url")
    private String url;

    @JsonProperty("Number")
    private String number;

    @JsonProperty("BarCodeNumber")
    private String barCodeNumber;

    @JsonProperty("DigitableLine")
    private String digitableLine;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("BoletoNumber")
    private String boletoNumber;

    @JsonProperty("Assignor")
    private String assignor;

    @JsonProperty("Demonstrative")
    private String demonstrative;

    @JsonProperty("Identification")
    private String identification;

    @JsonProperty("Instructions")
    private String instructions;

    @JsonProperty("AuthenticationUrl")
    private String authenticationUrl;

    public Payment() {
        super();
    }

    public BigDecimal getServiceTaxAmount() {
        return serviceTaxAmount;
    }

    public void setServiceTaxAmount(BigDecimal serviceTaxAmount) {
        this.serviceTaxAmount = serviceTaxAmount;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public Boolean getCapture() {
        return capture;
    }

    public void setCapture(Boolean capture) {
        this.capture = capture;
    }

    public Boolean getAuthenticate() {
        return authenticate;
    }

    public void setAuthenticate(Boolean authenticate) {
        this.authenticate = authenticate;
    }

    public Boolean getRecurrent() {
        return recurrent;
    }

    public void setRecurrent(Boolean recurrent) {
        this.recurrent = recurrent;
    }

    public Boolean getSplitted() {
        return splitted;
    }

    public void setSplitted(Boolean splitted) {
        this.splitted = splitted;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getProofOfSale() {
        return proofOfSale;
    }

    public void setProofOfSale(String proofOfSale) {
        this.proofOfSale = proofOfSale;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public ProviderEnum getProvider() {
        return provider;
    }

    public void setProvider(ProviderEnum provider) {
        this.provider = provider;
    }

    public Boolean getQrCode() {
        return qrCode;
    }

    public void setQrCode(Boolean qrCode) {
        this.qrCode = qrCode;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentTypeEnum getType() {
        return type;
    }

    public void setType(PaymentTypeEnum type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
    }

    public BigDecimal getCapturedAmount() {
        return capturedAmount;
    }

    public void setCapturedAmount(BigDecimal capturedAmount) {
        this.capturedAmount = capturedAmount;
    }

    public String getCapturedDate() {
        return capturedDate;
    }

    public void setCapturedDate(String capturedDate) {
        this.capturedDate = capturedDate;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBarCodeNumber() {
        return barCodeNumber;
    }

    public void setBarCodeNumber(String barCodeNumber) {
        this.barCodeNumber = barCodeNumber;
    }

    public String getDigitableLine() {
        return digitableLine;
    }

    public void setDigitableLine(String digitableLine) {
        this.digitableLine = digitableLine;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBoletoNumber() {
        return boletoNumber;
    }

    public void setBoletoNumber(String boletoNumber) {
        this.boletoNumber = boletoNumber;
    }

    public String getAssignor() {
        return assignor;
    }

    public void setAssignor(String assignor) {
        this.assignor = assignor;
    }

    public String getDemonstrative() {
        return demonstrative;
    }

    public void setDemonstrative(String demonstrative) {
        this.demonstrative = demonstrative;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getAuthenticationUrl() {
        return authenticationUrl;
    }

    public void setAuthenticationUrl(String authenticationUrl) {
        this.authenticationUrl = authenticationUrl;
    }

    public RecurrentPayment getRecurrentPayment() {
        return recurrentPayment;
    }

    public void setRecurrentPayment(RecurrentPayment recurrentPayment) {
        this.recurrentPayment = recurrentPayment;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public DebitCard getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public FraudAnalysis getFraudAnalysis() {
        return fraudAnalysis;
    }

    public void setFraudAnalysis(FraudAnalysis fraudAnalysis) {
        this.fraudAnalysis = fraudAnalysis;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<String> getExtraDataCollection() {
        return extraDataCollection;
    }

    public void setExtraDataCollection(List<String> extraDataCollection) {
        this.extraDataCollection = extraDataCollection;
    }
}
