package by.andervyd._1_procedural.memory.garbage_collector;

public class Ex01 {
    public static void main(String[] args) {

        while (true) {
            new Object();
        }
    } // >> NOT EXCEPTION: OutOfMemoryError
}
