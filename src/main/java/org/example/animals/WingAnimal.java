package org.example.animals;
import java.time.LocalDate;

public class WingAnimal extends Animal {

    private double wingspan;

    public WingAnimal(String name, String favoriteFood, int age, LocalDate zooEnteringDate, double weight, double height, double wingspan) {
        super(name, favoriteFood, age, zooEnteringDate, weight, height);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}
