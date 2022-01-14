package tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import model.Item;
                 
/**
 * Tests of the Item class.
 * 
 * @author Hyunggil Woo
 * @version Winter 2022
 */

public class ItemTest {
    
    /** Zero constant to check on the test. */
    private static final int ZERO_IN_INT = 0;
    
    /** A five constant to check on the test. */
    private static final int FIVE_IN_INT = 5;
    
    /** A negative constant of -2. */
    private static final int NEG_TWO_IN_INT = -2;
    
    /** A negative constant of 0 in Big Decimal. */
    //private static final BigDecimal ZERO = 0;
    
    /** One in Big Decimal. */
    //private static final BigDecimal ONE = 1;
    
    /** Ten in Big Decimal */
    //private static final BigDecimal TEN = 10;
    
    
    
    
    // The test fixture. The Objects I will use in the tests.
    /** An Item to use in the tests. */
    private Item myItem;
    
    /**
     * A method to initialize the test fixture before each test.
     */
    @Before
    public void setUp() {
        myItem = new Item(null, null);
    }
    
    /**
     * Uses JUnit 4 Syntax when checking for an exception.
     */
    @Test (expected = NullPointerException.class)
    public void testItemNPE() {
        new Item(null, null);
    }
    
}