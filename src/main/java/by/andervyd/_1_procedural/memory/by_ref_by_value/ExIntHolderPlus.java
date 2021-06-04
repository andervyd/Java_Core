package by.andervyd._1_procedural.memory.by_ref_by_value;

public class ExIntHolderPlus {
    public static void main(String[] args) {

        IntHolder x = new IntHolder(0);
        x = IntHolder.plusOne(x);

        System.out.println("x value: " + x.value);
        // >> x value: 1
    }
}
