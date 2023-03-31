package org.example.animals;



import java.time.LocalDate;

public abstract class TailAnimal extends Animal {

    private double tailLength;


    public TailAnimal(String name, String favoriteFood, int age, LocalDate zooEnteringDate, double weight, double height, double tailLength) {
        super(name, favoriteFood, age, zooEnteringDate, weight, height);
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }
}
