package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        queue.put(new Task("low", 6));
        var result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
        var resul = queue.take();
        assertThat(resul.getDesc(), is("middle"));
        var resu = queue.take();
        assertThat(resu.getDesc(), is("low"));
        var res = queue.take();
        assertThat(res.getDesc(), is("low"));
    }
}