
/**
 * Write a description of class gcdmod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gcdmod
{
    public static int count;
    public static int gcd(int p, int q) {
        if(count == 0) 
            System.out.print("Gcd for " + p + " and " + q);
        if (q == 0) {
            System.out.println(" returns " + p + " after " + count + " iterations");
            return p;
        }
        count++;
        return gcd(q, p % q);
    }
}
