public class SetCharAt {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Dove");
        System.out.println("Original String: " + sb);
        sb.setCharAt(0, 'L');
        System.out.println("Modified String: " + sb);

        sb.delete(0, 2);
        System.out.println("After deletion: " + sb);


        sb.insert(0, 'H');
        System.out.println("After insertion: " + sb);

        sb.reverse();
        System.out.println("After reversal: " + sb);

        sb.replace(0, 1, "Hello");
        System.out.println("After replacement: " + sb);

        sb.deleteCharAt(0);
        System.out.println("After deletion: " + sb);

        sb.append(" World");
        System.out.println("After appending: " + sb);

        sb.ensureCapacity(30);
        System.out.println("After ensuring capacity: " + sb);
        
    }
}
