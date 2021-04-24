package com.company;

public class Animal {
    public final String species = "canis";
    public String name;
    private Double weight = 3.0;

    void printWeight() {
        System.out.println(weight);
    }

    void feed(Double foodWeight) {
        weight += foodWeight;
        System.out.println("thx for food, bro");
        System.out.println("my weight is now " + weight);
    }

    String returnSpeciesAndName() {
        return species + " " + name;
    }

    String returnNameAndOwner(String owner) {
        return name + " " + owner;
    }
}
