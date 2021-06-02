package by.andervyd._1_procedural.loop.binary_sort;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        int position = Arrays.binarySearch(array, 15); // X -> -position: array length - 1 - 1

        System.out.println("index: " + position);
        // output: index: -2
    }
}
