package ru.job4j.ex;

public class ElementNotFoundException extends Exception {

    public ElementNotFoundException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        String[] value = {"one", "two", null, "three", "four", "five"};
        try {
            System.out.println(FindEl.indexOf(value, "six"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
