package by.andervyd._1_procedural.memory.by_ref_by_value;

public class ExIntHolder {
    public static void main(String[] args) {

        IntHolder x = new IntHolder(0);
        IntHolder y = x;

        x.value = 1;

        System.out.println("x value: " + x.value);
        // >> x value: 1

        System.out.println("y value: " + y.value);
        // >> y value: 1
    }
}
