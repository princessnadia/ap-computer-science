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
        String regex = "(at|with|on|the)";
        try (BufferedReader br = new BufferedReader(new FileReader("save.txt"))) {
            chapter = br.readLine();
        }
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        FileWriter save = new FileWriter("save.txt");
        System.out.println("\f-- The Study --");
        try {
            Thread.sleep(750);
        }
        catch (Exception e) {}
        System.out.println("Hello you! I am so glad they finally shipped you here. " +
            "\nA spot of bother with the street address, but that was fixed I assure you!" +
            "\n\nAside from that, what is your name?");
        System.out.print("> ");
        ip = inp.nextLine();
        try {
            Thread.sleep(750);
        }
        catch (Exception e) {}
        do 
        {
            System.out.println("Oh ho! " + ip + "! Such a ghastly thing to call yourself!" +
                "\nI will call you Llama. You are a Llama right? (yes/no)");
            System.out.print("> ");
            ip = inp.nextLine();
            ip = ip.toLowerCase();
            switch (ip)
            {
                case "yes":
                System.out.println("Of course you are, I am always right! You will learn" +
                "\nthat soon enough.");
                fi = true;
                break;
                case "no":
                System.out.println("Cheeky Llama! You know what you are and I do too!" +
                "\nGot some humour we do!"); 
                fi = true;
                break;
                default:
                System.out.println("Come again? I'll take a yes or no as an answer!");
                break;
            }
            
        } while (!fi);
        System.out.println("Well then Llama, we're going to start right away. If" +
        "\nyou would open the door we can start. You can do" +
        "\nthat by typing that into your magical button board!" +
        "\nOr you can look around first! Always look around in" +
        "\nevery room!");
        fi = false;
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
            ip = ip.replaceAll(regex, "");
            ipcm = ip.split("\\s+");
            switch(ipcm[0]) {
                case "help":
                System.out.println("A bit lost are we llama?" + 
                    "\n\nHere are some keywords you can think about using:" +
                    "\n(open), (use), (go), (look/see/gaze), (take/grab/pickup), (drop)" +
                    "\n\nIf you want to get a sense of what's in the room, use" +
                    "\nthe phrase (look around). Build short sentences!" +
                    "\n\nAlso remember that new words will crop up as you" +
                    "\nexplore more." +
                    "\n\nYou can always find (help) by mashing that term here!");
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
    
    /* lookables:
     * books
     * - computering
     * door
     * room (around)
     */
    
    
    
}
