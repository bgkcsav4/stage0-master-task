package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
   boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String pawsDescription = (numberOfPaws == 1) ? "paw" : "paws";
        String furDescription = hasFur ? "a" : "no";

        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawsDescription + " and " + furDescription + " fur.";
    }
}

