package de.amrik;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>(nums.length);
        List<Integer> result = new LinkedList<Integer>();

        for (int i : nums) {
            hm.put(i, true);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!hm.containsKey(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
