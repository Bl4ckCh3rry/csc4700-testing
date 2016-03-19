import csc4700.NumbersDemo;
import org.junit.Test;

import static org.junit.Assert.*;


public class NumbersDemoClassTests {

    @Test
    public void testParseAndSum() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        String data = "1,2,3,4";

        // Test
        int result = d.parseAndSum(data);

        // Verify
        assertEquals(10, result);
    }

    @Test
    public void testJustSpaces() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        String data = "     ";

        // Test
        try {
            int result = d.parseAndSum(data);
            fail("Expected exception");
        }
        catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testParseAndSumNull() {
        NumbersDemo d = new NumbersDemo();

        try {
            d.parseAndSum(null);
            fail("expected exception");
        }
        catch (IllegalArgumentException e) {
            // Expected
        }
    }

}
