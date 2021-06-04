package by.andervyd._1_procedural.memory.by_ref_by_value;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {

        int[] x = {0, 1, 2};
        x = f(x);

        System.out.println("x: " + Arrays.toString(x));
        // >> x: [10, 11, 12]
    }

    public static int[] f(int[] x) {
        return new int[]{x[0] + 10, x[1] + 10, x[2] + 10};
    }
}
