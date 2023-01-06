package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        assertThat(FindLoop.indexOf(data, el)).isEqualTo(0);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {1, 2, 3};
        int el = 10;
        assertThat(FindLoop.indexOf(data, el)).isEqualTo(-1);
    }
}