public class ReplaceMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Original String: " + sb);

        // replace() method
        sb.replace(6, 11, "Universe: ");
        System.out.println("After replacing: " + sb);

    }
}
