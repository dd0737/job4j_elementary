package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        assertThat(SwitchArray.swap(input, source, dest)).containsExactly(4, 2, 3, 1);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 2;
        int dest = 3;
        assertThat(SwitchArray.swap(input, source, dest)).containsExactly(1, 2, 4, 3, 5, 6);
    }
}