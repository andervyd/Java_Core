package by.andervyd._1_procedural.dds.node;

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

    public static Node merge(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            if (tailA.value < tailB.value) {
                return new Node(tailA.value, merge(tailA.next, tailB));
            } else {
                return new Node(tailB.value, merge(tailA, tailB.next));
            }
        } else {
            return (tailA == null) ? tailB : tailA;
        }
    }

    public static Node copy(Node tail) {
        return (tail == null) ? null :
                new Node(tail.value, copy(tail.next));
    }

    public static boolean isEqual(Node t0, Node t1) {
        if (t0 != null && t1 != null) {
            return (t0.value == t1.value) && isEqual(t0.next, t1.next);
        } else {
            return t0 == t1;
        }
    }

    public static int length(Node tail) {
        return (tail == null) ? 0 : 1 + length(tail.next);

    }

    public static int max(Node tail) {
        return (tail == null) ? 0 : Math.max(tail.value, max(tail.next));
    }

    public static int sum(Node tail) {
        return (tail == null) ? 0 : tail.value + sum(tail.next);
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