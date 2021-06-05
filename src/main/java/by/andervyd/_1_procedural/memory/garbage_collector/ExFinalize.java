package by.andervyd._1_procedural.memory.garbage_collector;

public class ExFinalize {
    private int index;
    private byte[] array = new byte[1_000_000];

    public ExFinalize(int index) {
        this.index = index;
    }

    @Override
    protected void finalize() throws Throwable {
        Runner.ref = new Object[]{this, Runner.ref};
        System.out.println(index);
    }
}

class Runner { // NOT RUN

    public static Object[] ref;

    public static void main(String[] args) {

        int index = 0;

        while (true) {
            new ExFinalize(index++);
        }
    }
}