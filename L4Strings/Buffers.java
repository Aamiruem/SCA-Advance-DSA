
public class Buffers {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Thread 1
        Thread t1 = new Thread(() -> {
            sb.append(" World");
            System.out.println("Thread 1: " + sb);
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            sb.append(" Everyone");
            System.out.println("Thread 2: " + sb);
        });

        t1.start();
        t2.start();
    }
}
