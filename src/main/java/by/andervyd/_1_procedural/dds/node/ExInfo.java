package by.andervyd._1_procedural.dds.node;

public class ExInfo {
    public static void main(String[] args) {

        Node tail = Node.genRecFull(10, 20, 30, 40);

        System.out.println(Node.toStringRec(tail));
        // >> 10 -> 20 -> 30 -> 40 -> *

        System.out.println("Length tail: " + Node.length(tail));
        // >> Length tail: 4

        System.out.println("Max value tail: " + Node.max(tail));
        // >> Max value tail: 40

        System.out.println("Sum tail: " + Node.sum(tail));
        // >> Sum tail: 100
    }
}
