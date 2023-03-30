package org.example;

import java.time.LocalDate;
import java.util.Date;

public class WingAnimal extends Animal{

    double wingspan;
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
