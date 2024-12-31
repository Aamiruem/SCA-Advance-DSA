public class LengthCapacity {
    public static void main(String[] args) {
        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer sb = new StringBuffer("DSA");
        System.out.println(sb.length()); // 0
        System.out.println(sb.capacity()); // 16
        sb.append(" Placement");
        System.out.println(sb.length()); // 7
        System.out.println(sb.capacity()); // 16
        sb.append(" and interesting");
        System.out.println(sb.length()); // 19  
        System.out.println(sb.capacity()); // 34
    }
}
