package by.andervyd._1_procedural.memory.garbage_collector;

public class Ex03 {
    public static void main(String[] args) {

        Object[] ref = new Object[1];

        while (true) {
            ref = new Object[] {ref};
        }
    } // >> NOT EXCEPTION: OutOfMemoryError
}
