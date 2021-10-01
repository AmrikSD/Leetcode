package de.amrik;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            if (hs.contains(i)) {
                return true;
            }
            hs.add(i);
        }
        return false;
    }

}
