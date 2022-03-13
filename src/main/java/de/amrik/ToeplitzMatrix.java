package de.amrik;

public class ToeplitzMatrix {

    public static boolean isToeplitzMatrix(int[][] input) {

        // instead of trying to go from [0,0] to [n,n] and check on a "per diagonal"
        // basis,
        // just check that each cell is equal to the one in it's "top left" - left and
        // topmost ones...
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
