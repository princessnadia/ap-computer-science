// **************************************************
//   LuckyNumbers.java
//
//   To generate three random "lucky" numbers 
// **************************************************

import java.util.*;

public class SimpleIf
{
   public static void main (String[] args)
   {
       Scanner inp = new Scanner(System.in);
       Random gen = new Random();
       StringBuilder stb = new StringBuilder();
       int a;
       int b = gen.nextInt(21);
       int c = gen.nextInt(21);
       int d = (b + c);
       int e;
       int f;
       System.out.println("----- FIRST PROMPT -----");
       System.out.print("What is your favorite number?: ");
       a = inp.nextInt();
       if (a == 413)
           System.out.println("Hey, that's my favorite number too!");
       else
           System.out.println("That's an interesting number!");
       
       System.out.println("----- SECOND PROMPT -----");
       System.out.print("How old are you?: ");
       a = inp.nextInt();
       if (a >= 16) {
           System.out.println("Hey, go out and drive!");
        }
       else {
           System.out.println("Just " + (16 - a) + " years until you're driving!");
        }
        
       System.out.println("----- THIRD PROMPT -----");
       System.out.print("What is " + b + " + " + c + "?: ");
       e = inp.nextInt();
       if (d == e) {
           System.out.println("CORRECT! The number was " + d + "!");
        }
        else {
           f = Math.abs(e - d);
           System.out.println("INCORRECT! The number was " + d + ", and you were off by " + f + "!");
        }
       System.out.println("----- END OF PROMPTS -----");
   }
}
