package com.hoangle;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("white", 4);
        Animal ant = new Bug("black", 6);
        Animal bee = new Bug("yellow",6, true);
        Animal pigeon = new Bird("white", 2, true);
        Animal ostrich = new Bird("black", 2);
        System.out.println("Cat: " + cat.move());
        System.out.println("Ant: " + ant.move());
        System.out.println("Bee: " + bee.move());
        System.out.println("Pigeon: " + pigeon.move());
        System.out.println("Ostrich: " + ostrich.move());
    }
}
