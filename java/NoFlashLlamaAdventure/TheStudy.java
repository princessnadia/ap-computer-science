/*
 * Run.java
 * run this to start!
 */

import java.util.*;
import java.io.*;

public class TheStudy
{
    public static String name;
    public static int tlX = 0, tlY = 0, emi = 0;
    public static void P() throws FileNotFoundException, IOException
    {
        boolean fi = false;
        NotFound cnf = new NotFound();
        String[] ipcm;
        String ip, chapter;
        try (BufferedReader br = new BufferedReader(new FileReader("save.txt"))) {
            chapter = br.readLine();
        }
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        FileWriter save = new FileWriter("save.txt");
        System.out.println("-- The Study --");
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
            switch(ipcm[0]) {
                case "credits":
                System.out.println("This game was originally developed by Armor Games" + 
                    "\n\nOriginally programmed and written by jmtb02" +
                    "\n\nOriginally tested by Joey and Dan" +
                    "\n\nOriginal game copyright ArmorGames, 2009. Play it here! http://armorgames.com/play/3785/llama-adventure" +
                    "\n\nPorted to Java by Marlene Yuuki");
                break;
                case "quit":
                fi = true;
                save.write("S");
                save.close();
                System.out.println("Bye!");
                break;
                default:
                System.out.println(cnf);
                break;
            }
        } while(!fi);
    }

    public void I(String cmd1, String cmd2)
    {
        // not used in main menu
    }
}
