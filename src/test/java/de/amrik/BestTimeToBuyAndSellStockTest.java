package de.amrik;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static de.amrik.BestTimeToBuyAndSellStock.maxProfit;

public class BestTimeToBuyAndSellStockTest {
    @Test
    public void maxProfitIs5() {
        int[] input = { 7, 1, 5, 3, 6, 4 };
        int expected = 5;
        assertEquals(expected, maxProfit(input));
    }

    @Test
    public void noProfitPossible() {
        int[] input = { 7, 6, 4, 3, 1 };
        int expected = 0;
        assertEquals(expected, maxProfit(input));
    }
}
