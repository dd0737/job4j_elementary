package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        assertThat(Triangle.exist(ab, ac, bc)).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ab = 1.0;
        double ac = 1.0;
        double bc = 2.0;
        assertThat(Triangle.exist(ab, ac, bc)).isFalse();
    }
}