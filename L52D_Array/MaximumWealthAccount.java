public class MaximumWealthAccount {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int amt : account) {
                sum += amt;
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }
}
