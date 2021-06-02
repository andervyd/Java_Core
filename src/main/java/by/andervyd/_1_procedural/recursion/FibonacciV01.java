package by.andervyd._1_procedural.recursion;

public class FibonacciV01 {
    public static void main(String args[]) {

        int fibNumber = 9;
        System.out.println("The " + fibNumber + "th fibonacci number is: " + fib(fibNumber));
        // >> The 9th fibonacci number is: 34
    }

    static int fib(int number) {
        if (number <= 1) {
            return number;
        } else {
            return fib(number - 1) + fib(number - 2);
        }
    }
}
