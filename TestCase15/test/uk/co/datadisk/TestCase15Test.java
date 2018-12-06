package uk.co.datadisk;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class TestCase15Test {

    @Test
    public void testEquals() {
        assertEquals(true, true);
    }

    @Test
    public void testNotEquals() {
        assertNotEquals(true, false);
    }
}