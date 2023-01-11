package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MachineTest {
    @Test
    public void whenMoneyEqualsPrice() {
        assertThat(Machine.change(100, 100))
                .containsExactly();
    }

    @Test
    public void whenMoney50Price35() {
        assertThat(Machine.change(50, 35))
                .containsExactly(10, 5);
    }

    @Test
    public void whenMoney50Price21() {
        assertThat(Machine.change(50, 21))
                .containsExactly(10, 10, 5, 2, 2);
    }

    @Test
    public void whenMoney50Price32() {
        assertThat(Machine.change(50, 32))
                .containsExactly(10, 5, 2, 1);
    }
}