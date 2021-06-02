package by.andervyd._1_procedural.loop.simple_loop._for;

public class Example00 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        // output: 0 1 2 3 4 5 6 7 8 9

        System.out.println("\n=================");

        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        // output: 0 2 4 6 8

        System.out.println("\n=================");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        // output: 10 9 8 7 6 5 4 3 2 1

        System.out.println("\n=================");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
//            i--;
        }
    }
}

