package by.andervyd._1_procedural.dds;

public class Ex02 {
    public static void main(String[] args) {

        Node tail;

        tail = new Node(0, null);
        tail = new Node(1, tail);
        tail = new Node(2, tail);
        tail = new Node(3, tail);

        System.out.println(tail);
        // >> Node [value: 3, next: Node [value: 2, next: Node [value: 1, next: Node [value: 0, next: null]]]]
    }
}
