
public class Example1 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("DSA");
        System.out.println(sb); // Prints the content of the StringBuffer
        System.out.println(sb.length()); // Prints the length of the StringBuffer
        System.out.println(sb.capacity()); // Prints the capacity of the StringBuffer

        sb.ensureCapacity(25); // Ensures the capacity is at least 25
        System.out.println(sb); // Prints the content of the StringBuffer
        System.out.println(sb.length()); // Prints the length of the StringBuffer
        System.out.println(sb.capacity()); // Prints the capacity of the StringBuffer

        sb.ensureCapacity(70); // Ensures the capacity is at least 70
        System.out.println(sb); // Prints the content of the StringBuffer
        System.out.println(sb.length()); // Prints the length of the StringBuffer
        System.out.println(sb.capacity()); // Prints the capacity of the StringBuffer
    }
}
