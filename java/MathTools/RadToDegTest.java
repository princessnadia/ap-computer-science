

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Tests RadToDeg
 *
 * @author  marlene yuuki
 * @version d71.01.06
 */
public class RadToDegTest
{
    @Test(timeout=5000)
    public void test240() {
        double result = RadToDeg.rtod(1.33);
        assertEquals(240, result, 1e-0);
    }
    
    @Test(timeout=5000)
    public void test360() {
        double result = RadToDeg.rtod(2.00);
        assertEquals(360, result, 1e-0);
    }
    
    @Test(timeout=5000)
    public void test720() {
        double result = RadToDeg.rtod(4.00);
        assertEquals(720, result, 1e-0);
    }
    
    @Test(timeout=5000)
    public void test1000() {
        double result = RadToDeg.rtod(5.56);
        assertEquals(1000, result, 1e-0);
    }
}
