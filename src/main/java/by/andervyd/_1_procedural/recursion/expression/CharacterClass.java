package by.andervyd._1_procedural.recursion.expression;

public class CharacterClass {
    public static void main(String[] args) {

        System.out.println(Character.isDigit('3')); // true
        System.out.println(Character.isDigit('W')); // false
        System.out.println(Character.isDigit(' ')); // false
        System.out.println(Character.isDigit('!')); // false
    }
}
