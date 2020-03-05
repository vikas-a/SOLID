package org.learn.solid.dependency_inversion.bad;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmailerTest {
    @Test
    public void testGeneratesAlertString() {
        Emailer emailer = new Emailer();
        assertEquals("It is sunny", emailer.generateWeatherAlert("sunny"));
    }
}
