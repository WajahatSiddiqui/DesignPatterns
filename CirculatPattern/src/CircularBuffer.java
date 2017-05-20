
public class CircularBuffer {
    private Integer data[];
    private int head;
    private int tail;

    public CircularBuffer(Integer number) {
        data = new Integer[number];
        head = 0;
        tail = 0;
    }

    // Write the data tail++
    // Read the data head++
    public boolean store(Integer value) {
        if (!isBufferFull()) {
            data[tail++] = value;
            if (tail == data.length) {
                tail = 0;
            }
            return true;
        }
        return false;
    }

    private boolean isBufferFull() {
        return ((tail + 1) == head) || (tail == (data.length - 1) && head == 0);
    }

    public Integer read() {
        if (head != tail) {
            int value = data[head++];
            if (head == data.length) {
                head = 0;
            }
            return value;
        } else {
            return null;
        }
    }
}
