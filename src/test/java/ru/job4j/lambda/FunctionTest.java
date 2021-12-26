package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionUsage function = new FunctionUsage();
        int a = 2;
        int b = 1;
        List<Double> result = function.diapason(5, 8, x -> a * x + b);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadricFunctionThenQuadricResults() {
        FunctionUsage function = new FunctionUsage();
        int a = 2;
        int b = 1;
        List<Double> result = function.diapason(5, 8, x -> a * Math.pow(x, 2) + b);
        List<Double> expected = Arrays.asList(51D, 73D, 99D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenComplexFunctionThenComplexResults() {
        FunctionUsage function = new FunctionUsage();
        int a = 2;
        int b = 1;
        List<Double> result = function.diapason(5, 8, x -> a * Math.pow(2, x) + b);
        List<Double> expected = Arrays.asList(65D, 129D, 257D);
        assertThat(result, is(expected));
    }
}