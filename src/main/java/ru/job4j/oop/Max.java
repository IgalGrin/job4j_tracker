package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, max(third, fourth)));
    }

    public static void main(String[] args) {
        int res = Max.max(1, 2, 3, 4);
        System.out.println(res);
    }
}
