package de.amrik;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static de.amrik.SingleNumber.singleNumber;

public class SingleNumberTest {
    @Test
    public void oneIsMissing() {
        int[] input = { 2, 2, 1 };
        int expected = 1;
        assertEquals(expected, singleNumber(input));
    }

    @Test
    public void FourIsMissing() {
        int[] input = { 4, 1, 2, 1, 2 };
        int expected = 4;
        assertEquals(expected, singleNumber(input));
    }

    @Test
    public void OneIsMissingAndIsTheOnlyElement() {
        int[] input = { 1 };
        int expected = 1;
        assertEquals(expected, singleNumber(input));
    }
}
