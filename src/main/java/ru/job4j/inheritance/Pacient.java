package ru.job4j.inheritance;

public class Pacient extends Profession {
    private String aches;
    private String recourse;

    public Pacient(String name, String surname, String education, String birthday, String aches,
                   String recourse) {
        super(name, surname, education, birthday);
        this.aches = aches;
        this.recourse = recourse;
    }

    public String getAches() {
        return aches;
    }

    public String getRecourse() {
        return recourse;
    }
}
