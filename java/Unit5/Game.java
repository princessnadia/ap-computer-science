import java.util.*;
public class Game
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int attack, which;
        System.out.print("What is player 1's name: ");
        String name = scan.next();
        Player player1 = new Player(name, 120, 15);                 //player 1 starts with 120 health, 15 max attack
        System.out.print("What is player 2's name: ");
        name = scan.next();
        Player player2 = new Player(name, 85, 25);                  //player 2 starts with 85 health, 25 max attack
        System.out.print("What is player 3's name: ");
        name = scan.next();
        Player player3 = new Player(name);                          //player 3 starts with default 100 health, 20 max attack
        boolean game = true;
        
        do{
            if (player1.getHealth() > 0)
            {
                System.out.println("Who does " + player1.getName() + " attack");
                System.out.println("1. " + player2.getName() + "\n2. " + player3.getName());
                System.out.print("Select:" );
                which = scan.nextInt();
                if (which == 1)
                {
                    attack = player1.getAttack();                   //attack is a random number from 0 to max attack
                    player2.losesHealth(attack);                    //subtracts the attack from the player's health
                    System.out.print(player2.getName() + " loses " + attack + " health\n");
                    if (player2.getHealth() <= 0)
                        System.out.println(player2.getName() + " is dead");
                }
                if (which == 2)
                {
                    attack = player1.getAttack();
                    player3.losesHealth(attack);
                    System.out.print(player3.getName() + " loses " + attack + " health\n");
                    if (player3.getHealth() <= 0)
                        System.out.println(player3.getName() + " is dead");
                }
            }
            if (player2.getHealth() > 0)
            {
                System.out.println("Who does " + player2.getName() + " attack");
                System.out.println("1. " + player1.getName() + "\n2. " + player3.getName());
                System.out.print("Select:" );
                which = scan.nextInt();
                if (which == 1)
                {
                    attack = player2.getAttack();
                    player1.losesHealth(attack);
                    System.out.print(player1.getName() + " loses " + attack + " health\n");
                    if (player1.getHealth() <= 0)
                        System.out.println(player1.getName() + " is dead");
                }
                if (which == 2)
                {
                    attack = player2.getAttack();
                    player3.losesHealth(attack);
                    System.out.print(player3.getName() + " loses " + attack + " health\n");
                    if (player3.getHealth() <= 0)
                        System.out.println(player3.getName() + " is dead");
                }
            }
            if (player3.getHealth() > 0)
            {
                System.out.println("Who does " + player3.getName() + " attack");
                System.out.println("1. " + player1.getName() + "\n2. " + player2.getName());
                System.out.print("Select:" );
                which = scan.nextInt();
                if (which == 1)
                {
                    attack = player3.getAttack();
                    player1.losesHealth(attack);
                    System.out.print(player1.getName() + " loses " + attack + " health\n");
                    if (player1.getHealth() <= 0)
                        System.out.println(player1.getName() + " is dead");
                }
                if (which == 2)
                {
                    attack = player3.getAttack();
                    player2.losesHealth(attack);
                    System.out.print(player2.getName() + " loses " + attack + " health\n");
                    if (player2.getHealth() <= 0)
                        System.out.println(player2.getName() + " is dead");
                }
            }
            System.out.println(player1);
            System.out.println(player2);
            System.out.println(player3);
            if (player1.getHealth() <= 0 && player2.getHealth() <= 0)
                game = false;
            if (player1.getHealth() <= 0 && player3.getHealth() <= 0)
                game = false;
            if (player2.getHealth() <= 0 && player3.getHealth() <= 0)
                game = false;
        }while (game);
    }
}