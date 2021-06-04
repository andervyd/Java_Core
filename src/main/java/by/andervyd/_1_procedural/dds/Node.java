package by.andervyd._1_procedural.dds;

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class Node {
    private final int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public static Node genIter(int... values) {
        Node tail = null;
        for (int key = values.length - 1; key >= 0; key--) {
            tail = new Node(values[key], tail);
        }
        return tail;
    }

    public static Node genRec(int... values) {
        return values.length == 0 ? null
                : new Node(values[0], genRec(copyOfRange(values, 1, values.length)));
    }

    public static Node genRecFull(int... values) {
        if (values.length == 0) {
            return null;
        } else {
            int[] newArray = Arrays.copyOfRange(values, 1, values.length);
            Node next = genRec(newArray);
            return new Node(values[0], next);
        }
    }

    public static String toStringIter(Node tail) {
        String result = "";
        while (tail != null) {
            result += tail.value + " -> ";
            tail = tail.next;
        }
        return result + "*";
    }

    public static String toStringRec(Node tail) {
        return (tail == null) ? "*" :
                tail.value + " -> " + toStringRec(tail.next);
    }

    @Override
    public String toString() {
        return "Node [value: " + value
                + ", next: " + next + "]";
    }
}