package by.andervyd._1_procedural.dds.node;

public class ExMerge {
    public static void main(String[] args) {

        Node tailA = Node.genRecFull(10, 20, 30, 40);
        Node tailB = Node.genRecFull(15, 25, 35, 45);

        System.out.println(Node.toStringIter(tailA));
        // >> 10 -> 20 -> 30 -> 40 -> *

        System.out.println(Node.toStringIter(tailB));
        // >> 15 -> 25 -> 35 -> 45 -> *

        System.out.println(Node.toStringIter(Node.merge(tailA, tailB)));
        // >> 10 -> 15 -> 20 -> 25 -> 30 -> 35 -> 40 -> 45 -> *
    }
}
