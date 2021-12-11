package ru.job4j.collection;

import org.junit.Test;
import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenAscByNameAndDescByPriority() {
        Comparator<Job> cmpNamePriority =
                new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenDescByPriorityAndAscByName() {
        Comparator<Job> cmpNamePriority =
                new JobDescByPriority().thenComparing(new JobAscByName());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenAscByName() {
        Comparator<Job> ascNamePriority =
                new JobAscByName();
        int rsl = ascNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenAscByPriority() {
        Comparator<Job> ascPriorityPriority =
                new JobAscByPriority();
        int rsl = ascPriorityPriority.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenDescByName() {
        Comparator<Job> descNamePriority =
                new JobDescByName();
        int rsl = descNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenDescByPriority() {
        Comparator<Job> descPriorityPriority =
                new JobDescByPriority();
        int rsl = descPriorityPriority.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, greaterThan(0));
    }
}