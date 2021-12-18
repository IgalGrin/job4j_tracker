package ru.job4j.collection;

import java.util.Comparator;
import java.util.Objects;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String strOne, String strTwo) {
        String[] str1 = strOne.split("/");
        String[] str2 = strTwo.split("/");
        for (int i = 0; i < Math.min(str1.length, str2.length); i++) {
            if (!Objects.equals(str1[i], str2[i])) {
                return str1[i].compareTo(str2[i]);
            }
        }
        return Integer.compare(str1.length, str2.length);
    }
}
