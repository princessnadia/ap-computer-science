// **************************************************
//   LuckyNumbers.java
//
//   To generate three random "lucky" numbers 
// **************************************************

import java.util.*;

public class LakeLazyDays
{
   public static void main (String[] args)
   {
       Scanner inp = new Scanner(System.in);
       Random gen = new Random();
       int a;
       String b;
       System.out.println("----- Welcome to Lake Lazy Days Resort! -----");
       System.out.println("We'll decide on the activity depending on the weather.");
       System.out.print("How warm is it today?: ");
       a = inp.nextInt();
       if (a > 95) b = "hot";
       else b = "cold";
       if (a > 95 || a < 20) System.out.println("Ouch, it's too" + b + "to do anything. Visit our shops!");
       if (a >= 80 && a <= 95) System.out.println("Our pool is open, go swimming!");
       
    }
}
