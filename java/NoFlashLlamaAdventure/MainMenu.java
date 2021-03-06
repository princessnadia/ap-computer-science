/*
 * Run.java
 * run this to start!
 */

import java.util.*;
import java.io.*;

public class MainMenu
{
    private static NotFound cnf = new NotFound();
    public static void P() throws FileNotFoundException, IOException
    {
        boolean fi = false, sw = false;
        
        String[] ipcm;
        String ip, chapter;
        try (BufferedReader br = new BufferedReader(new FileReader("save.txt"))) {
            chapter = br.readLine();
        }
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        FileWriter save = new FileWriter("save.txt");
        System.out.println("\f-- Llama Adventure --" +
            "\n\nA Text Adventure to Greener Pastures" +
            "\n\nType a word to start:" +
            "\n\nstart\nBegin the game!" +
            "\n\ncontinue\nBegin where you left off." +
            "\n\ncredits\nSee who made the game!" +
            "\n\nquit\nChanged your mind?");
        do {
            ip = "";
            System.out.print("> ");
            try {
                ip = inp.nextLine();
            }
            catch (NoSuchElementException n)
            {
                System.out.println("--break--");
                fi = true;
            }
            ip = ip.toLowerCase();
            ipcm = ip.split("\\s+");
            try {
                Thread.sleep(750);
            }
            catch (Exception e) {}
            switch(ipcm[0]) {
                case "start":
                System.out.println("Good call, let's start!");
                fi = true;
                sw = true;
                chapter = "S";
                break;
                case "continue":
                try
                {
                    if (chapter.equals("M"))
                    {
                        System.out.println("You haven't started the game yet.");
                    }
                    else
                    {
                        fi = true;
                        sw = true;
                        System.out.println("I'm loading your game, standby!");
                    }
                }
                catch (NullPointerException e)
                {
                    System.out.println("You haven't started the game yet.");
                }
                break;
                case "credits":
                System.out.println("This game was originally developed by Armor Games" + 
                    "\n\nOriginally programmed and written by jmtb02" +
                    "\n\nOriginally tested by Joey and Dan" +
                    "\n\nOriginal game copyright ArmorGames, 2009. Play it here! http://armorgames.com/play/3785/llama-adventure" +
                    "\n\nPorted to Java by Marlene Yuuki");
                break;
                case "quit":
                save.write("M");
                save.close();
                System.out.println("Bye!");
                System.exit(0);
                break;
                default:
                System.out.println(cnf);
                break;
            }
        } while(!fi);
        try {
                    Thread.sleep(1500);
                }
                catch (Exception e) {}
        if (sw) 
        {
            switch (chapter)
            {
                case "Study":
                TheStudy.P();
                break;
                case "One":
                Chapter1.P();
                break;
            }
        }
    }

    public void U(String cmd1, String cmd2)
    {
        // not used in main menu
    }
}
