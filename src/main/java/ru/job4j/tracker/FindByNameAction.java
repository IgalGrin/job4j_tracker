package ru.job4j.tracker;

import java.util.ArrayList;

public class FindByNameAction implements UserAction {

    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        /*System.out.println(name + " вызов 1");*/
        /*Item[] items = tracker.findByName(name);*/
        ArrayList<Item> items = tracker.findByName(name);
        /*System.out.println(items + " вызов 10");  вызов 10 работает*/
        /*if (items.length > 0) {*/
        if (items.size() > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Заявки с именем: " + name + " не найдены.");
        }
        return true;
    }
}
