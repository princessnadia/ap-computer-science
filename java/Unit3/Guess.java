import java.util.Scanner;
import java.util.Random;

public class Guess

{

    public static void main(String[] args)
    {
      int lbd = 1;
      int ubd = 5;
      int rng = 0;
      Scanner inp = new Scanner(System.in);
      Random gen = new Random();
      System.out.print("What do you want the lowest number to be?: ");
      lbd = inp.nextInt();
      System.out.print("What do you want the highest number to be?: ");
      ubd = inp.nextInt();
      rng = ubd - lbd;
      int mgn = gen.nextInt(rng) + lbd;
      // System.out.println(rng + ", " + lbd + ", " + ubd + ", " + mgn);
      
    }
}