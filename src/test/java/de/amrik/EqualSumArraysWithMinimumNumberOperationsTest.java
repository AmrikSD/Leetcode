package de.amrik;

import static org.junit.Assert.assertEquals;
import static de.amrik.EqualSumArraysWithMinimumNumberOperations.equalSumOfArraysWithMinOperations;

import org.junit.Test;

public class EqualSumArraysWithMinimumNumberOperationsTest {

    @Test
    public void possibleWith3Operations() {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 1, 1, 2, 2, 2, 2 };
        int expected = 3;
        assertEquals(expected, equalSumOfArraysWithMinOperations(arr1, arr2));
    }

    @Test
    public void cantDecreaseNums1OrIncreaseNums2() {
        int[] arr1 = { 1, 1, 1, 1, 1, 1, 1 };
        int[] arr2 = { 6 };
        int expected = -1;
        assertEquals(expected, equalSumOfArraysWithMinOperations(arr1, arr2));
    }

    @Test
    public void alsoPossibleWith3Operations() {
        int[] arr1 = { 6, 6 };
        int[] arr2 = { 1 };
        int expected = 1;
        assertEquals(expected, equalSumOfArraysWithMinOperations(arr1, arr2));
    }
}
