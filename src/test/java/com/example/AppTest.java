package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testStandardArrayMax() {
        App app = new App();
        int[] numbers = {3, 7, 2, 9, 5};
        assertEquals(9, app.findMaximum(numbers));
    }

    @Test
    public void testNegativeNumbersMax() {
        App app = new App();
        int[] numbers = {-3, -7, -2, -9, -5};
        assertEquals(-2, app.findMaximum(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArrayException() {
        App app = new App();
        app.findMaximum(new int[]{});
    }
}
