package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to22then2dot23() {
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double expected = 2.23;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when40to23then3dot60() {
        int x1 = 4;
        int y1 = 0;
        int x2 = 2;
        int y2 = 3;
        double expected = 3.60;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to26then5dot09() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 6;
        double expected = 5.09;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}