/*
 * Run.java
 * run this to start!
 */

import java.util.*;
import java.io.*;

public class TheStudy
{
    private static boolean door = false, fi = false, debug = false, room = true, killed = false;
    private static int grabbed = 0;
    public static void P() throws FileNotFoundException, IOException
    {
        NotFound cnf = new NotFound();
        String[] ipcm;
        String ip, chapter, name = "";
        String regex = "(at|with|on|the)";
        try (BufferedReader br = new BufferedReader(new FileReader("save.txt"))) {
            chapter = br.readLine();
        }
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        FileWriter save = new FileWriter("save.txt");
        do {
            System.out.println("\f-- The Study: Introducing Us --"); // change to chapter name
            try {
                Thread.sleep(750);
            }
            catch (Exception e) {}
            // start non-looping intro
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
                System.out.println("Of course you are a Llama! I shall call you that.");
            }
            else
            if (ip.equals("Marlene"))
            {
                System.out.println("Debug mode enabled!");
                debug = true;
                name = "Marlene";
            }
            else
            {
                System.out.println("Oh ho! " + ip + "! Such a ghastly thing to call yourself!" +
                    "\nI will call you Llama. You are a Llama right? (yes/no)");
                name = "Llama";
                do 
                {

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
            System.out.println("\nWell then " + name + ", we're going to start right away. If" +
                "\nyou would open the door we can start. You can do" +
                "\nthat by typing that into your magical button board!" +
                "\nOr you can look around first! Always look around in" +
                "\nevery room!");
            fi = false;
            // end non-looping intros
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
                    case "use":
                    if(ipcm.length > 1) 
                    {
                        if(ipcm.length > 2) U(ipcm[1],ipcm[2]);
                        else U(ipcm[1]);
                    } 
                    else
                    {
                        System.out.println("What are you trying to do, Llama? When you utilize" +
                            "\nthe word (use) make sure you follow up with a noun" +
                            "\nsuch as (door) or (books)... if you need help finding" +
                            "\nwords (look around) or something!");
                    }
                    break;
                    case "go":
                    if (door)
                    {
                        System.out.println("I'll see you in the next room Llama. Tally-ho!");
                        fi = true;
                        room = false;
                    }
                    else
                    {
                        System.out.println("Sorry, I don't know where you are trying to go! Did you open the door?");
                    }
                    break;
                    case "see":
                    case "gaze":
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
                    case "take":
                    case "grab":
                    case "pickup":
                    if(ipcm.length > 1) 
                    {
                        G(ipcm[1],false);
                    } 
                    else
                    {
                        System.out.println("What are you going on about llama? There's nothing to take of that nature around here!");
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
            } 
            while (!fi);
            if (killed)
            {
                fi = false;
                System.out.println("Do you want to try this room again llama? (yes) to start" +
                    "\nthis level over, (no) to let me bury you and start" + 
                    "\nstart another llama sometime.");
                do 
                {
                    System.out.print("> ");
                    ip = inp.nextLine();
                    ip = ip.toLowerCase();
                    switch (ip)
                    {
                        case "yes":
                        System.out.println("Starting over...");
                        fi = true;
                        break;
                        case "no":
                        System.out.println("Goodbye!"); 
                        System.exit(0);
                        break;
                        default:
                        System.out.println("I know you are unconscious, but answer me llama. (yes)" +
                            "\nor (no) will do.");
                        break;
                    }
                } while (!fi);
            }
        }
        while(room);
        Chapter1.P();
    }

    // commands
    /* 
     * items:
     * books - 1
     * computering - 11
     * door - 2
     * room (around) - 99
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
            return "I see you looking at my study! It has that stuffy" +
            "\nfragrance of old man and olive oil, not from me mind" +
            "\nyou! My bookshelf reaches the ceiling from the floor" +
            "\nand are stacked with several old (books) I have" +
            "\nacquired through the many years I have seen come" +
            "\nand go. That (door) behind you leads to the first room" +
            "\nof your adventure, so stop dawdling and go through" +
            "\nit!";
            default:
            return "I'm not quite sure what you are looking at.";
        }
    }

    /*
     * usables 1a:
     * door - 2
     */
    private static void U(String it)
    {
        switch(it)
        {
            case "door":
            if (!door)
            {
                door = true;
                System.out.println("You opened the door, and you're off to the next" +
                    "\nroom! Just go through now and you're on your way.");
            }
            else
            {
                System.out.println("The door is already open!");
            }
            break;
            default:
            System.out.println("What are you trying to do, Llama? When you utilize" +
                "\nthe word (use) make sure you follow up with a noun" +
                "\nsuch as (door) or (books)... if you need help finding" +
                "\nwords (look around) or something!");
        }
    }

    /*
     * usables 2a:
     * -- none --
     */
    private static void U(String it, String it2)
    {
        switch(it)
        {
            case "door":
            if (!door)
            {
                door = true;
                System.out.println("You opened the door, and you're off to the next" +
                    "\nroom! Just go through now and you're on your way.");
            }
            else
            {
                System.out.println("The door is already open!");
            }
            break;
            default:
            System.out.println("What are you trying to do, Llama? When you utilize" +
                "\nthe word (use) make sure you follow up with a noun" +
                "\nsuch as (door) or (books)... if you need help finding" +
                "\nwords (look around) or something!");
        }
    }

    /*
     * grabbables:
     * -- none --
     * (remember "cannot grab" responses)
     */
    private static void G(String it, boolean drop)
    {
        if (!drop)
        {
            switch(it)
            {
                case "door":
                System.out.println("It's too heavy llama. Plus I lost my tools a while back" +
                    "\nand haven't been able to do any maintenance for" +
                    "\nsome time.");
                break;
                case "books":
                System.out.println("You can't have ALL my books llama.");
                break;
                case "computering":
                grabbed = 11;
                System.out.println("You have picked up the computering book! Don't lick" +
                "\nthe pages unless you are turning them.");
                break;
                case "room":
                System.out.println("That makes no sense llama! You are full of silly. In" +
                "\nfact I would almost say you're distilled down to a" +
                "\n pure sense of silly, like a fine coffee or tea!");
                break;
                default: 
                System.out.println("What are you going on about llama? There's nothing to take of that nature around here!");
                break;
            }
        }
        else
        {
            String itn = "";
            switch (grabbed)
            {
                case 11:
                itn = "computering";
                break;
                default:
                itn = "";
            }
            System.out.println("You put back the " + itn + " where you found it.");
            grabbed = 0;
        }
    }
}
