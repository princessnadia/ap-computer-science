/*
 * Run.java
 * run this to start!
 */

import java.util.*;
import java.io.*;

public class TheStudy
{
    private static boolean door;
    public static void P() throws FileNotFoundException, IOException
    {
        boolean fi = false, debug = false;
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
        if (ip.equals("Llama"))
        {
            System.out.println("Of course you are a Llama! I will call you that.");
        }
        else
        if (ip.equals("Marlene"))
        {
            System.out.println("Debug mode enabled!");
            debug = true;
        }
        else
        {
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
        }
        try {
            Thread.sleep(750);
        }
        catch (Exception e) {}
        System.out.println("\nWell then Llama, we're going to start right away. If" +
            "\nyou would open the door we can start. You can do" +
            "\nthat by typing that into your magical button board!" +
            "\nOr you can look around first! Always look around in" +
            "\nevery room!");
        fi = false;
        do {
            ip = "";
            System.out.print("\n> ");
            try {
                ip = inp.nextLine();
            }
            catch (NoSuchElementException n)
            {
                System.out.println("--break--");
                System.exit(0);
            }
            ip = ip.toLowerCase();
            ip = ip.replaceAll(regex, "");
            ipcm = ip.split("\\s+");
            try {
                Thread.sleep(750);
            }
            catch (Exception e) {}
            switch(ipcm[0]) {
                case "open":
                if(ipcm.length > 1) 
                {
                    U(ipcm[1]);
                } 
                else
                {
                    System.out.println("What are you trying to do, Llama? When you utilize" +
                        "\nthe word (use) make sure you follow up with a noun" +
                        "\nsuch as (door) or (books)... if you need help finding" +
                        "\nwords (look around) or something!");
                }
                case "use":
                if(ipcm.length > 1) 
                {
                    U(ipcm[1]);
                } 
                else
                {
                    System.out.println("What are you trying to do, Llama? When you utilize" +
                        "\nthe word (use) make sure you follow up with a noun" +
                        "\nsuch as (door) or (books)... if you need help finding" +
                        "\nwords (look around) or something!");
                }
                case "look":
                if(ipcm.length > 1) 
                {
                    System.out.println(L(ipcm[1]));
                } 
                else
                {
                    System.out.println("I'm not quite sure what you are looking at.");
                }
                break;
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
                case "go":
                System.out.println("I'll see you in the next room Llama. Tally-ho!");
                fi = true;
                case "quit":
                save.write("S");
                save.close();
                System.out.println("Bye!");
                System.exit(0);
                break;
                default:
                System.out.println(cnf);
                break;
            }
        } while(!fi);
        // Chapter1.P();
    }

    /* 
     * lookables:
     * books
     * - computering
     * door
     * room (around)
     */
    private static String L(String it)
    {
        switch(it)
        {
            case "books":
            return "My books are arranged haphazardly across the" +
            "\nshelves for my pleasure. Some books even face" +
            "\nbackwards so that the spine rests agains the back of" +
            "\nthe bookshelf, got to protect the spine! My favourite" +
            "\nbook is a title called (computering) over there.";
            case "computering":
            return "Here Llama, I'll read you the intro. 'Hello computer" +
            "\nuser. The first step to setup your account is to set" +
            "\nseveral five digit passwords on your documents. This" +
            "\nway you can protect yourself in case of computer" +
            "\nattack or snooping onlookers...' tisk tisk Llama, we" +
            "\nhave work to do. Let's get going through that (door)" +
            "\nover there!";
            case "door":
            return "The wooden door has a small bolt on it, easy enough" +
            "\nto slide (open) with little effort. The hinge pushes" +
            "\noutward away from the door.";
            case "around":
            return "I see you looking at my study! It has that stuffy" +
            "\nfragrance of old man and olive oil, not from me mind" +
            "\nyou! My bookshelf reaches the ceiling from the floor" +
            "\nand are stacked with several old (books) I have" +
            "\nacquired through the many years I have seen come" +
            "\nand go. That (door) behind you leads to the first room" +
            "\nof your adventure, so stop dawdling and go through" +
            "\nit!";
            case "room":
            return "";
            default:
            return "I'm not quite sure what you are looking at.";
        }
    }

    /*
     * usables:
     * door
     */
    private static void U(String it)
    {
        switch(it)
        {
            case "door":
            door = true;
            System.out.println("You opened the door, and you're off to the next" +
                "\nroom! Just go through now and you're on your way.");
            default:
            System.out.println("What are you trying to do, Llama? When you utilize" +
                "\nthe word (use) make sure you follow up with a noun" +
                "\nsuch as (door) or (books)... if you need help finding" +
                "\nwords (look around) or something!");
        }
    }

}
