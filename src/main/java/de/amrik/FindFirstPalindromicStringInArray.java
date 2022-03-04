package de.amrik;

public class FindFirstPalindromicStringInArray {

    public static String findFirstPalindromicString(String[] input) {

        for (String s : input) {
            if (Boolean.TRUE.equals(isPalindromic(s))) {
                return s;
            }
        }
        return "";
    }

    static Boolean isPalindromic(String s) {

        Boolean isPalin = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalin = false;
            }
        }
        return isPalin;
    }
}
