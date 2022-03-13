package de.amrik;

import static de.amrik.CountGoodTriplets.countGoodTriplets;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountGoodTripletsTest {
    @Test
    public void zeroGoodTriplets() {

        int[] arr = { 1, 1, 2, 2, 3 };
        int a = 0, b = 0, c = 1;
        int expected = 0;
        int actual = countGoodTriplets(arr, a, b, c);

        assertEquals(expected, actual);
    }

    @Test
    public void fourAreFourGoodTriplets() {
        int[] arr = { 3, 0, 1, 1, 9, 7 };
        int a = 7, b = 2, c = 3;
        int expected = 4;
        int actual = countGoodTriplets(arr, a, b, c);

        assertEquals(expected, actual);
    }
}
