/**
 * Created by jdob on 2/22/15.
 */

import static org.junit.Assert.*;
import org.junit.Test;

import csc4700.NumbersDemo;


public class NumbersDemoTests {

    @Test
    public void testSum() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        int[] data = {4, 8, 6};

        // Test
        int result = d.sum(data);

        // Verify
        assertEquals(18, result);
    }

    @Test
    public void testSumEmptyArray() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        int[] data = new int[0];

        // Test
        int result = d.sum(data);

        // Verify
        assertEquals(0, result);
    }

    @Test
    public void testSumNull() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        int[] data = null;

        // Test
        try {
            int result = d.sum(data);
            fail("Null Pointer Expected");
        }
        catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testAverage() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        int[] data = {1, 1, 3};

        // Test
        float result = d.average(data);

        // Verify
        assertEquals(5/3f, result, 0.001);
    }
}
