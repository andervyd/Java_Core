package by.andervyd._1_procedural.dds;

public class Node {
    private int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node [value: " + value
                + ", next: " + next + "]";
    }
}