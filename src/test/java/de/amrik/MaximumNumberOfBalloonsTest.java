package de.amrik;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import static de.amrik.MaximumNumberOfBalloons.maximumNumberOfBalloons;

public class MaximumNumberOfBalloonsTest {

    @Test
    public void balloonLettersAppearEachOnce() {
        String input = "nlaebolko";
        int expected = 1;
        assertTrue((maximumNumberOfBalloons(input)) == expected);
    }

    @Test
    public void balloonLettersAppearEachTwiceOnceInOrder() {
        String input = "loonbalxballpoon";
        int expected = 2;
        assertTrue((maximumNumberOfBalloons(input)) == expected);
    }

    @Test
    public void notAllBaloonLettersAppear() {
        String input = "leetcode";
        int expected = 0;
        assertTrue((maximumNumberOfBalloons(input)) == expected);
    }
}
