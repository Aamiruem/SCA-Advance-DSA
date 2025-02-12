import java.util.ArrayList;

public class MaxProfitStock {

    // Method to calculate the maximum profit
    public static int maxProfit(ArrayList<Integer> prices) {
        // Step 1: Initialize the minimum price to the maximum possible integer value
        int minPrice = Integer.MAX_VALUE;
        // Step 2: Initialize the maximum profit to 0
        int maxProfit = 0;

        // Step 3: Iterate through the prices ArrayList
        for (int price : prices) {
            // Step 4: Update the minimum price if the current price is smaller
            if (price < minPrice) {
                minPrice = price;
            }
            // Step 5: Calculate the profit if we sell at the current price
            int profit = price - minPrice;
            // Step 6: Update the maximum profit if the current profit is greater
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        // Step 7: Return the maximum profit
        return maxProfit;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Test Case 1
        ArrayList<Integer> prices1 = new ArrayList<>();
        prices1.add(7);
        prices1.add(1);
        prices1.add(5);
        prices1.add(3);
        prices1.add(6);
        prices1.add(4);
        System.out.println("Test Case 1:");
        System.out.println("Input ARR: " + prices1);
        System.out.println("Output: " + maxProfit(prices1)); // Expected Output: 5

        System.out.println(); // Flex
        // Test Case 2
        ArrayList<Integer> prices2 = new ArrayList<>();
        prices2.add(9);
        prices2.add(5);
        prices2.add(3);
        prices2.add(2);
        prices2.add(1);
        System.out.println("Test Case 2:");
        System.out.println("Input ARR: " + prices2);
        System.out.println("Output: " + maxProfit(prices2)); // Expected Output: 0
    }
}
