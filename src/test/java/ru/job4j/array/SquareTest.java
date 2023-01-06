package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {
    @Test
    public void whenBound3Then014() {
        assertThat(Square.calculate(3)).containsExactly(0, 1, 4);
    }

    @Test
    public void whenBound5Then014916() {
        assertThat(Square.calculate(5)).containsExactly(0, 1, 4, 9, 16);
    }
}