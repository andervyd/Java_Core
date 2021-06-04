package by.andervyd._1_procedural.memory.by_ref_by_value;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {

        int[] x = {0, 1, 2};
        int[] y = x;

        x = null;

        System.out.println("Array x: " + Arrays.toString(x));
        // >> Array x: null

        System.out.println("Array y: " + Arrays.toString(y));
        // >> Array y: [0, 1, 2]
    }
}
