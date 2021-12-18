package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();

        for (String value : deps) {
            String start = ""; /* перем. start на на первой итер. = "", до переопределения */
            /**
             * метод split() отделяет на первой итерации часть к1 переданной на
             * вход строки k1/sk1/ssk1.
             * В аргум. метода add() к знач. start "" прибавляется часть строки к1, "" + k1 = k1 и
             * полученный результат к1 добавляется в коллекцию tmp.
             * Далее переопределяется перем. start, теперь ее значение "" + к1 + / = к1/.
             * Цикл повторяется, split() отделяет следующую часть sк1 переданной строки k1/sk1/ssk1.
             * В аргум.метода add() к знач. start к1/ прибавляется часть строки sk1,
             * к1/ + sk1 = k1/sk1 и полученный результат k1/sk1 добавляется в коллекцию tmp.
             * Далее переопределяется перем. start, теперь ее значение к1/ + sк1 + / = к1/sk1/.
             * и т.д.
             */
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start += el + "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
