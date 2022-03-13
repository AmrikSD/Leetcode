package de.amrik;

import static org.junit.Assert.assertEquals;
import static de.amrik.ReversePrefixOfWord.reversePrefix;
import org.junit.Test;

public class ReversePrefixOfWordTest {

    @Test
    public void exampleOne() {
        String word = "abcdefd";
        char ch = 'd';
        String expected = "dcbaefd";

        String actual = reversePrefix(word, ch);
        assertEquals(expected, actual);
    }

    @Test
    public void exampleTwo() {
        String word = "xyxzxe";
        char ch = 'z';
        String expected = "zxyxxe";

        String actual = reversePrefix(word, ch);
        assertEquals(expected, actual);
    }

    @Test
    public void exampleThree() {
        String word = "abcd";
        char ch = 'z';
        String expected = "abcd";

        String actual = reversePrefix(word, ch);
        assertEquals(expected, actual);
    }
}
