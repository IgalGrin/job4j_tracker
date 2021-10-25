package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;
    private int j = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] namesWithoutNull = new Item[items.length];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                namesWithoutNull[j] = item;
                j++;
            }
        }
        return Arrays.copyOf(namesWithoutNull, j);
    }

   public Item[] findByName(String key) {
       Item[] namesWithoutNull = new Item[items.length];
       for (int index = 0; index < size; index++) {
           Item item = items[index];
           if (key.equals(item.getName())) {
               namesWithoutNull[j] = item;
               j++;
           }
    }
       return Arrays.copyOf(namesWithoutNull, j);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}