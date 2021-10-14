package de.amrik;

import java.util.Arrays;

public class MissingNumber {

    public static int naiveMissingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    /*
     * Follow up: Could you implement a solution using only O(1) extra space
     * complexity and O(n) runtime complexity?
     */
    public static int missingNumber(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;
        for (int i : nums) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }
}
