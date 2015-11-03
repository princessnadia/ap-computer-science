// **************************************************
//   Dice.java
//
//   rolls dice
// **************************************************

import java.util.Random;

public class Dice
{
   public static void main (String[] args)
   {
      Random generator = new Random();
      int d1, d2;   

      // generate first die
      
      d1 = generator.nextInt(6) + 1;

	  // generate second die
 
      d2 = generator.nextInt(6) + 1;

      System.out.println ("Your dice rolled as " + d1 + " and " + d2 + ", totaling " + (d1 + d2));
    }
}
