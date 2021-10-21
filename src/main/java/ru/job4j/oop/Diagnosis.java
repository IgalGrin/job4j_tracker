package ru.job4j.oop;

public class Diagnosis {
    private String diagnosOne;
    private String diagnosTwo;
    private String diagnosThree;

    public Diagnosis(String diagnosOne, String diagnosTwo, String diagnosThree) {
        this.diagnosOne = diagnosOne;
        this.diagnosTwo = diagnosTwo;
        this.diagnosThree = diagnosThree;
    }

    public String getDiagnosOne() {
        return diagnosOne;
    }

    public String getDiagnosTwo() {
        return diagnosTwo;
    }

    public String getDiagnosThree() {
        return diagnosThree;
    }
}
