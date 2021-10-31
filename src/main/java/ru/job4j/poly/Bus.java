package ru.job4j.poly;

public class Bus implements Transport {
private int aboard;
private boolean move;

    @Override
    public void drive() {
        if (!move) {
            System.out.println("Bus is started to move");
            move = true;
        } else {
            System.out.println("Bus is stopped");
            move = false;
        }
    }

    @Override
    public void passengers(int count) {
aboard = aboard + count;
    }

    @Override
    public int tankup(int fuel) {
        int fuelPrice = 50;
        return fuel * fuelPrice;
    }
}
