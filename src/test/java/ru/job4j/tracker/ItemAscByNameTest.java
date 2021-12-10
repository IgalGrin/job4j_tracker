package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemAscByNameTest {
    @Test
    public void ascendingSort() {
        List<Item> items = Arrays.asList(new Item("Petr2"), new Item("Ivan1"),
                new Item("Vlad5"), new Item("Vasili4"), new Item("Semen3"));
        List<Item> expected = Arrays.asList(new Item("Ivan1"), new Item("Petr2"),
                new Item("Semen3"), new Item("Vasili4"), new Item("Vlad5"));
        Collections.sort(items, new ItemAscByName());
        assert expected.equals(items);
    }
}