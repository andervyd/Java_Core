package by.andervyd._1_procedural.loop.simple_loop._invert;

import java.util.Arrays;
import java.util.Collections;

public class ArrayInverterMethod {
    public static void main(String[] args) {

        Integer[] array = {-5, -2, 0, 4, 7, 8, 12};
        Collections.reverse(Arrays.asList(array));
        System.out.println("Rev method: " + Arrays.toString(array));
        // output: Rev method: [12, 8, 7, 4, 0, -2, -5]

    }
}
