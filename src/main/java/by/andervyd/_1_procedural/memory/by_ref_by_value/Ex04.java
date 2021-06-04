package by.andervyd._1_procedural.memory.by_ref_by_value;

public class Ex04 {
    public static void main(String[] args) {

        IntHolder x = new IntHolder(0);
        f(x);

        System.out.println("x value: " + x.value);
        // >> x value: 0
    }

    public static void f(IntHolder x) {
        x = new IntHolder(1);
    }
}
