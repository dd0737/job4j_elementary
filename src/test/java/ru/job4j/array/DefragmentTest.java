package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DefragmentTest {
    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        assertThat(Defragment.compress(input)).containsExactly("I", null);
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        assertThat(Defragment.compress(input))
                .containsExactly("I", "wanna", "be", "compressed", null, null, null);
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        assertThat(Defragment.compress(input))
                .containsExactly("I", "wanna", "be", "compressed", null, null, null);
    }

    @Test
    public void notAllNull() {
        String[] input = {null, null, null};
        assertThat(Defragment.compress(input)).containsExactly(null, null, null);
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        assertThat(Defragment.compress(input))
                .containsExactly("I", "wanna", "be", "compressed", null, null, null);
    }
}