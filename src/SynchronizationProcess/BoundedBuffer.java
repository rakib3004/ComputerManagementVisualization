package SynchronizationProcess;

class BoundedBuffer<E> {
    private static final int BUFFER_SIZE = 6;

    private int count, in, out;
    private E[] buffer;

    public BoundedBuffer() {

        count = 0;
        in = 0;
        out = 0;
        buffer = (E[]) new Object[BUFFER_SIZE];

        int NUMBER_OF_THREADS = 20;

        int i;

        for (i = 0; i < NUMBER_OF_THREADS; i++) {

        }
    }

    public synchronized void insert(E item) {
        while (count == BUFFER_SIZE) {
            try {
                wait();
            } catch (InterruptedException interruptedException) {

            }
        }
        buffer[in] = item;

        in = (in + 1) % BUFFER_SIZE;
        count++;
        System.out.println("Reader reading " + count);

        notify();

    }

    public synchronized E remove() {
        E item;

        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException interruptedException) {
            }
        }
        item = buffer[out];
        out = (out + 1) % BUFFER_SIZE;
        count--;

        System.out.println("Writer writing " + count);

        return item;
    }

    public static void main(String[] args) {

    }
}
