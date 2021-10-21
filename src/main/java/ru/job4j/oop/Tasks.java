package ru.job4j.oop;

public class Tasks {
    private String taskOne;
    private String taskTwo;
    private String taskThree;

    public Tasks(String taskOne, String taskTwo, String taskThree) {
        this.taskOne = taskOne;
        this.taskTwo = taskTwo;
        this.taskThree = taskThree;
    }

    public String getTaskOne() {
        return taskOne;
    }

    public String getTaskTwo() {
        return taskTwo;
    }

    public String getTaskThree() {
        return taskThree;
    }

}
