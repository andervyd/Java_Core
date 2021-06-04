package by.andervyd._1_procedural.memory.by_ref_by_value;

public class Ex00 {
    public static void main(String[] args) {

        int x = 0;
        int y = x;

        x = 1;

        System.out.println("x: " + x);
        // >> x: 1

        System.out.println("y: " + y);
        // >> y: 0
    }
}
