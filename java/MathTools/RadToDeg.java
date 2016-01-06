import java.util.*;
import java.lang.Math;

public class RadToDeg
{
    public static double rtod (double r)
    {
        double deg = (double)r;
        deg = deg * 180.0;
	/*
        double num = rad;
        String numString = Double.toString(num);        
        String[] fraction = numString.split("\\.");
        int denominator = (int)Math.pow(10, fraction[1].length());
        int numerator = Integer.parseInt(fraction[0] + "" + fraction[1]);
        System.out.println(numerator + "/" + denominator);
        */
	return deg;
    }
}
