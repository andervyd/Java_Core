package by.andervyd._1_procedural.memory.garbage_collector;

public class Ex05 {
    public static void main(String[] args) {

        Object[] ref = new Object[1];

        while (true) {

            Object[] a = new Object[1];
            Object[] b = a;

            a[0] = b;
            ref[0] = new Object[]{a, b, ref};
        }
    } // >> NOT EXCEPTION: OutOfMemoryError
}
