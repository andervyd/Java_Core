package by.andervyd._1_procedural.loop.bubble_sort;

import java.util.Arrays;

public class Ex00 {

    public static void sortBubble(int[] inputArr) {
        for (int barrier = inputArr.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (inputArr[index] > inputArr[index + 1]) {  // or "<" UP
                    int tmp = inputArr[index];
                    inputArr[index] = inputArr[index + 1];
                    inputArr[index + 1] = tmp;
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
