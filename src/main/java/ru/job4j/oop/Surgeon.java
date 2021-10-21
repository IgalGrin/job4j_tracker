package ru.job4j.oop;

public class Surgeon extends Doctor {
    private String specialty;

    Surgeon(String name, String surname, String educ, String birthday, String specialty) {
        super(name, surname, educ, birthday);
        this.specialty = specialty;
    }

    public String getSpecialization() {
        return specialty;
    }

}
