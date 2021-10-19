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

    @Test
    public void when121to111then1() {
        double expected = 1;
        Point a = new Point(1, 2, 1);
        Point b = new Point(1, 1, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when121to121then0() {
        double expected = 0.0;
        Point a = new Point(1, 2, 1);
        Point b = new Point(1, 2, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when120to111then1Dot41() {
        double expected = 1.41;
        Point a = new Point(1, 2, 0);
        Point b = new Point(1, 1, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}
