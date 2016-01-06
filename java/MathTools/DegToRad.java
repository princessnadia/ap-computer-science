import java.util.*;
import java.lang.Math;

public class DegToRad
{
    public static void main (String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int d;
        String r;
        System.out.print("\nDegree > ");
        d = inp.nextInt();
        r = dtor(d);
        System.out.println("" + r);
    }

    public static String dtor (int d)
    {
        double rad = (double)d;
        rad = rad / 180.0;
	/*
        double num = rad;
        String numString = Double.toString(num);        
        String[] fraction = numString.split("\\.");
        int denominator = (int)Math.pow(10, fraction[1].length());
        int numerator = Integer.parseInt(fraction[0] + "" + fraction[1]);
        System.out.println(numerator + "/" + denominator);
        */
	return ("r =" + rad);
    }
}
