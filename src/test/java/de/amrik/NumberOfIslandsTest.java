package de.amrik;

import static org.junit.Assert.assertEquals;
import static de.amrik.NumberOfIslands.numIslands;

import org.junit.Test;

public class NumberOfIslandsTest {

    @Test
    public void justOneIsland() {
        // note diagonal doesn't count.
        char[][] input = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' } };
        int expected = 1;
        assertEquals(expected, numIslands(input));
    }

    @Test
    public void threeislands() {
        // note diagonal doesn't count.
        char[][] input = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' } };
        int expected = 3;
        assertEquals(expected, numIslands(input));
    }
}