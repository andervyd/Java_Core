package by.andervyd._1_procedural.recursion;

public class Ex00 {
    public static void main(String[] args) {

        f(1);
        // >> 1 2 4 8

        System.out.println("\n=========");

        f2(1);
        // >> 8 4 2 1
    }

    public static void f(int arg) {
        System.out.print(" " + arg);
        if (arg < 7) {
            f(2 * arg);
        }
    }

    public static void f2(int arg) {
        if (arg < 7) {
            f2(2 * arg);
        }
        System.out.print(" " + arg);
    }
}
