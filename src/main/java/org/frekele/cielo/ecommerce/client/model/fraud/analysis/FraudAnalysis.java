package org.frekele.cielo.ecommerce.client.model.fraud.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.cielo.ecommerce.client.core.CieloEcommerceModel;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public class FraudAnalysis implements CieloEcommerceModel {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Sequence")
    private String sequence;

    @JsonProperty("SequenceCriteria")
    private String sequenceCriteria;

    @JsonProperty("FingerPrintId")
    private String fingerPrintId;

    @JsonProperty("Browser")
    private Browser browser;

    @JsonProperty("Cart")
    private Cart cart;

    public FraudAnalysis() {
        super();
    }

    //TODO
}
