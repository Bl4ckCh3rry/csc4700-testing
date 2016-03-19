import csc4700.PhoneNumberDemo;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneNumberDemoTests {

    @Test
    public void testPhoneNumbers() {
        PhoneNumberDemo d = new PhoneNumberDemo();

        assertTrue(d.isValid("123-456-7890"));
        assertTrue(d.isValid("(123)456-7890"));
        assertTrue(d.isValid("(123) 456-7890"));
        assertTrue(d.isValid("1234567890"));

        assertFalse(d.isValid("12345678"));
        assertFalse(d.isValid("jason"));
    }

    @Test
    public void testPhoneNumbersNull() {
        PhoneNumberDemo d = new PhoneNumberDemo();

        try {
            d.isValid(null);
            fail("Expected an error");
        }
        catch (IllegalArgumentException e) {
            // Expected
        }
    }

}
