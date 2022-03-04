package de.amrik;

import static org.junit.Assert.assertEquals;
import static de.amrik.FindFirstPalindromicStringInArray.findFirstPalindromicString;
import org.junit.Test;

public class FirstPalindromicStringTest {

    @Test
    public void exampleOne() {
        String[] input = { "abc", "car", "ada", "racecar", "cool" };
        String expected = "ada";
        assertEquals(expected, findFirstPalindromicString(input));
    }

    @Test
    public void exampleTwo() {
        String[] input = { "notapalindrome", "racecar" };
        String expected = "racecar";
        assertEquals(expected, findFirstPalindromicString(input));
    }

    @Test
    public void exampleThree() {
        String[] input = { "def", "ghi" };
        String expected = "";
        assertEquals(expected, findFirstPalindromicString(input));
    }

}
