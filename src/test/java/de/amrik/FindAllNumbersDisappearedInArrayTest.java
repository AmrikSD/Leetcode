package de.amrik;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static de.amrik.FindAllNumbersDisappearedInArray.findDisappearedNumbers;

public class FindAllNumbersDisappearedInArrayTest {
    @Test
    public void nIsNineMissingIsFiveAndSix() {
        int[] input = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> expected = new ArrayList<Integer>(2);
        expected.add(5);
        expected.add(6);
        assertEquals(expected, findDisappearedNumbers(input));
    }

    @Test
    public void nIsTwoMissingIsTwo() {
        int[] input = { 1, 1 };
        List<Integer> expected = new ArrayList<Integer>(2);
        expected.add(2);

        assertEquals(expected, findDisappearedNumbers(input));
    }
}
