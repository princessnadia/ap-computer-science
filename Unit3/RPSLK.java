// ****************************************************************

//   Rock.java

//

//   Play Rock, Paper, Scissors, Lizard, Spock with the user

//         

// ****************************************************************

import java.util.Scanner;
import java.util.Random;

public class RPSLK

{

    public static void main(String[] args)
    {
      String personPlay = "0";    //User's play -- "R", "P", or "S"
      String computerPlay = "0";  //Computer's play -- "R", "P", or "S"
      int computerInt = 0;      //Randomly generated number used to determine
      int i;
      
      Scanner inp = new Scanner(System.in);
      Random gen = new Random();
      System.out.println("Let's play!");
      //Get player's play -- note that this is stored as a string
      System.out.print("Your move? ((R)ock, (P)aper, (S)cissors, (L)izard, Spoc(k)): ");
      //Make player's play uppercase for ease of comparison
      personPlay = inp.next();
      personPlay = personPlay.toUpperCase();
      //Generate computer's play (0,1,2)
      for (i=1; i >= 1000; i++) {
      computerInt = gen.nextInt(4);
      }
      //Translate computer's randomly generated play to string
      switch (computerInt)
      {
          case 0: computerPlay = "R"; break;
          case 1: computerPlay = "P"; break;
          case 2: computerPlay = "S"; break;
          case 3: computerPlay = "L"; break;
          case 4: computerPlay = "K"; break;
          default: return;
      }

 

      //Print computer's play
      System.out.print("Computer's move?: ");
      try {
          Thread.sleep(1500);
        }
      catch (Exception e) {}
      switch (computerInt)
      {
          case 0: System.out.print("R\n"); break;
          case 1: System.out.print("P\n"); break;
          case 2: System.out.print("S\n"); break;
          case 3: System.out.print("L\n"); break;
          case 4: System.out.print("K\n"); break;
          default: return;
      }

      if (personPlay.equals(computerPlay)) System.out.println("It's a tie!");
      else if (personPlay.equals("R")) {
          if (computerPlay.equals("P")) System.out.println("Paper covers rock - you lose...");
          else if (computerPlay.equals("S")) System.out.println("Rock crushes scissors - you win!");
          else if (computerPlay.equals("L")) System.out.println("Rock crushes lizard - you win!");
          else if (computerPlay.equals("K")) System.out.println("Spock vaporizes rock - you lose...");
        }
      else if (personPlay.equals("P")) {
          if (computerPlay.equals("S")) System.out.println("Scissors cuts paper - you lose...");
          else if (computerPlay.equals("L")) System.out.println("Lizard eats paper - you lose...");
          else if (computerPlay.equals("K")) System.out.println("Paper disproves Spock - you win!");
          else if (computerPlay.equals("R")) System.out.println("Paper covers rock - you win!");
        }
      else if (personPlay.equals("S")) {
          if (computerPlay.equals("L")) System.out.println("Scissors decapitates lizard - you win!");
          else if (computerPlay.equals("K")) System.out.println("Spock smashes scissors - you lose...");
          else if (computerPlay.equals("R")) System.out.println("Rock crushes scissors - you lose...");
          else if (computerPlay.equals("P")) System.out.println("Scissors cuts paper - you win!");
        }
      else if (personPlay.equals("L")) {
          if (computerPlay.equals("K")) System.out.println("Lizard poisons Spock - you win!");
          else if (computerPlay.equals("R")) System.out.println("Rock crushes lizard - you lose...");
          else if (computerPlay.equals("P")) System.out.println("Lizard eats paper - you win!");
          else if (computerPlay.equals("S")) System.out.println("Scissors decapitates lizard - you lose...");
        }
      else if (personPlay.equals("K")) {
          if (computerPlay.equals("R")) System.out.println("Spock vaporizes rock - you win!");
          else if (computerPlay.equals("P")) System.out.println("Paper disproves Spock - you lose...");
          else if (computerPlay.equals("S")) System.out.println("Spock smashes scissors - you win!");
          else if (computerPlay.equals("L")) System.out.println("Lizard poisons Spock - you lose...");
        }
}
}