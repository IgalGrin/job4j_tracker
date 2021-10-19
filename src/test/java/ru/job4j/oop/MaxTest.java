package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void firstMax() {
        int first = 10;
        int second = 5;
        int third = 1;
        int fourth = 3;
        int result = Max.max(first, second, third, fourth);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondMax() {
        int first = 10;
        int second = 50;
        int third = 1;
        int fourth = 35;
        int result = Max.max(first, second, third, fourth);
        int expected = 50;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void thirdMax() {
        int first = 1;
        int second = 5;
        int third = 100;
        int fourth = 11;
        int result = Max.max(first, second, third, fourth);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void allEq() {
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void firstEqSecond() {
        int first = 10;
        int second = 10;
        int third = 1;
        int fourth = 3;
        int result = Max.max(first, second, third, fourth);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void firstEqThird() {
        int first = 100;
        int second = 1;
        int third = 100;
        int fourth = 6;
        int result = Max.max(first, second, third, fourth);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondEqThird() {
        int first = 1;
        int second = 100;
        int third = 100;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }

}