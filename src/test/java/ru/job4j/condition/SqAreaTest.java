package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1K1Square0dot06() {
        int p = 1;
        double k = 1;
        double expected = 0.06;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K4Square4() {
        int p = 10;
        double k = 4;
        double expected = 4;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}