package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        assertThat(Max.max(1, 2)).isEqualTo(2);
    }

    @Test
    public void whenMax2To1Then2() {
        assertThat(Max.max(2, 1)).isEqualTo(2);
    }

    @Test
    public void whenMax3To3Then3() {
        assertThat(Max.max(3, 3)).isEqualTo(3);
    }

    @Test
    public void whenMax1and3and2Then3() {
        assertThat(Max.max(1, 3, 2)).isEqualTo(3);
    }

    @Test
    public void whenMax2and1and6and4Then6() {
        assertThat(Max.max(2, 1, 6, 4)).isEqualTo(6);
    }
}