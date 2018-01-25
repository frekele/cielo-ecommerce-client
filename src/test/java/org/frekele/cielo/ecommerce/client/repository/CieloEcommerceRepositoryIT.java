package org.frekele.cielo.ecommerce.client.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.frekele.cielo.ecommerce.client.auth.CieloAuth;
import org.frekele.cielo.ecommerce.client.auth.EnvironmentCieloEnum;
import org.frekele.cielo.ecommerce.client.enumeration.CardBrandEnum;
import org.frekele.cielo.ecommerce.client.enumeration.PaymentTypeEnum;
import org.frekele.cielo.ecommerce.client.filter.RequestLoggingFilter;
import org.frekele.cielo.ecommerce.client.filter.ResponseLoggingFilter;
import org.frekele.cielo.ecommerce.client.model.CardToken;
import org.frekele.cielo.ecommerce.client.model.CreditCard;
import org.frekele.cielo.ecommerce.client.model.Customer;
import org.frekele.cielo.ecommerce.client.model.Payment;
import org.frekele.cielo.ecommerce.client.model.Sale;
import org.frekele.cielo.ecommerce.client.testng.InvokedMethodListener;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.math.BigDecimal;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@Listeners(InvokedMethodListener.class)
public class CieloEcommerceRepositoryIT {

    private CieloEcommerceRepository repository;

    private ObjectMapper mapper = new ObjectMapper();

    @BeforeClass
    public void init() throws Exception {
        MockitoAnnotations.initMocks(this);
        String merchantId = System.getenv("CIELO_ECOMMERCE_MERCHANT_ID");
        String merchantKey = System.getenv("CIELO_ECOMMERCE_MERCHANT_KEY");

        EnvironmentCieloEnum environment = EnvironmentCieloEnum.SANDBOX;
        CieloAuth auth = CieloAuth.newBuilder()
            .withMerchantId(merchantId)
            .withMerchantKey(merchantKey)
            .withEnvironment(environment)
            .build();
        ResteasyClient client = new ResteasyClientBuilder()
            .register(RequestLoggingFilter.class)
            .register(ResponseLoggingFilter.class)
            .build();
        repository = new CieloEcommerceRepositoryImpl(client, auth);
    }

    @AfterMethod
    public void afterMethod() throws Exception {
        //After Method Sleep 1 seg, for prevent (HTTP 429 Unknown Code).
        this.sleep(1);
    }

    @Test
    public void testCreateSale() throws Exception {
        Sale sale = new Sale();
        sale.setMerchantOrderId("2014111704");
        Customer customer = new Customer();
        customer.setName("Comprador crédito simples");
        sale.setCustomer(customer);

        Payment payment = new Payment();
        payment.setType(PaymentTypeEnum.CREDIT_CARD);
        payment.setAmount(BigDecimal.valueOf(157.00));
        payment.setInstallments(1);
        payment.setSoftDescriptor("123456789ABCD");
        CreditCard creditCard = new CreditCard();
        creditCard.setCardNumber("1234123412341231");
        creditCard.setHolder("Teste Holder");
        creditCard.setExpirationDate("12/2030");
        creditCard.setSecurityCode("123");
        creditCard.setBrand(CardBrandEnum.VISA);
        payment.setCreditCard(creditCard);
        sale.setPayment(payment);

        //System.out.println("new Sale");
        //System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sale));

        Sale saleResult = repository.createSale(sale);
        System.out.println("saleResult");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(saleResult));
    }

    @Test
    public void testCreateCardToken() throws Exception {
        CardToken cardToken = new CardToken();
        cardToken.setCustomerName("Comprador Teste Cielo");
        cardToken.setCardNumber("4532117080573700");
        cardToken.setHolder("Comprador T Cielo");
        cardToken.setExpirationDate("12/2018");
        cardToken.setBrand(CardBrandEnum.VISA);

        //System.out.println("new CardToken");
        //System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cardToken));

        CardToken cardTokenResult = repository.createCardToken(cardToken);
        System.out.println("cardTokenResult");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cardTokenResult));
    }

    @Test
    public void testUpdateRecurrentSaleCustomer() throws Exception {
    }

    @Test
    public void testUpdateRecurrentSaleEndDate() throws Exception {
    }

    @Test
    public void testUpdateRecurrentSaleInterval() throws Exception {
    }

    @Test
    public void testUpdateRecurrentSaleDay() throws Exception {
    }

    @Test
    public void testUpdateRecurrentSaleAmount() throws Exception {
    }

    @Test
    public void testUpdateRecurrentSaleNextPaymentDate() throws Exception {
    }

    @Test
    public void testUpdateRecurrentSalePayment() throws Exception {
    }

    @Test
    public void testDeactivateRecurrentSale() throws Exception {
    }

    @Test
    public void testReactivateRecurrentSale() throws Exception {
    }

    @Test
    public void testCaptureSale() throws Exception {
    }

    @Test
    public void testCaptureSale1() throws Exception {
    }

    @Test
    public void testCaptureSale2() throws Exception {
    }

    @Test
    public void testCancelSale() throws Exception {
    }

    @Test
    public void testCancelSale1() throws Exception {
    }

    @Test
    public void testCancelSaleByMerchantOrderId() throws Exception {
    }

    @Test
    public void testCancelSaleByMerchantOrderId1() throws Exception {
    }

    @Test
    public void testFindSale() throws Exception {
    }

    @Test
    public void testFindPayments() throws Exception {
    }

    private void sleep(long seconds) {
        try {
            long millis = seconds * 1000;
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            // Restore interrupted state...
            Thread.currentThread().interrupt();
        }
    }
}
