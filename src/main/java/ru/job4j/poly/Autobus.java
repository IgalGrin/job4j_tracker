package ru.job4j.poly;

public class Autobus implements Vehicle {

    @Override
    public void move() {
            System.out.println("The " + getClass().getSimpleName() + " is riding");
        }
    }
