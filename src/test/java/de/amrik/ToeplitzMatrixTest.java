package de.amrik;

import static org.junit.Assert.assertEquals;
import static de.amrik.ToeplitzMatrix.isToeplitzMatrix;

import org.junit.Test;

public class ToeplitzMatrixTest {
    @Test
    public void itIsAToeplitz() {
        int[][] input = { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } };
        assertEquals(true, isToeplitzMatrix(input));
    }

    @Test
    public void isNotToeplitz() {
        int[][] input = { { 1, 2 }, { 2, 2 } };
        assertEquals(false, isToeplitzMatrix(input));
    }

}
