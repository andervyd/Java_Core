package by.andervyd._1_procedural.recursion;

public class FibonacciV02 {
    public static void main(String args[]) {

        long fibNumber = 9;
        System.out.println("The " + fibNumber + "th fibonacci number is: " + fib(fibNumber));
        // >> The 9th fibonacci number is: 34
    }

    static long fib(long number) {
        return (number <= 1) ? number :
                (fib(number - 1) + fib(number - 2));
    }
}
