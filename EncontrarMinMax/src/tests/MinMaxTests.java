package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.MinMax;

class MinMaxTests {

	@Test
    public void testFindMin() {
        int[] array = {3, 7, 1, 9, 4};
        int expectedMin = 1;
        int actualMin = MinMax.encontrarMin(array);
        assertEquals(expectedMin, actualMin);
    }

    @Test
    public void testFindMax() {
        int[] array = {3, 7, 1, 9, 4};
        int expectedMax = 9;
        int actualMax = MinMax.encontrarMax(array);
        assertEquals(expectedMax, actualMax);
    }
    
}
