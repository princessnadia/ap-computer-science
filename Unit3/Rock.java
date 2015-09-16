// ****************************************************************

//   Rock.java

//

//   Play Rock, Paper, Scissors with the user

//         

// ****************************************************************

import java.util.Scanner;

import java.util.Random;

 

public class Rock

{

    public static void main(String[] args)
    {
      String personPlay;    //User's play -- "R", "P", or "S"
      String computerPlay;  //Computer's play -- "R", "P", or "S"
      int computerInt;      //Randomly generated number used to determine
                            //computer's play
      Scanner inp = new Scanner(System.in);
      Random gen = new Random();
      System.out.println("Let's play!");
      //Get player's play -- note that this is stored as a string
      System.out.print("Your move? (R, P, S): ");
      //Make player's play uppercase for ease of comparison
      personPlay = inp.nextChar();
      personPlay = personPlay.toUpperCase();
      //Generate computer's play (0,1,2)
      //Translate computer's randomly generated play to string
      switch (computerInt)
      {
 

      }

 

      //Print computer's play

      //See who won.  Use nested ifs instead of &&.

      if (personPlay.equals(computerPlay)) System.out.println("It's a tie!");
      else if (personPlay.equals("R")) {
        }
}
}