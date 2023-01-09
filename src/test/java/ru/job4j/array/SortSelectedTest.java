package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {
    @Test
    public void whenSort5Numbers() {
        assertThat(SortSelected.sort(new int[] {3, 4, 1, 2, 5}))
                .containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    public void whenSort3Numbers() {
        assertThat(SortSelected.sort(new int[] {4, 1, 2}))
                .containsExactly(1, 2, 4);
    }

}