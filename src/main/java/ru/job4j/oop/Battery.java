package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery charger = new Battery(12);
        Battery accepter = new Battery(4);
        System.out.println("charger : " + charger.load + "v accepter : " + accepter.load + "v");
        charger.exchange(accepter);
        System.out.println("charger : " + charger.load + "v accepter : " + accepter.load + "v");
    }
}
