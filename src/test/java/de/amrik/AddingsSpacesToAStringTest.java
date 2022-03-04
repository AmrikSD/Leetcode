package de.amrik;

import static org.junit.Assert.assertEquals;
import static de.amrik.AddingSpacesToAString.addSpacesToString;
import org.junit.Test;

public class AddingsSpacesToAStringTest {

    @Test
    public void exampleOne() {

        String inString = "LeetcodeHelpsMeLearn";
        int[] inSpaces = { 8, 13, 15 };

        String expected = "Leetcode Helps Me Learn";
        String actual = addSpacesToString(inString, inSpaces);

        assertEquals(expected, actual);

    }

    @Test
    public void exampleTwo() {

        String inString = "icodeinpython";
        int[] inSpaces = { 1, 5, 7, 9 };

        String expected = "i code in py thon";
        String actual = addSpacesToString(inString, inSpaces);

        assertEquals(expected, actual);
    }

    @Test
    public void exampleThree() {
        String inString = "spacing";
        int[] inSpaces = { 0, 1, 2, 3, 4, 5, 6 };

        String expected = " s p a c i n g";
        String actual = addSpacesToString(inString, inSpaces);

        assertEquals(expected, actual);

    }

}
