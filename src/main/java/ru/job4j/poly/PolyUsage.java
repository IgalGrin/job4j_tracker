package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle busOne = new Autobus();
        Vehicle busTwo = new Autobus();
        Vehicle trainOne = new Train();
        Vehicle trainTwo = new Train();
        Vehicle planeOne = new Plane();
        Vehicle planeTwo = new Plane();
        Vehicle[] vehicles = new Vehicle[]{busOne, busTwo, trainOne, trainTwo, planeOne, planeTwo};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
