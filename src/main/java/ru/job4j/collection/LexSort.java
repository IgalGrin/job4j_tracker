package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftPart = left.split(". ");
        String[] rightPart = right.split(". ");
        return Integer.compare(Integer.parseInt(leftPart[0]), Integer.parseInt(rightPart[0]));
    }
}
