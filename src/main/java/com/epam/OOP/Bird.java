package com.epam.OOP;

public class Bird extends Animal {
    private int numberOfWings;
    public Bird() {
        super("blue",2, false);
        numberOfWings = 2;
    }

    private boolean getFur() {
        return hasFur;
    }

        @Override
    public String getDescription() {
        String wingsDescription = (numberOfWings == 1) ? "wing" : "wings";
        String furDescription = getFur() ? "a" : "no";
        return super.getDescription() + " Moreover, it has " + numberOfWings + " " + wingsDescription + " and can fly.";
    }
}

