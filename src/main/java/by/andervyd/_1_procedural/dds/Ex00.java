package by.andervyd._1_procedural.dds;

public class Ex00 {
    public static void main(String[] args) {

        Node node = new Node(10,
                        new Node(20,
                            new Node(30, null)));

        System.out.println(node);
        // >> Node [value: 10, next: Node [value: 20, next: Node [value: 30, next: null]]]
    }
}