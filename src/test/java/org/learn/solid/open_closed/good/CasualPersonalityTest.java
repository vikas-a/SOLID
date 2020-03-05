package org.learn.solid.open_closed.good;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CasualPersonalityTest {
    @Test
    public void testGreetsSomeoneCasually() {
        CasualPersonality cp = new CasualPersonality();
        assertEquals("Sup bro?", cp.greet());
    }
}
