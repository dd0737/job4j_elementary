package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int[] innerArray : array) {
            for (int i = 0; i < innerArray.length; i++) {
                if (innerArray[i] < 0) {
                    innerArray[i] = 0;
                }
            }
        }
        return array;
    }
}