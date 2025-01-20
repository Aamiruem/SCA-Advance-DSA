public class DeleteMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Dove");
        System.out.println("Original String: " + sb);
        
        // delete() method
        sb.delete(0, 1);
        System.out.println("After deleting first character: " + sb);
    }
}
