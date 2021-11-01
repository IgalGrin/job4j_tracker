package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
            System.out.println("The " + getClass().getSimpleName() + " is running on rails");
        }
    }
