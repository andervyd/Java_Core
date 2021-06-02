package by.andervyd._1_procedural.loop.simple_loop._invert;

public class Ex00 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " % 2 = " + (i % 2));
            System.out.println(" | " + i + " / 2 = " + (i / 2));
        }
        // output:  0 % 2 = 0 | 0 / 2 = 0
        //          1 % 2 = 1 | 1 / 2 = 0
        //          2 % 2 = 0 | 2 / 2 = 1
        //          3 % 2 = 1 | 3 / 2 = 1
        //          4 % 2 = 0 | 4 / 2 = 2

        System.out.println("=====================");

//        System.out.println(1 / 0);
        // output: ArithmeticException

        System.out.println("=====================");

        System.out.println("1.0 / 0 = " + 1.0 / 0);
        // output: 1.0 / 0 = Infinity

        System.out.println("=====================");

        System.out.println("-1.0 / 0 = " + -1.0 / 0);
        // output: -1.0 / 0 = -Infinity

        System.out.println("=====================");

        System.out.println("0.0 / 0 = " + 0.0 / 0);
        // output: 0.0 / 0 = NaN
    }
}
