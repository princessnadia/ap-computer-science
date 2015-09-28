import java.util.*;

public class LoveCS

{

    public static void main(String[] args)

    {
      int limit = 0;
      int count = 0;
      int sum = 1;
      Scanner inp = new Scanner(System.in);
      System.out.print("print how many lines?: ");
      limit = (inp.nextInt() - 1);

      while (count <= limit){

          System.out.println((count + 1) + " I love Computer Science!!");

          count++;
          sum += count;

      }
      
      System.out.println("printed " + count + " lines.\nlines 1 to " + count + " adds up to " + (sum - 1) + ".");
      

    }

}