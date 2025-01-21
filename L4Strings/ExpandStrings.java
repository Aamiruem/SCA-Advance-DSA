
public class ExpandStrings {

    public static void expand(String str) {
        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer sb = new StringBuffer();
        int i, j, k;
        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(ch);

            int n = ch - '0';
            StringBuffer temp = new StringBuffer();
            for (j = i + 2; str.charAt(j) != ')'; j++) {
                temp.append(str.charAt(j));
            }
            for(k = 1; k<=n; k++) {
                sb.append(temp);
            }
            i =j;
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        System.out.println(" Starting String: 3(ab)4(cd) ");
        expand("3(ab)4(cd)");
    }
}
