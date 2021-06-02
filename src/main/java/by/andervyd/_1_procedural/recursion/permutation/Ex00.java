package by.andervyd._1_procedural.recursion.permutation;

import java.util.Arrays;

public class Ex00 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        permute(array, 0);

    }

    public static void permute(int[] array, int size) {
        for (int key = size; key < array.length; key++) {
            swap(array, key, size);
            permute(array, size + 1);
            swap(array, size, key);
        }
        if (size == array.length - 1) {
            System.out.println(Arrays.toString(array));
        }
    }

    private static void swap(int[] array, int index0, int index1) {
        int tmp = array[index0];
        array[index0] = array[index1];
        array[index1] = tmp;
    }
}