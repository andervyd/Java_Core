package by.andervyd._1_procedural.recursion;

import java.util.Arrays;

public class ArrayInverterRec {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        // >> [0, 1, 2, 3, 4, 5]

        invert(array, 0);
        System.out.println(Arrays.toString(array));
        // >> [5, 4, 3, 2, 1, 0]
    }

    public static void invert(int[] array, int key) {
        if (key < array.length / 2) {
            int tmp = array[key];
            array[key] = array[array.length - 1 - key];
            array[array.length - 1 - key] = tmp;
            invert(array, key + 1);
        }
    }
}
