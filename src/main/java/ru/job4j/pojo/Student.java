package ru.job4j.pojo;

import java.util.Calendar;

public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private String group;
    private Calendar entrance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Calendar getEntrance() {
        return entrance;
    }

    public void setEntrance(Calendar entrance) {
        this.entrance = entrance;
    }
}
