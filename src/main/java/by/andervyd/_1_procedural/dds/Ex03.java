package by.andervyd._1_procedural.dds;

public class Ex03 {
    public static void main(String[] args) {

        Node tail = Node.genIter(0, 1, 2, 3);

        System.out.println(tail);
        // >> Node [value: 0, next: Node [value: 1, next: Node [value: 2, next: Node [value: 3, next: null]]]]
    }
}
