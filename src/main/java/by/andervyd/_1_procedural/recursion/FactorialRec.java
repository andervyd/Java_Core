package by.andervyd._1_procedural.recursion;

import java.math.BigInteger;

public class FactorialRec {

    public static void main(String args[]) {

        long factorial = 1;
        int number = 8;

        factorial = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
