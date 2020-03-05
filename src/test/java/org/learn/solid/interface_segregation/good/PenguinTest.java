package org.learn.solid.interface_segregation.good;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class PenguinTest {
    @Test
    public void testItCanSwim() {
        Penguin penguin = new Penguin(5);
        penguin.swim();
        assertEquals("in the water", penguin.currentLocation);
    }

    @Test
    public void testItLosesFeathersQuickly() {
        Penguin penguin = new Penguin(5);
        penguin.molt();
        assertEquals(1, penguin.numberOfFeathers);
    }
}
