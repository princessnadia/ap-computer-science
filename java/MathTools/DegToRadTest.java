

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class DegToRadTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DegToRadTest
{
    @Test(timeout=5000)
    public void test240() {
        double result = DegToRad.dtor(240);
        assertEquals(1.33, result, 1e-8);
    }
    
    @Test(timeout=5000)
    public void test360() {
        double result = DegToRad.dtor(360);
        assertEquals(2.00, result, 1e-8);
    }
    
    @Test(timeout=5000)
    public void test720() {
        double result = DegToRad.dtor(720);
        assertEquals(4.00, result, 1e-8);
    }
    
    @Test(timeout=5000)
    public void test1000() {
        double result = DegToRad.dtor(1000);
        assertEquals(5.56, result, 1e-8);
    }
}
