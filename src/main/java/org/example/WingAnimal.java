package org.example;

import java.util.Date;

public class WingAnimal extends Animal{

    double wingspan;
    public WingAnimal(String name, String favoriteFood, int age, Date zooEnteringDate, double weight, double height) {
        super(name, favoriteFood, age, zooEnteringDate, weight, height);
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}
