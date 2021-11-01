package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
            System.out.println("The " + getClass().getSimpleName() + " is flying");
        }
    }
