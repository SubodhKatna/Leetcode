import java.util.Arrays;

public class FollowUpFirst {
    public static int[] maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Maximum sum found
        int currentSum = nums[0]; // Current sum
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i; // Start new subarray
            } else {
                currentSum += nums[i]; // Extend subarray
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart; // Update start index
                end = i; // Update end index
            }
        }

        return Arrays.copyOfRange(nums, start, end + 1); // Return subarray
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] result = maxSubArray(nums);
        System.out.println("Maximum Subarray: " + Arrays.toString(result)); // Output: [4, -1, 2, 1]
    }
}
