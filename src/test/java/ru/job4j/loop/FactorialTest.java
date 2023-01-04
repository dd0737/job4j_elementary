package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        assertThat(Factorial.calc(5)).isEqualTo(120);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        assertThat(Factorial.calc(0)).isEqualTo(1);
    }
}