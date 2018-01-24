package org.frekele.cielo.ecommerce.client.model.fraud.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FraudBrowser implements CieloEcommerceEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("CookiesAccepted")
    private Boolean cookiesAccepted;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("HostName")
    private String hostName;

    @JsonProperty("IpAddress")
    private String ipAddress;

    @JsonProperty("Type")
    private String type;

    public FraudBrowser() {
        super();
    }

    public Boolean getCookiesAccepted() {
        return cookiesAccepted;
    }

    public void setCookiesAccepted(Boolean cookiesAccepted) {
        this.cookiesAccepted = cookiesAccepted;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
