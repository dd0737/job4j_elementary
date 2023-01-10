package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {1, 2}, {1, 2, 3}};
        for (int[] innerArray : numbers) {
            System.out.println(innerArray.length);
        }
    }
}
