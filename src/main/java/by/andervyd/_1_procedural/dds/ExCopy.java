package by.andervyd._1_procedural.dds;

public class ExCopy {
    public static void main(String[] args) {

        Node tail = Node.genRecFull(10, 20, 30, 40);
        Node copyTail = Node.copy(tail);

        System.out.println(Node.toStringRec(tail));
        // >> 10 -> 20 -> 30 -> 40 -> *

        System.out.println(Node.toStringRec(copyTail));
        // >> 10 -> 20 -> 30 -> 40 -> *
    }
}
