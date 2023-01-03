package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        assertThat(Max.max(left, right)).isEqualTo(2);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        assertThat(Max.max(left, right)).isEqualTo(2);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        assertThat(Max.max(left, right)).isEqualTo(3);
    }
}