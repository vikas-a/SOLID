package org.learn.solid.open_closed.good;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


class MockPersonality implements Personality {
    public String greet() {
        return "foo";
    }
}

public class GreeterTest {
    @Test
    public void testGreetsSomeone() {
        MockPersonality mockPersonality = new MockPersonality();
        Greeter greeter = new Greeter(mockPersonality);

        assertEquals("foo", greeter.greet());
    }
}
