package by.andervyd._1_procedural.loop.simple_loop.move;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
        System.out.println(Arrays.toString(array));
        // output: [5, 1, 3, 4, 0, 8, 9, 7, 6, 2]

        for (int i = 0; i < array.length - 1; i++) {
            conditionSwap(array, i, i + 1);
        }
        System.out.println(Arrays.toString(array));
        // output: [1, 3, 4, 0, 5, 8, 7, 6, 2, 9]
    }

    private static void conditionSwap(int[] array, int first, int second) {
        if (array[first] > array[second]) {
            int tmp = array[first];
            array[first] = array[second];
            array[second] = tmp;
        }
    }
}
