package by.andervyd._1_procedural.dds;

public class Ex04 {
    public static void main(String[] args) {

        Node tailOne = Node.genRec(0, 1, 2, 3);

        System.out.println(tailOne);
        // >> Node [value: 0, next: Node [value: 1, next: Node [value: 2, next: Node [value: 3, next: null]]]]

        System.out.println("================");

        Node tailTwo = Node.genRecFull(0, 1, 2, 3);

        System.out.println(tailTwo);
        // >> Node [value: 0, next: Node [value: 1, next: Node [value: 2, next: Node [value: 3, next: null]]]]
    }
}
