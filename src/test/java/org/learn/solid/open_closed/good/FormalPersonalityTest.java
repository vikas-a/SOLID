package org.learn.solid.open_closed.good;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FormalPersonalityTest {
    @Test
    public void testGreetsSomeoneFormally() {
        FormalPersonality fp = new FormalPersonality();
        assertEquals("Good evening, sir.", fp.greet());
    }
}
