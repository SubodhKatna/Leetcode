import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OptimizeApproach {
    public static void main(String[] args) {
        // Test Case 1: Normal case with multiple numbers
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        System.out.println("Test Case 1: " + Arrays.toString(twoSum(nums1, target1))); // Expected: [0, 1]

        // Test Case 2: All positive numbers
        int[] nums2 = { 1, 2, 3, 4, 5 };
        int target2 = 6;
        System.out.println("Test Case 2: " + Arrays.toString(twoSum(nums2, target2))); // Expected: [1, 4]

        // Test Case 3: Negative numbers
        int[] nums3 = { -1, -2, -3, -4, -5 };
        int target3 = -8;
        System.out.println("Test Case 3: " + Arrays.toString(twoSum(nums3, target3))); // Expected: [2, 4]

        // Test Case 4: No solution case
        int[] nums4 = { 3, 7, 12, 5 };
        int target4 = 20;
        try {
            System.out.println("Test Case 4: " + Arrays.toString(twoSum(nums4, target4))); // Expected: Exception
        } catch (IllegalArgumentException e) {
            System.out.println("Test Case 4: " + e.getMessage()); // Expected: No match found
        }

        // Test Case 5: Large numbers
        int[] nums5 = { 1000000, 500000, 100000, 200000 };
        int target5 = 1500000;
        System.out.println("Test Case 5: " + Arrays.toString(twoSum(nums5, target5))); // Expected: [0, 1]

    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No match found");
    }
}
