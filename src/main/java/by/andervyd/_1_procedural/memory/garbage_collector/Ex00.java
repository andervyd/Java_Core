package by.andervyd._1_procedural.memory.garbage_collector;

public class Ex00 {
    public static void main(String[] args) {

        Object ref;

        while (true) {
            ref = new Object();
        }
    } // >> NOT EXCEPTION: OutOfMemoryError
}
