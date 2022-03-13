package de.amrik;

public class ToeplitzMatrix {

    public static boolean isToeplitzMatrix(int[][] input) {

        for (int i = 1; i < input.length; i++) {
            for (int j = 1; j < input[0].length; j++) {
                if (input[i][j] != input[i - 1][j - 1]) {
                    return false;
                }
            }
        }

        return true;
    }

}
