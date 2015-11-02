// ************************************************

//   BaseConvert.java

//

//   Converts base 10 numbers to another base

//   (at most 4 digits in the other base).  The

//   base 10 number and the base are input.

// ************************************************

import java.util.Scanner;
import java.lang.Math;

public class BaseConvert

{

   public static void main (String[] args)

   {

      int base;        // the new base

      int base10Num;   // the number in base 10

      int maxNumber;   // the maximum number that will fit

                       // in 4 digits in the new base

      int place0;      // digit in the 1's (base^0) place

      int place1;      // digit in the base^1 place

      int place2;      // digit in the base^2 place

      int place3;      // digit in the base^3 place
      
      int nextBTN;

      String baseBNum = new String (""); // the number in the new base

      Scanner scan = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      // read in the base 10 number and the base

      System.out.println();

      System.out.println ("Base Conversion Program\n");

      System.out.print ("Please enter a base (2 - 9): ");

      base = scan.nextInt();

      maxNumber = (base * base * base * base) - 1; // Compute the maximum base 10 number that will fit in 4 digits

      // in the new base and tell the user what range the number they

      // want to convert must be in

      System.out.print ("Please enter a base 10 number to convert (1 - " + maxNumber + "): ");

      base10Num = scan.nextInt();
      
      place0 = base10Num % base;
      
      nextBTN = base10Num / base;
      
      place1 = nextBTN % base;
      
      base10Num = nextBTN / base;
      
      place2 = base10Num % base;
      
      nextBTN = base10Num / base;
      
      place3 = nextBTN % base;
      
      base10Num = nextBTN / base;
      
      sb.append(place3);
      sb.append(place2);
      sb.append(place1);
      sb.append(place0);
      baseBNum = "" + sb.toString();
      System.out.print(baseBNum);// Print the result (see notes in lab)

    }

}