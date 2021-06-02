package by.andervyd._1_procedural.exchange;

public class Ex00 {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        System.out.println("a: " + a + "\nb: " + b);
        // output: a: 5
        //         b: 2

        System.out.println("====");

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("a: " + a + "\nb: " + b);
        // output: a: 2
        //         b: 5
    }
}
