package by.andervyd._1_procedural.loop.insertion_sort;

import java.util.Arrays;

public class Ex00 {

    public static void sort(int[] array) {
        for (int barrier = 0; barrier < array.length; barrier++) {
            int newElement = array[barrier];
            int location = barrier - 1;
            while (location >= 0 && array[location] > newElement) {
                array[location + 1] = array[location];
                location--;
            }
            array[location + 1] = newElement;
        }
    }

    public static void main(String[] args) {

        int[] array = {3, -2, 0, 7, -1, 6, 9};
        System.out.println(Arrays.toString(array));
        // output: [3, -2, 0, 7, -1, 6, 9]

        sort(array);
        System.out.println(Arrays.toString(array));
        // output: [-2, -1, 0, 3, 6, 7, 9]
    }
}
