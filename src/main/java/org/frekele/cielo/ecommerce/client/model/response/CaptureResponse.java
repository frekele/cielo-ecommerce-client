package org.frekele.cielo.ecommerce.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceEntity;
import org.frekele.cielo.ecommerce.client.model.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CaptureResponse implements CieloEcommerceEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("ReasonCode")
    private String reasonCode;

    @JsonProperty("ReasonMessage")
    private String reasonMessage;

    @JsonProperty("ProviderReturnCode")
    private String providerReturnCode;

    @JsonProperty("ProviderReturnMessage")
    private String providerReturnMessage;

    @JsonProperty("ReturnCode")
    private String returnCode;

    @JsonProperty("ReturnMessage")
    private String returnMessage;

    @JsonProperty("AuthenticationUrl")
    private String authenticationUrl;

    @JsonProperty("Links")
    private List<Link> links;

    public CaptureResponse() {
        super();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getProviderReturnCode() {
        return providerReturnCode;
    }

    public void setProviderReturnCode(String providerReturnCode) {
        this.providerReturnCode = providerReturnCode;
    }

    public String getProviderReturnMessage() {
        return providerReturnMessage;
    }

    public void setProviderReturnMessage(String providerReturnMessage) {
        this.providerReturnMessage = providerReturnMessage;
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

    public String getAuthenticationUrl() {
        return authenticationUrl;
    }

    public void setAuthenticationUrl(String authenticationUrl) {
        this.authenticationUrl = authenticationUrl;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
