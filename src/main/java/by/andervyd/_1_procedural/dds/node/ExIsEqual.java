package by.andervyd._1_procedural.dds.node;

public class ExIsEqual {
    public static void main(String[] args) {

        Node tailA = Node.genRecFull(10, 20, 30, 40);
        Node tailB = Node.genRecFull(10, 20, 30, 40);
        Node tailC = Node.genRecFull(15, 25, 35, 45);

        System.out.println("tailA and tailB is " + Node.isEqual(tailA, tailB));
        // >> tailA and tailB is true

        System.out.println("tailA and tailC is " + Node.isEqual(tailA, tailC));
        // >> tailA and tailC is false
    }
}
