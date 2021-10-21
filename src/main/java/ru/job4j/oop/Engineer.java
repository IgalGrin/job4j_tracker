package ru.job4j.oop;

public class Engineer extends Profession {

    public Engineer(String name, String surname, String educ, String birthday) {
        super(name, surname, educ, birthday);
    }

    public Projects job(Tasks task) {
return new Projects("");
    }

}
