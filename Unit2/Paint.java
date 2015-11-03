//***************************************************************

//File: Paint.java

//

//Purpose: Determine how much paint is needed to paint the walls

//of a room given its length, width, and height

//***************************************************************

import java.util.*;
import java.text.*;

public class Paint

{

    public static void main(String[] args)

    {
        DecimalFormat thdc = new DecimalFormat ("0.###");
        final int cov = 350;  //paint covers 350 sq ft/gal

        int ln, wd, hi, dr, wn;

        double tlSqFt;

        double pnRq;

        Scanner scan = new Scanner(System.in);

        System.out.print("How long is the room in feet? "); ln = scan.nextInt();

        System.out.print("How wide is the room? "); wd = scan.nextInt();

        System.out.print("How high is the room? "); hi = scan.nextInt();
        
        System.out.print("How many doors are in the room? "); dr = scan.nextInt();
        
        System.out.print("How many windows are in the room? "); wn = scan.nextInt();

        double lw = (ln * wd);
        double lh = 2 * (ln * hi);
        double wh = 2 * (wd * hi);
        tlSqFt = (lw + lh + wh) - (20 * dr) - (15 * wn);

        pnRq = tlSqFt / cov;

        System.out.println("Your room\'s surface area is " + tlSqFt + " feet, computed from: \na length of " + ln + " feet, \na width of " + wd + " feet, \nand a height of " + hi + " feet.");
        System.out.println("You\'ll need about " + thdc.format(pnRq) + " gallons of paint.");

    }

}