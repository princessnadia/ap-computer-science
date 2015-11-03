import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Guess2

{

    public static void main(String[] args)
    {
      int lbd = 1, ubd = 5, rng = 0, gus = 0, err = 0;
      Scanner inp = new Scanner(System.in);
      Random gen = new Random();
      System.out.print("What do you want the lowest number to be?: ");
      lbd = inp.nextInt();
      System.out.print("What do you want the highest number to be?: ");
      ubd = inp.nextInt();
      rng = ubd - lbd;
      int mgn = gen.nextInt(rng) + lbd;
      System.out.print("Guess a number!: ");
      gus = inp.nextInt();
      // System.out.println(rng + ", " + lbd + ", " + ubd + ", " + mgn);
      while(gus != mgn) {
          err = Math.abs(gus - mgn);
          System.out.println("Nope, it wasn't " + gus + "! You were " + err + " off.");
          System.out.print("Guess a number!: ");
          gus = inp.nextInt();
        }
      System.out.println("That's the number! Good job!");
    }
}