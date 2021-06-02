package by.andervyd._1_procedural.loop.binary_sort;

import java.util.Arrays;

public class Ex00 {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        int position = Arrays.binarySearch(array, 20); // X -> position: array length - 1

        System.out.println("index: " + position);
        // output: index: 1
    }
}
