import java.util.*;

public class GradeElseIf
{
   public static void main (String[] args)
   {
       Scanner inp = new Scanner(System.in);
       Random gen = new Random();
       int a;
       String b;
       String c = "a ";
       System.out.print("What's your grade in class?: ");
       a = inp.nextInt();
       if (a >= 90) { b = "A"; c = "an "; }
       else if (a >= 80) b = "B"; 
       else if (a >= 70) b = "C";
       else if (a >= 60) b = "D";
       else { b = "F"; c = "an "; }
       System.out.println("Your current grade is " + c + b + "!");
    }
}
