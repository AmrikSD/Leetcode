package de.amrik;

public class SingleNumber {
    // IDEA: Seen this one before I think - some XOR trick
    public static int singleNumber(int[] nums) {
        int missingNumber = 0;
        for (int i : nums) {
            missingNumber = missingNumber ^ i;
        }
        return missingNumber;
    }
}
