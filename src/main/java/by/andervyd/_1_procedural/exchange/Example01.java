package by.andervyd._1_procedural.exchange;

public class Example01 {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        System.out.println("a: " + a + "\nb: " + b);
        // output: a: 5
        //         b: 3

        System.out.println("====");

        a = a + b; // a = 7
        b = a - b; // b = 3;
        a = a - b; // a = 5

        System.out.println("a: " + a + "\nb: " + b);
        // output: a: 5
        //         b: 3
    }
}
