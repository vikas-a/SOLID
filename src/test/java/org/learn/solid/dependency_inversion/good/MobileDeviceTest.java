package org.learn.solid.dependency_inversion.good;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;


public class MobileDeviceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testAlertsWhenRainy() {
        MobileDevice iPhone = new MobileDevice();
        System.setOut(new PrintStream(outContent));
        iPhone.alertWeatherConditions("rainy");

        assertEquals("It is rainy", outContent.toString());
    }
}
