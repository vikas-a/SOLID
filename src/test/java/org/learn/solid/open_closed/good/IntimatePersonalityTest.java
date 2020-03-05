package org.learn.solid.open_closed.good;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class IntimatePersonalityTest {
    @Test
    public void testGreetsSomeoneIntimately() {
        IntimatePersonality ip = new IntimatePersonality();
        assertEquals("Hello Darling!", ip.greet());
    }
}
