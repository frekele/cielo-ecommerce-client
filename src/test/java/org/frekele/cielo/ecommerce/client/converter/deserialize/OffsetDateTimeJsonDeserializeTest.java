package org.frekele.cielo.ecommerce.client.converter.deserialize;

import com.fasterxml.jackson.core.JsonParser;
import org.frekele.cielo.ecommerce.client.testng.InvokedMethodListener;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.mockito.Mockito.*;
import static org.testng.Assert.*;

@Listeners(InvokedMethodListener.class)
public class OffsetDateTimeJsonDeserializeTest {

    @Mock
    private JsonParser jsonParser;

    @BeforeClass
    public void beforeClass() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDeserialize() throws Exception {
        OffsetDateTimeJsonDeserialize jsonDeserialize = new OffsetDateTimeJsonDeserialize();
        assertNotNull(jsonDeserialize);

        OffsetDateTime resultValue = jsonDeserialize.deserialize(null, null);
        assertNull(resultValue);

        when(jsonParser.readValueAs(String.class)).thenReturn(null);
        resultValue = jsonDeserialize.deserialize(jsonParser, null);
        assertNull(resultValue);

        String stringValue = "2018-01-13T12:51:34Z";
        OffsetDateTime expected = OffsetDateTime.parse(stringValue, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        when(jsonParser.readValueAs(String.class)).thenReturn(stringValue);
        resultValue = jsonDeserialize.deserialize(jsonParser, null);
        assertNotNull(resultValue);
        assertEquals(expected, resultValue);
    }
}
