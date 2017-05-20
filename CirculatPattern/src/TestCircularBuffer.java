
public class TestCircularBuffer {
    public TestCircularBuffer() {
        CircularBuffer cb = new CircularBuffer(8);
        System.out.println("Storing: 1");
        cb.store(1);
        System.out.println("Reading: " + cb.read());
        System.out.println("Storing: 2");
        cb.store(2);
        System.out.println("Storing: 3");
        cb.store(3);
        System.out.println("Storing: 4");
        cb.store(4);
        System.out.println("Reading: " + cb.read());
        System.out.println("Storing: 5");
        cb.store(5);
        System.out.println("Storing: 6");
        cb.store(6);
        System.out.println("Storing: 7");
        cb.store(7);
        System.out.println("Storing: 8");
        cb.store(8);
        System.out.println("Storing: 9");
        cb.store(9);
        System.out.println("Storing: 10");
        cb.store(10);
        System.out.println("Storing: 11");
        cb.store(11);
        System.out.println("Storing: 12");
        cb.store(12);
        System.out.println("Reading: " + cb.read());
        System.out.println("Reading: " + cb.read());
        System.out.println("Reading: " + cb.read());
        System.out.println("Reading: " + cb.read());
        System.out.println("Reading: " + cb.read());
        System.out.println("Reading: " + cb.read());
        System.out.println("Reading: " + cb.read());
        System.out.println("Reading: " + cb.read());
        System.out.println("Reading: " + cb.read());
        System.out.println("Reading: " + cb.read());
        System.out.println("Reading: " + cb.read());
    }
    public static void main(String[] args) {
        new TestCircularBuffer();
    }
}
