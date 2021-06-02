package by.andervyd._1_procedural.loop.nested_loop;

public class Ex03 {
    public static void main(String[] args) {

        int[] array = {0, 10, 20, 30, 40};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
        // output:  0
        //          0 10
        //          0 10 20
        //          0 10 20 30
        //          0 10 20 30 40
    }
}
