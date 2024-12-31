public class LengthCapacity {
    public static void main(String[] args) {
        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer sb = new StringBuffer("DSA");
        System.err.println(sb);
        System.out.println(sb.length()); // 0
        System.out.println(sb.capacity()); // 16

        sb.append(" Placement");
        System.err.println(sb);
        System.out.println(sb.length()); // 7
        System.out.println(sb.capacity()); // 16
        
        sb.append(" Algorithm");
        System.err.println(sb);
        sb.append(" and interesting");
        System.out.println(sb.length()); // 19  
        System.out.println(sb.capacity()); // 34
    }
}
