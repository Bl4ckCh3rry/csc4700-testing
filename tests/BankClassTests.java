import csc4700.bank.Bank;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankClassTests {

    @Test
    public void testGetAndSet() {
        // Setup
        Bank b = new Bank();

        // Test
        b.setBalance("jdob", 100);
        b.setBalance("mdob", 5000);

        // Verify
        int found = b.getBalance("jdob");
        assertEquals(100, found);
    }

    @Test
    public void testGetInvalidName() {
        // Setup
        Bank b = new Bank();

        // Test
        try {
            b.getBalance("jdob");
            fail("expected error");
        }
        catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testListAccounts() {
        // Setup
        Bank b = new Bank();
        b.setBalance("jdob", 100);
        b.setBalance("mdob", 10000000);
        b.setBalance("ldob", 500);

        // Test
        String[] results = b.listAccounts();

        // Verify
        //String[] expected = {"jdob", "mdob", "ldob"};
        //assertArrayEquals(expected, results);
    }

}
