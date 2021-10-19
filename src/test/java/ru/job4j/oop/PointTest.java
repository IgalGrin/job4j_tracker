package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when24to20then4() {
        double expected = 4;
        Point a = new Point(2, 4);
        Point b = new Point(6, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to45then3Dot60() {
        double expected = 3.6;
        Point a = new Point(1, 3);
        Point b = new Point(4, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when04to75then7Dot07() {
        double expected = 7.07;
        Point a = new Point(0, 4);
        Point b = new Point(7, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
