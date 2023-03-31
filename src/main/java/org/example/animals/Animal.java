package org.example.animals;

import java.time.LocalDate;


public abstract class Animal {

    private String name;
    private String favoriteFood;
    private int age;
    private LocalDate zooEnteringDate;
    private double weight;
    private double height;

    public Animal(String name, String favoriteFood, int age, LocalDate zooEnteringDate, double weight, double height) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this.zooEnteringDate = zooEnteringDate;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getZooEnteringDate() {
        return zooEnteringDate;
    }

    public void setZooEnteringDate(LocalDate zooEnteringDate) {
        this.zooEnteringDate = zooEnteringDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
