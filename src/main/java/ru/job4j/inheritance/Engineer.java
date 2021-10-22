package ru.job4j.inheritance;

public class Engineer extends Profession {
    private double experience;

    public Engineer(String name, String surname, String education, String birthday,
                    double experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public double getExperience() {
        return experience;
    }

    public Projects job(Tasks task) {
return new Projects("");
    }
}
