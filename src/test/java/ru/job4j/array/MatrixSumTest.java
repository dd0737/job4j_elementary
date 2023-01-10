package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixSumTest {
    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        assertThat(MatrixSum.sum(array)).isEqualTo(10);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        assertThat(MatrixSum.sum(array)).isEqualTo(6);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        assertThat(MatrixSum.sum(array)).isEqualTo(7);
    }
}