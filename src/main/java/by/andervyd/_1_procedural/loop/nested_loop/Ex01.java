package by.andervyd._1_procedural.loop.nested_loop;

public class Ex01 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((i + j > 3) ? "+" : "-");
            }
            System.out.println();
        }
        // output:  ----+
        //          ---++
        //          --+++
        //          -++++
        //          +++++
    }
}
