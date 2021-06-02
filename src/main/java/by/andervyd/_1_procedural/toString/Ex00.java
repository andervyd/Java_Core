package by.andervyd._1_procedural.toString;

import java.util.Arrays;

public class Ex00 {
    public static void main(String[] args) {

        System.out.println(new Object());
        // output: java.lang.Object@5674cd4d

        System.out.println("================");

        int[] array1D = {0, 1, 2, 3};
        int[][] array2D = {{0, 1}, {2, 3}};

        System.out.println(array1D + "; " + array2D);
        // output: [I@41629346; [[I@404b9385

        System.out.println(Arrays.toString(array1D));
        // output: [0, 1, 2, 3]

        System.out.println("================");

        System.out.println(Arrays.toString(array2D));
        // output: [[I@6d311334, [I@682a0b20]
        System.out.println(Arrays.deepToString(array2D));
        // output: [[0, 1], [2, 3]]
    }
}
