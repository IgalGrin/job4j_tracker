package ru.job4j.oop;

public class Pacient extends Profession {
    private String aches;

    Pacient(String name, String surname, String educ, String birthday, String aches) {
        super(name, surname, educ, birthday);
        this.aches = aches;
    }

    public String getAches() {
        return aches;
    }

}
