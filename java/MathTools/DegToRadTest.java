

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
        String result = DegToRad.dtor(240);
        assertEquals("4.0(pi)", result);
    }
    
    @Test(timeout=5000)
    public void test360() {
        String result = DegToRad.dtor(240);
        assertEquals("2.0(pi)", result);
    }
    
    @Test(timeout=5000)
    public void test720() {
        String result = DegToRad.dtor(720);
        assertEquals("4.0(pi)", result);
    }
    
    @Test(timeout=5000)
    public void test1000() {
        String result = DegToRad.dtor(240);
        assertEquals("50.0(pi)", result);
    }
}
