package org.learn.solid.liskov_substitution.good;


public class BedroomAdder {
    public void addBedroom(PenthouseSuite penthouse) {
        penthouse.numberOfBedrooms += 1;
    }
}
