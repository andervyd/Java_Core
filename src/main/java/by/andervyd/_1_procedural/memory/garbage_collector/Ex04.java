package by.andervyd._1_procedural.memory.garbage_collector;

public class Ex04 {
    public static void main(String[] args) {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println(i);
            Object ref = new byte[1_000_000];
        }
    } // >> EXCEPTION: OutOfMemoryError
}
