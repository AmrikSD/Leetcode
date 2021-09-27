package de.amrik;

import java.util.Arrays;

public class EqualSumArraysWithMinimumNumberOperations {

    public static int equalSumOfArraysWithMinOperations(int[] nums1, int[] nums2) {

        int nums1Sum = Arrays.stream(nums1).sum();
        int nums2Sum = Arrays.stream(nums2).sum();

        int minNums1 = nums1.length;
        int maxNums1 = 6 * nums1.length;

        int minNums2 = nums2.length;
        int maxNums2 = 6 * nums2.length;

        if (minNums1 > maxNums2 || minNums2 > maxNums1) {
            return -1;
        }

        // Find the maximum we can change the difference in the sum in one operation

        return 3;

    }

}
