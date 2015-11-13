/*
 * Run.java
 * run this to start!
 */

import java.util.*;
import java.io.*;

public class MainMenu
{
    public static boolean fi;
    public static String name;
    public static int tlX = 0, tlY = 0, emi = 0;
    public static void start() throws FileNotFoundException, IOException
    {
        NotFound cnf = new NotFound();
        String[] ipcm;
        String ip, chapter;
        try (BufferedReader br = new BufferedReader(new FileReader("save.txt"))) {
            chapter = br.readLine();
        }
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        FileWriter save = new FileWriter("save.txt");
        System.out.println("-- Llama Adventure --" +
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
            switch(ipcm[0]) {
                case "quit":
                fi = true;
                save.write("M");
                save.close();
                System.out.println("Bye!");
                break;
                default:
                System.out.println(cnf);
                break;
            }
        } while(!fi);
    }
}
