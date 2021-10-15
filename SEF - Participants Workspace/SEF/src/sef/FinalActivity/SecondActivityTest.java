package sef.FinalActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

    private SecondActivity theCalculator;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        theCalculator = new SecondActivity();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testSumPositiveValue() {
        assertEquals(10, (theCalculator.sum(5,5)));
        assertEquals(10,(theCalculator.sum(8,2)));
    }

    public void testSumNegativeValue(){
        assertEquals(10, (theCalculator.sum(20,-10)));
        assertEquals(0, (theCalculator.sum(10,-10)));
    }

    public void testSubtractPositive(){
        assertEquals(1,(theCalculator.subtract(10,9)));
        assertEquals(2,(theCalculator.subtract(11,9)));
    }

    public void testSubtractNegative(){
        assertEquals(-15,(theCalculator.subtract(-5,10)));
        assertEquals(-15,(theCalculator.subtract(-10,5)));
    }

    public void testDividePositiveValue(){
        assertEquals(5, (theCalculator.divide(15,3)));
        assertEquals(4,(theCalculator.divide(20,5)));
    }

    public void testDivideNegativeValue(){
        assertEquals(-5,(theCalculator.divide(-20,4)));
        assertEquals(-5,(theCalculator.divide(30,-6)));
    }

    public void testDivineNull(){
        assertEquals(0,(theCalculator.divide(0,10)));
        assertEquals(Double.POSITIVE_INFINITY, (theCalculator.divide(10,0)));
    }

    public void testMultiplyPositiveValue(){
        assertEquals(14,(theCalculator.multiply(2,7)));
        assertEquals(10,(theCalculator.multiply(2,5)));
    }

    public void testMultiplyNegativeValue(){
        assertEquals(-3,(theCalculator.multiply(-1,3)));
        assertEquals(-4,(theCalculator.multiply(2,-2)));
    }

    public void testMultiplyNull(){
        assertEquals(0,(theCalculator.multiply(0,5)));
        assertEquals(0,(theCalculator.multiply(5,0)));
    }
}
