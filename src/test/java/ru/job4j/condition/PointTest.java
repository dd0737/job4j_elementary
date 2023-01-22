package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        assertEquals(2, a.distance(b), 0.01);
    }

    @Test
    public void when01to22then2dot23() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 2);
        assertEquals(2.23, a.distance(b), 0.01);
    }

    @Test
    public void when40to23then3dot60() {
        Point a = new Point(4, 0);
        Point b = new Point(2, 3);
        assertEquals(3.60, a.distance(b), 0.01);
    }

    @Test
    public void when11to26then5dot09() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 6);
        assertEquals(5.09, a.distance(b), 0.01);
    }

    @Test
    public void when111to333then3dot46() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(3, 3, 3);
        assertEquals(3.46, a.distance3d(b), 0.01);
    }

    @Test
    public void when123to567then6dot92() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(5, 6, 7);
        assertEquals(6.92, a.distance3d(b), 0.01);
    }
}