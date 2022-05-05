package com.hoangle;

public class Animal {

    private String color;
    private int leg_number;
    private boolean can_fly;

    public Animal(String color, int leg_number, boolean can_fly) {
        this.color = color;
        this.leg_number = leg_number;
        this.can_fly = can_fly;
    }

    public Animal(String color, int leg_number) {
        this(color, leg_number, false);
    }

    public String move() {
        if (can_fly) {
            return "I'm flying.";
        }
        return "I'm moving with " + leg_number + " legs!.";
    }
}
