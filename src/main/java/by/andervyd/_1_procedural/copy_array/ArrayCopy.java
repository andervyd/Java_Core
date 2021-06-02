package by.andervyd._1_procedural.copy_array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] arrayOne = {1, 2, 3, 4, 5};
        int[] arrayTwo = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println(Arrays.toString(arrayOne));
        // >> [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(arrayTwo));
        // >> [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        System.arraycopy(arrayOne, 2, arrayTwo, 2, 3);
        System.out.println(Arrays.toString(arrayTwo));
        // >> [0, 0, 3, 4, 5, 0, 0, 0, 0, 0]

        System.arraycopy(arrayOne, 0, arrayOne, 1, 2);
        System.out.println(Arrays.toString(arrayOne));
        // >> [0, 0, 3, 4, 5, 0, 0, 0, 0, 0]
    }
}
