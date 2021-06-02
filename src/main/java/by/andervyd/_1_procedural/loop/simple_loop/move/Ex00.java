package by.andervyd._1_procedural.loop.simple_loop.move;

import java.util.Arrays;

public class Ex00 {
    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
        System.out.println(Arrays.toString(array));
        // output: [5, 1, 3, 4, 0, 8, 9, 7, 6, 2]

        for (int i = 0; i < array.length - 1; i++) {
            swap(array, i, i + 1);
        }
        System.out.println(Arrays.toString(array));
        // output: [1, 3, 4, 0, 8, 9, 7, 6, 2, 5]
    }

    private static void swap(int[] array, int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
}
