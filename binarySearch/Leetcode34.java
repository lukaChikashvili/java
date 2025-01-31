package binarySearch;

import java.util.Arrays;

public class Leetcode34 {

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        
        int[] ans = searchRange(arr, target);
        System.out.println("Target range: " + Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1}; // Default if target is not found
        // Find first and last occurrence of target
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // Binary search helper
    private static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1; // Default if target is not found
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1; // Search left
            } else if (target > nums[mid]) {
                start = mid + 1; // Search right
            } else {
                // Potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Continue search on the left
                } else {
                    start = mid + 1; // Continue search on the right
                }
            }
        }

        return ans;
    }
}
