
public class Buffers {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Original String: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        System.out.println("Append: " + sb.append("  Google"));
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        

        sb.append(" Placement: ");
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());


        sb.append(" Algorithm");
        sb.ensureCapacity(70);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

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


// BufferSize is the size of the internal buffer used by the StringBuffer.  16 is the default buffer size + 5 is the size of the hello size = 21
