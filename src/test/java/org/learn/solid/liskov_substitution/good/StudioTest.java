package org.learn.solid.liskov_substitution.good;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class StudioTest {
    @Test
    public void testInitializedWithZeroBedrooms() {
        Studio studio = new Studio();
        assertEquals(0, studio.numberOfRooms);
    }

    @Test
    public void testSetsSquareFootage() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);

        assertEquals(550, studio.squareFootage);
    }
}
