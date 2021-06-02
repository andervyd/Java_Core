package by.andervyd._1_procedural.loop.simple_loop._invert;

import java.util.Arrays;

public class ArrayInverter {

    public static void invert(int[] input) {
        for (int i = 0; i < input.length / 2; i++) {
            int tmp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = tmp;
        }
        System.out.println("Reverse: " + Arrays.toString(input));
    }

    public static void main(String[] args) {

        int[] array = {-5, -2, 0, 4, 7, 8, 12};
        System.out.println("Original: " + Arrays.toString(array));
        // output: Original: [-5, -2, 0, 4, 7, 8, 12]

        invert(array);
        // output: Revers: [12, 8, 7, 4, 0, -2, -5]
    }
}