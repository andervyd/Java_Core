package by.andervyd._1_procedural.recursion.permutation;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {

        int[] array = {1, 2};
        permute(array, array.length);

    }

    public static void permute(int[] array, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int key = 0; key < size; key++) {
                swap(array, key, size - 1);
                permute(array, size - 1);
            }
        }
    }

    private static void swap(int[] array, int index0, int index1) {
        int tmp = array[index0];
        array[index0] = array[index1];
        array[index1] = tmp;
    }
}