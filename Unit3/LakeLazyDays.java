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
       if (a > 70) b = "hot";
       else if (a >= 40 && a <= 70) b = "nice";
       else b = "cold";
       // System.out.println("temp desc var is " + b + "\ntemp int var is " + a);
       if (a > 95 || a < 20) System.out.println("Oops, it's too " + b + " to do anything. Visit our shops!");
       else System.out.print("It's pretty " + b + " today! ");
       if (a >= 80 && a <= 95) System.out.print("Our pool is open, go swimming!");
       else if (a < 80 && a >= 60) System.out.print("Grab a racket and play tennis!");
       else if (a < 60 && a >= 40) System.out.print("Fore! Play some golf!");
       else if (a < 40 && a >= 20) System.out.print("Is it snowing? Our ski slope is open!");
    }
}
