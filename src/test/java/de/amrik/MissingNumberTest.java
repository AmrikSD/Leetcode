package de.amrik;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static de.amrik.MissingNumber.missingNumber;

public class MissingNumberTest {
    @Test
    public void nIsThreeMissingIsTwo() {
        int[] input = { 3, 0, 1 };
        int expected = 2;
        assertEquals(expected, missingNumber(input));
    }

    @Test
    public void nIsTwoMissingIsTwo() {
        int[] input = { 0, 1 };
        int expected = 2;
        assertEquals(expected, missingNumber(input));
    }

    @Test
    public void nIsNineMissingIsEight() {
        int[] input = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int expected = 8;
        assertEquals(expected, missingNumber(input));
    }

    @Test
    public void nIs1MissingIs1() {
        int[] input = { 0 };
        int expected = 1;
        assertEquals(expected, missingNumber(input));
    }
}
