package de.amrik;

import java.util.HashMap;

public class ClimbingStairs {
    public static int waysToClimbStairs(int n) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(n);

        hm.put(1, 1);
        hm.put(2, 2);

        for (int i = 3; i <= n; i++) {
            hm.put(i, (hm.get(i - 1) + hm.get(i - 2)));
        }
        return hm.get(n);

    }
}
