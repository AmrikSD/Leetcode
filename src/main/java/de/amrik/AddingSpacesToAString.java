package de.amrik;

import java.util.HashSet;

public class AddingSpacesToAString {

    public static String addSpacesToString(String str, int[] spaces) {

        HashSet<Integer> set = new HashSet<>();
        for (int i : spaces) {
            set.add(i);
        }

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            if (set.contains(i)) {
                sb.append(" ");
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}
