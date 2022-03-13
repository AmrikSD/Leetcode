package de.amrik;

public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        int reverseTo = word.indexOf(ch);

        if (reverseTo < 0) {
            return word;
        }

        String start = word.substring(0, reverseTo + 1);

        StringBuilder sb = new StringBuilder("");

        for (char c : start.toCharArray()) {
            sb.insert(0, c);
        }

        String ending = word.substring(reverseTo + 1);
        sb.append(ending);

        return sb.toString();
    }
}
