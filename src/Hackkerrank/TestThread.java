package Hackkerrank;

class SempleDemo implements Runnable {

    private Thread t;
    private String threadName;

    SempleDemo(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        while (true)
            System.out.println(threadName);
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}

public class TestThread {
    public static void main(String[] args) {
        SempleDemo A = new SempleDemo("A");
        SempleDemo B = new SempleDemo("B");

        B.start();
        A.start();
    }
}
