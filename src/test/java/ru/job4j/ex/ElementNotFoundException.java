package ru.job4j.ex;

public class ElementNotFoundException extends Exception {

    public ElementNotFoundException(String message) {
        super(message);
    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
          if (key.equals(value[i])) {
              rsl = i;
              break;
          }
    }
        if (rsl < 0) {
            throw new ElementNotFoundException("Element in String[] value not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"one", "two", null, "three", "four", "five"};
        try {
            System.out.println(indexOf(value, "six"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
