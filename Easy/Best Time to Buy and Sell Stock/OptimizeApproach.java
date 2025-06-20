public class OptimizeApproach {
    public static void main(String[] args) {

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test Case 1: " + maxProfit(prices1)); // Expected: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Test Case 2: " + maxProfit(prices2)); // Expected: 0

        int[] prices3 = {1, 2};
        System.out.println("Test Case 3: " + maxProfit(prices3)); // Expected: 1

        int[] prices4 = {2, 4, 1};
        System.out.println("Test Case 4: " + maxProfit(prices4)); // Expected: 2

        int[] prices5 = {};
        System.out.println("Test Case 5: " + maxProfit(prices5)); // Expected: 0

        int[] prices6 = {3};
        System.out.println("Test Case 6: " + maxProfit(prices6)); // Expected: 0
    }

    private static int maxProfit(int[] prices) {
        int len = prices.length;
        if(len == 0){
            return 0;
        }
        if(len == 1){
            return 0;
        }
        int minValueSoFar = prices[0];
        int profit = 0;
        for(int i = 1; i < len; i++){
            minValueSoFar = Math.min(prices[i], minValueSoFar);
            profit = Math.max(profit, prices[i]-minValueSoFar);

        }
        return profit;

    }
}
