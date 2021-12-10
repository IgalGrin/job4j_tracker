package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemAscByNameTest {
    @Test
    public void ascendingSort() {
        List<Item> items = Arrays.asList(new Item("1"), new Item("4"),
                new Item("3"), new Item("2"), new Item("5"));
        List<Item> expected = Arrays.asList(new Item("1"), new Item("2"),
                new Item("3"), new Item("4"), new Item("5"));
        Collections.sort(items, new ItemAscByName());
        assert expected.equals(items);
    }
}