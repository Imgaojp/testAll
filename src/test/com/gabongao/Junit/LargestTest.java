package test.com.gabongao.Junit;

import com.gabongao.Junit.Largest;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

/**
 * Largest Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>02/15/2017</pre>
 */
public class LargestTest extends TestCase {
    public LargestTest(String name) {
        super(name);
    }

    public void testSimple() {
        assertEquals(9, Largest.largest(new int[]{7, 8, 9}));
    }

    public void testOrder() {
        assertEquals(9, Largest.largest(new int[]{9, 8, 7}));
        assertEquals(9, Largest.largest(new int[]{7, 9, 8}));
        assertEquals(9, Largest.largest(new int[]{7, 8, 9}));
    }

    public void testDups() {
        assertEquals(9, Largest.largest(new int[]{9, 7, 9, 8}));
    }

    public void testOne() {
        assertEquals(1, Largest.largest(new int[]{1}));
    }

    public void testNegative() {
        assertEquals(-7, Largest.largest(new int[]{-9, -8, -7}));
    }

    public void testEmpty() {
        try {
            Largest.largest(new int[]{});
            fail("Should have thrown an exception");
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }
//    public void setUp() throws Exception {
//        super.setUp();
//    }
//
//    public void tearDown() throws Exception {
//        super.tearDown();
//    }
//
//    public static Test suite() {
//        return new TestSuite(LargestTest.class);
//    }
}
