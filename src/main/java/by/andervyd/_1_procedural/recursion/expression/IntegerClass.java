package by.andervyd._1_procedural.recursion.expression;

public class IntegerClass {
    public static void main(String[] args) {

        int valueOne = Integer.valueOf("123");
        System.out.println(valueOne);
        // >> 123

        int valueTwo = Integer.valueOf("abc");
        System.out.println(valueTwo);
        // >> NumberFormatException
    }
}
