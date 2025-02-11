package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> predName = n -> n.getName().contains(key);
        Predicate<Person> predSurname = s -> s.getSurname().contains(key);
        Predicate<Person> predAddress = a -> a.getAddress().contains(key);
        Predicate<Person> predPhone = p -> p.getPhone().contains(key);
        Predicate<Person> combine = predName.or(predSurname).or(predAddress).or(predPhone);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
