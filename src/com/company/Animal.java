package com.company;

import com.company.devices.FoodType;

public class Animal {
    final static Double DEFAULT_DOG_WEIGHT = 6.0;
    private static final Double DEFAULT_FOOD_WEIGHT = 1.0;
    public String name;
    final static Double DEFAULT_CAT_WEIGHT = 1.0;
    final static Double DEFAULT_ELEPHANT_WEIGHT = 2000.0;
    final static Double DEFAULT_WEIGHT = 0.5;
    public final String species;
    private Double weight;
    public FoodType os;

    public Animal(String species) {
        this.species = species;

        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "cat":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "elephant":
                this.weight = DEFAULT_ELEPHANT_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_WEIGHT;
        }

    }

    public void food() {


        switch (this.os) {
            case meet -> System.out.println(" 50% mass of food will be built into body mass");
            case crops -> System.out.println(" 50% mass of food will be built into body mass");
            case all -> System.out.println(" 50% mass of food will be built into body mass");

        }

    }



    void printWeight() {
        System.out.println(weight);
    }

    void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    void feed(Double foodWeight) {
        this.weight += foodWeight;
        System.out.println("thx for food, bro");
        System.out.println("my weight is now " + this.weight);
    }


    public void setWeight(Double weight) {
        this.weight = weight;
    }

    String returnSpeciesAndName() {
        return species + " " + name;
    }

    String returnNameAndOwner(String owner) {
        return name + " " + owner;
    }

    public void sell(Human seller, Human buyer, Double price) {
        System.out.println(this.name);
        if (seller.pet == this) {
            seller.pet = null;
            buyer.pet = this;
        }
    }

}
