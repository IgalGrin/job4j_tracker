package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemDescByNameTest {
    @Test
    public void descendingSort() {
        List<Item> items = Arrays.asList(new Item("Petr2"), new Item("Ivan1"),
                new Item("Vlad5"), new Item("Vasili4"), new Item("Semen3"));
        List<Item> expected = Arrays.asList(new Item("Vlad5"), new Item("Vasili4"),
                new Item("Semen3"), new Item("Petr2"), new Item("Ivan1"));
        Collections.sort(items, new ItemDescByName());
        assert expected.equals(items);
    }
}