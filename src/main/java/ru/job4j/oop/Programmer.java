package ru.job4j.oop;

public class Programmer extends Engineer {
    private String specialty;

    public Programmer(String name, String surname, String educ, String birthday, String specialty) {
        super(name, surname, educ, birthday);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }
}

