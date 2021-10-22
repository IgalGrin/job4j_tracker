package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String educ;
    private String birthday;

    Profession(String name, String surname, String educ, String birthday) {
       this.name = name;
       this.surname = surname;
       this.educ = educ;
       this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return educ;
    }

    public String getBirthday() {
        return birthday;
    }

}
