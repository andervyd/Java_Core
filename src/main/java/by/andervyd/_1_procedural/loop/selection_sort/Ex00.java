package by.andervyd._1_procedural.loop.selection_sort;

import java.util.Arrays;

public class Ex00 {

    public static void sortBubble(int[] inputArr) {
        for (int barrier = 0; barrier < inputArr.length; barrier++) {
            for (int index = barrier + 1; index < inputArr.length; index++) {
                if (inputArr[barrier] > inputArr[index]) {
                    int tmp = inputArr[index];
                    inputArr[index] = inputArr[barrier];
                    inputArr[barrier] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {9, 2, 7, -3, 0, 3, -8};
        System.out.println(Arrays.toString(array));
        // output: [9, 2, 7, -3, 0, 3, -8]

        sortBubble(array);
        System.out.println(Arrays.toString(array));
        // output: [-8, -3, 0, 2, 3, 7, 9]
    }
}
