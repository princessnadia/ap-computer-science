import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class DegToRad
{
    public static double dtor (double d)
    {
        DecimalFormat df = new DecimalFormat("#.00");
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
        return Double.valueOf(df.format(rad));
    }
}
