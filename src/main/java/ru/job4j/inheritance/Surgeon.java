package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String specialty;
    private String employed;

    public Surgeon(String name, String surname, String education, String birthday, double experience,
            String specialty, String employed) {
        super(name, surname, education, birthday, experience);
        this.specialty = specialty;
        this.employed = employed;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getEmployed() {
        return employed;
    }
}
