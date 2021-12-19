package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String strOne, String strTwo) {
        String[] str1 = strOne.split("/");
        String[] str2 = strTwo.split("/");
        int rsl = str2[0].compareTo(str1[0]);
        return rsl != 0 ? rsl : strOne.compareTo(strTwo);
    }
}
