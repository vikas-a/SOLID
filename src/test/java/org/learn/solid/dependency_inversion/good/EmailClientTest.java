package org.learn.solid.dependency_inversion.good;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;


public class EmailClientTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testAlertsWhenSunny() {
        EmailClient gmail = new EmailClient();
        System.setOut(new PrintStream(outContent));
        gmail.alertWeatherConditions("sunny");

        assertEquals("It is sunny", outContent.toString());
    }
}
