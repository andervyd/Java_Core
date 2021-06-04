package by.andervyd._1_procedural.dds;

public class Ex00 {
    public static void main(String[] args) {

        Node head = new Node(0,
                        new Node(1,
                            new Node(2,
                                new Node(3,null))));

        System.out.println(head);
        // >> Node [value: 0, next: Node [value: 1, next: Node [value: 2, next: Node [value: 3, next: null]]]]
    }
}