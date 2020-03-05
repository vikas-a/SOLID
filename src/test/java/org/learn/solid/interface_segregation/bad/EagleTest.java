package org.learn.solid.interface_segregation.bad;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class EagleTest {
    @Test
    public void testItFliesInTheAir() {
        Eagle eagle = new Eagle(5);
        eagle.fly();
        assertEquals("in the air", eagle.currentLocation);
    }

    @Test
    public void testItLosesFeathers() {
        Eagle eagle = new Eagle(5);
        eagle.molt();
        assertEquals(4, eagle.numberOfFeathers);
    }
}
