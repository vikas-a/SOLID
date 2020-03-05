package org.learn.solid.dependency_inversion.bad;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class PhoneTest {
    @Test
    public void testGeneratesAlertString() {
        Phone phone = new Phone();
        assertEquals("It is rainy", phone.generateWeatherAlert("rainy"));
    }
}
