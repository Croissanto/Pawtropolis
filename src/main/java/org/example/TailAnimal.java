package org.example;

import java.util.Date;

public class TailAnimal extends Animal{

    double tailLength;


    public TailAnimal(String name, String favoriteFood, int age, Date zooEnteringDate, double weight, double height) {
        super(name, favoriteFood, age, zooEnteringDate, weight, height);
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }
}
