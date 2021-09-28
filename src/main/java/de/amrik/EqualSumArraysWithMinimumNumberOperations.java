package de.amrik;

import java.util.Arrays;

/**
 * TODO: Finish me, understand me :)
 */
public class EqualSumArraysWithMinimumNumberOperations {

    public static int equalSumOfArraysWithMinOperations(int[] nums1, int[] nums2) {

        int nums1Sum = Arrays.stream(nums1).sum();
        int nums2Sum = Arrays.stream(nums2).sum();

        if (nums1Sum == nums2Sum) {
            return 0;
        }

        // Make sure that the smaller array (in terms of sum) is always nums1.
        if (nums1Sum > nums2Sum) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        if (nums1.length * 6 < nums2.length) {
            return -1;
        }

        // Now we know to get them to the same, we should increase nums1 and decrease
        // nums2.
        int diffNeeded = nums2Sum - nums1Sum;

        int minElementFromNums1 = Arrays.stream(nums1).min().getAsInt();
        int maxElementFromNums2 = Arrays.stream(nums2).max().getAsInt();

        int minIndexNums1 = Arrays.asList(nums1).indexOf(minElementFromNums1);
        int maxIndexNums2 = Arrays.asList(nums2).indexOf(maxElementFromNums2);

        int diffCanGetFromNums1 = 6 - minElementFromNums1;
        int diffCanGetFromNums2 = maxElementFromNums2 - 1;

        if (diffCanGetFromNums1 >= diffNeeded || diffCanGetFromNums2 >= diffNeeded) {
            return 1;
        }

        if (diffCanGetFromNums1 > diffCanGetFromNums2) {
            int[] newNums1 = nums1;
            newNums1[minIndexNums1] = 6;
            return 1 + equalSumOfArraysWithMinOperations(newNums1, nums2);

        }

        int[] newNums2 = nums2;
        newNums2[maxIndexNums2] = 1;
        return 1 + equalSumOfArraysWithMinOperations(nums1, newNums2);
    }

}
