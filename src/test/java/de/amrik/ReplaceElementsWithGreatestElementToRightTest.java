package de.amrik;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import static de.amrik.ReplaceElementsWithGreatestElementToRight.replaceElements;

public class ReplaceElementsWithGreatestElementToRightTest {

    @Test
    public void exampleOne() {
        int[] input = { 17, 18, 5, 4, 6, 1 };
        int[] expected = { 18, 6, 6, 6, 1, -1 };

        int[] actual = replaceElements(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void noElementsToTheRight() {

        int[] input = { 400 };
        int[] expected = { -1 };

        int[] actual = replaceElements(input);

        assertArrayEquals(expected, actual);
    }
}
