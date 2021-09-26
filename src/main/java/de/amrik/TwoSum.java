package de.amrik;

public class TwoSum {

    /***
     * Given an array of integers @param nums and an integer @param target, returns
     * indices of the two numbers such that they add up to target. You may assume
     * that each input would have exactly one solution, and you may not use the same
     * element twice. The answer may be returned in any order.
     * 
     * @param nums
     * @param target
     * @return the INDICES of the two numbers in @param nums , such that they add up
     *         to @param targert
     */
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { 0, 1 };
    }
}