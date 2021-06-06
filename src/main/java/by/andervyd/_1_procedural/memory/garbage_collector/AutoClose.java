package by.andervyd._1_procedural.memory.garbage_collector;

public class AutoClose implements AutoCloseable{
    public AutoClose() {}

    @Override
    public void close() throws Exception {}
}

class NotAutoClose {
    public NotAutoClose() {}
    public void close() {}
}

class Main {
    public static void main(String[] args) {

        NotAutoClose refOne = new NotAutoClose();
        try {
        } finally {
            refOne.close();
        }

        try (AutoClose refTwo = new AutoClose()) {
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
