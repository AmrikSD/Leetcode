package de.amrik;

public class ReplaceElementsWithGreatestElementToRight {

    public static int[] replaceElements(int[] arr) {
        int maxToRight = -1;
        int[] newList = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            newList[i] = maxToRight;
            if (arr[i] > maxToRight) {
                maxToRight = arr[i];
            }
        }
        return newList;
    }
}
