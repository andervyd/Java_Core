package by.andervyd._1_procedural.loop.simple_loop._invert;

import java.util.Arrays;

public class ArrayInverterRec {

    public static void invertRec(int[] input, int i) {
        if (i < input.length / 2) {
            int tmp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = tmp;
            invertRec(input, i + 1);
        }
        if (i == input.length / 2) {
            System.out.println("Reverse: " + Arrays.toString(input));
        }
    }

    public static void main(String[] args) {

        int[] array = {-5, -2, 0, 4, 7, 8, 12};
        int i = 0;
        System.out.println("Original: " + Arrays.toString(array));
        // output: Original: [-5, -2, 0, 4, 7, 8, 12]

        invertRec(array, i);
        // output: Revers: [12, 8, 7, 4, 0, -2, -5]
    }
}
