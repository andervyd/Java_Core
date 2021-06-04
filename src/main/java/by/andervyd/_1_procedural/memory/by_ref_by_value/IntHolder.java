package by.andervyd._1_procedural.memory.by_ref_by_value;

public class IntHolder {
    public int value;

    public IntHolder(int value) {
        this.value = value;
    }

    public static IntHolder plusOne(IntHolder inValue) {
        return new IntHolder(inValue.value + 1);
    }
}
