/**
 * Created by jdob on 2/22/15.
 */

import static org.junit.Assert.*;
import org.junit.Test;

import csc4700.SortDemo;


public class SortDemoTests {

    @Test
    public void testInPlaceSort() {
        // Setup
        SortDemo d = new SortDemo();
        int[] data = {4, 2, 6};

        // Test
        int[] result = d.sort(data);

        // Verify
        int[] expected = {2, 4 ,6};
        assertArrayEquals(expected, data);
    }

}
