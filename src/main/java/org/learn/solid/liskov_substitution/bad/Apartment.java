package org.learn.solid.liskov_substitution.bad;


abstract class Apartment {
    int squareFootage;
    int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);
}
