package org.example;

import java.util.Date;

public class Eagle extends Animal{

    double wingspan;

    public Eagle(String name, String favoriteFood, int age, Date zooEnteringDate, double weight, double height) {
        super(name, favoriteFood, age, zooEnteringDate, weight, height);
    }

    public Eagle(String name, String favoriteFood, int age, Date zooEnteringDate, double weight, double height, double wingspan) {
        super(name, favoriteFood, age, zooEnteringDate, weight, height);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public Eagle getMaxWingspan(Eagle[] eagles) {

        for(int i = 0; i< eagles.length; i++) {

            

        }

    }


}
