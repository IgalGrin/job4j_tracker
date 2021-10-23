package ru.job4j.pojo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Arkadii");
        student.setSurname("Michailovich");
        student.setPatronymic("Nedobezkin");
        student.setGroup("156к");
        student.setEntrance(new GregorianCalendar(2021, Calendar.SEPTEMBER, 15));
        System.out.println("name: " + student.getName());
        System.out.println("surname: " + student.getSurname());
        System.out.println("patronymic: " + student.getPatronymic());
        System.out.println("group: " + student.getGroup());
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Calendar date = student.getEntrance();
        System.out.println("entrance: " + formatter.format(date.getTime()));
    }
}
