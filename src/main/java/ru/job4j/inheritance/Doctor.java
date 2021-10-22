package ru.job4j.inheritance;

public class Doctor extends Profession {
    Doctor(String name, String surname, String educ, String birthday) {
        super(name, surname, educ, birthday);
    }

    public Diagnosis heal(Pacient pacient) {
return new Diagnosis("");
    }
}
