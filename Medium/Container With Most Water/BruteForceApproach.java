public class BruteForceApproach {

    public static void main(String[] args) {
         int[] height1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("Test Case 1: " + maxArea(height1)); // Expected: 49

        // Test Case 2: All heights same
        int[] height2 = { 5, 5, 5, 5, 5 };
        System.out.println("Test Case 2: " + maxArea(height2)); // Expected: 20

        // Test Case 3: Increasing heights
        int[] height3 = { 1, 2, 3, 4, 5 };
        System.out.println("Test Case 3: " + maxArea(height3)); // Expected: 6

        // Test Case 4: Decreasing heights
        int[] height4 = { 5, 4, 3, 2, 1 };
        System.out.println("Test Case 4: " + maxArea(height4)); // Expected: 6

        // Test Case 5: Only two elements
        int[] height5 = { 2, 1 };
        System.out.println("Test Case 5: " + maxArea(height5)); // Expected: 1

        // Test Case 6: Zeros in between
        int[] height6 = { 0, 2, 0, 4, 0, 3 };
        System.out.println("Test Case 6: " + maxArea(height6)); // Expected: 8

        // Test Case 7: Large values
        int[] height7 = { 10000, 1, 10000 };
        System.out.println("Test Case 7: " + maxArea(height7)); // Expected: 20000

        // Test Case 8: Empty array
        int[] height8 = {};
        System.out.println("Test Case 8: " + maxArea(height8)); // Expected: 0

        // Test Case 9: One bar only
        int[] height9 = { 5 };
        System.out.println("Test Case 9: " + maxArea(height9)); // Expected: 0

    }

    private static int maxArea(int[] height){
        int len = height.length;
        int area = 0;
        for(int i = 0; i < len -1; i++){
            for(int j = i; j < len; j++){
                int w = Math.min(height[i],height[j]);
                int b = j-i;
                int curr = w *b;
                if(curr > area){
                    area = curr;
                }
            }
        }

        return area;
    }
    
}
