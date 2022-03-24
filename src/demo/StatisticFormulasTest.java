package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatisticFormulasTest {
    @Test
    void mean1() {
        int[] values = {0, 1, 2, 3, 4};
        double expected = 2;
        double actual = StatisticFormulas.mean(values);
        assertEquals(expected, actual);
    }

    @Test
    void mean2() {
        int[] values = {};
        double expected = 0;
        double actual = StatisticFormulas.mean(values);
        assertEquals(expected, actual);
    }

    @Test
    void mean3() {
        int[] values = {3, 6, 9, 10, 100};
        double expected = 25.6f;
        double actual = StatisticFormulas.mean(values);
        assertEquals(expected, actual);
    }

    // Should return middle value 2
    @Test
    void median1() {
        int[] values = {2, 1, 0, 4, 3};
        double expected = 2;

        try {
            double actual = StatisticFormulas.median(values);
            assertEquals(expected, actual);
        } catch (Exception e) {
            System.out.println(e);
            fail();
        }
    }

    // Should throw an exception
    @Test
    void median2() {
        int[] values = {};

        try {
            StatisticFormulas.median(values);
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    // Should return average of middle values
    @Test
    void median3() {
        int[] values = {-1, 0, -100, 50, 33, 21};
        double expected = 10.5;

        try {
            double actual = StatisticFormulas.median(values);
            assertEquals(expected, actual);
        } catch (Exception e) {
            System.out.println(e);
            fail();
        }
    }

    // Return first most frequent value found 0
    @Test
    void mode1() {
        int[] values = {0, 1, 2, 3, 4, 5};
        double expected = 0;

        try {
            double actual = StatisticFormulas.mode(values);
            assertEquals(expected, actual);
        } catch (Exception e) {
            System.out.println(e);
            fail();
        }
    }

    // Throws exception
    @Test
    void mode2() {
        int[] values = {};

        try {
            StatisticFormulas.mode(values);
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    // Returns most frequent value 4
    @Test
    void mode3() {
        int[] values = {5, 3, 4, -1, 4 -1, 5, 5, 5, 4, 100, 4, 5, 4, 8, 4, 4};
        double expected = 4;

        try {
            double actual = StatisticFormulas.mode(values);
            assertEquals(expected, actual);
        } catch (Exception e) {
            System.out.println(e);
            fail();
        }
    }
}