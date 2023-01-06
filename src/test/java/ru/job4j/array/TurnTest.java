package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        assertThat(Turn.back(new int[] {4, 1, 6, 2})).containsExactly(2, 6, 1, 4);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        assertThat(Turn.back(new int[] {1, 2, 3, 4, 5})).containsExactly(5, 4, 3, 2, 1);
    }
}