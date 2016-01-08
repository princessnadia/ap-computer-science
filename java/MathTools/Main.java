import java.util.*;

public class Main
{
    public static void main (String[] args)
    {
        Scanner inp = new Scanner(System.in);
        Random gen = new Random();
        int a;
        String b;
        System.out.println("----- SELECT FUNCTION -----");
        System.out.println("1. DEGREES TO RADIANS");
        System.out.println("2. RADIANS TO DEGREES");
        System.out.println("3. GREATEST COMMON DENOMINATOR");
        //System.out.println("");
        //System.out.println("");
        //System.out.println("");
        System.out.print("> ");
        a = inp.nextInt();
        switch(a)
        {
            case 1:
            System.out.print("\nd = ");
            double dd = inp.nextDouble();
            System.out.println("r = " + Math2.dtor(dd));
            break;
            case 2:
            System.out.print("\nr = ");
            double rr = inp.nextDouble();
            System.out.println("d = " + Math2.rtod(rr));
            break;
            case 3:
            System.out.print("\na = ");
            int ga = inp.nextInt();
	    System.out.print("\nb = ");
	    int gb = inp.nextInt();
	    System.out.println("gcd = " + Math2.gcd(ga,gb));
            default:
            break;
        }
    }
}
