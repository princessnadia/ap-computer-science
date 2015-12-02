/*
 * Run.java
 * run this to start!
 */

import java.util.*;
import java.io.*;

public class Chapter1
{
    private static NotFound cnf = new NotFound();
    private static boolean unlocked = false, door = false, fi = false, debug = false, room = true, killed = false;
    private static int grabbed = 0;
    public static void P() throws FileNotFoundException, IOException
    {
        String[] ipcm;
        String ip, chapter, name = "";
        String regex = "(at|with|on|the)";
        try (BufferedReader br = new BufferedReader(new FileReader("save.txt"))) {
            chapter = br.readLine();
        }
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        FileWriter save = new FileWriter("save.txt");
        do {
            System.out.println("\f-- Chapter 1: Reading is Fundamental --"); // change to chapter name
            try {
                Thread.sleep(750);
            }
            catch (Exception e) {}
            // start non-looping intro
            System.out.println("Here is where we start our experiment, Llama. I have " +
                "\nmade you seven rooms fit for llama exploration and " +
                "\n\ntriumph. Do you understand?");
            System.out.print("> ");
            ip = inp.nextLine();
            try {
                Thread.sleep(750);
            }
            catch (Exception e) {}
            switch (ip)
            {
                case "yes":
                System.out.println("Good Llama! Obeying is key to survival!");
                fi = true;
                break;
                case "no":
                System.out.println("Ah, the rebellious teenage llama. Too good for their" +
                    "\nhouse and home. Wants their individualism! Mom" +
                    "\nand dad always keeping you down! Well we won't" +
                    "\nkeep you long."); 
                fi = true;
                break;
                default:
                System.out.println("That's not an answer I like, answer me correctly " +
                    "\nllama, (yes) or (no) answers please.");
                break;
            }
            System.out.println("\nNow as the 44th creature to enter this facility your" +
                "\njob is to get past room 7. Each room has a simple" +
                "\npuzzle to be solved. If you solve the puzzle the next" +
                "\nroom will open. If you fail the puzzle then you will" +
                "\nmost certainly die a terrible death! But that is all" +
                "\nsemantics and nothing to worry about!\n\nIs that clear?");
            do 
            {
                System.out.print("> ");
                ip = inp.nextLine();
                ip = ip.toLowerCase();
                try {
                    Thread.sleep(750);
                }
                catch (Exception e) {}
                switch (ip)
                {
                    case "yes":
                    System.out.println("Fantastic.");
                    fi = true;
                    break;
                    case "no":
                    System.out.println("I know you know what I meant. Stop acting dumb."); 
                    fi = true;
                    break;
                    default:
                    System.out.println("That's not an answer that I like, answer me correctly" +
                        "\nllama, (yes) or (no) answers please.");
                    break;
                }

            } while (!fi);
            System.out.println("\nIf you need (help) at anytime feel free to say so." +
                "\nI'll be looking at you funny behind that" +
                "\nmirrored one-way glass that all test facilities of this" +
                "\nnature have! Feel free to (look around) you! Always" +
                "\n(look) at everything! It will help you last longer than" +
                "\nthe others!");
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
                        System.out.println(cnf);
                    }
                    break;
                    case "eat":
                    if(ipcm.length > 1) 
                    {
                        G(ipcm[1],false,true);
                    } 
                    else
                    {
                        System.out.println("What do you want to eat llama?");
                    }
                    case "go":
                    if (door)
                    {
                        System.out.println("I'll see you in the next room Llama. Tally-ho!");
                        fi = true;
                        room = false;
                    }
                    else
                    {
                        System.out.println("Sorry, I don't know where you are trying to go!");
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
                    case "get":
                    case "grab":
                    case "pickup":
                    if(ipcm.length > 1) 
                    {
                        G(ipcm[1],false,false);
                    } 
                    else
                    {
                        System.out.println("What are you going on about llama? There's nothing to take of that nature around here!");
                    }
                    break;
                    case "drop":
                    G(ipcm[1],true,false);
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
                    save.write("One");
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
        // Chapter1.P();
    }

    // commands
    /* 
     * items:
     * table, not usable, has a cannot grab
     * badkey - 1
     * tastykey - 2 - eatable
     * goodkey - 3
     * lock - 4
     * door - 5
     * note - 6
     * room, not usable, has a cannot grab
     */
    private static String L(String it)
    {
        switch(it)
        {
            case "table":
            return "On my table is a white cloth with three keys... a" +
            "\n(badkey) - a (tastykey) - a (goodkey) - I named those" +
            "\nmyself! Next to ";
            case "badkey":

            case "tastykey":
            case "goodkey":
            case "lock":
            return "This lock looks like it could take a key. Imagine that.";
            case "door":
            return "What a fine door. It has a (lock) on it.";
            case "note":
            return "I'll read you the note llama. You can't read! You can" +
            "\nmash that button board, but a llama reading!" +
            "\nImpossible." +
            "\n\n'The (badkey) is good and the (goodkey) is bad. The" +
            "\n(badkey) can get you through the door. That (tastykey)..." +
            "\nyou can (eat) that. It's made of alfalfa.";
            case "room":
            case "around":
            return "This room is nothing like the room you were just in." +
            "\nThe floors to walls are a blinding white, with" +
            "\nfluorescent lights behind metal grates filling the room" +
            "\nwith an immense amount of illumination. Feel like a" +
            "\ntest subject yet llama?" +
            "\n\nRight here is a (table) I bought from the neighbors" +
            "\nduring a garage sale. Across the room is a similar" +
            "\n(door) to the one you just passed through, this time" +
            "\nwith a (lock).";
            default:
            return "I'm not quite sure what you are looking at.";
        }
    }

    private static void U(String it)
    {
        switch(it)
        {
            case "door":
            if (!door)
            {
                if (unlocked)
                {
                    door = true;
                    System.out.println("You opened the door, and you're off to the next" +
                        "\nroom! Just go through now and you're on your way.");
                }
                else
                {
                    System.out.println("The door won't budge when it's got a (lock) on it.");
                }
            }
            else
            {
                System.out.println("The door is already open!");
            }
            break;
            default:
            System.out.println(cnf);
        }
    }

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
            System.out.println(cnf);
        }
    }

    /*
     * grabbables:
     * -- none --
     * (remember "cannot grab" responses)
     */
    private static void G(String it, boolean drop, boolean eat)
    {
        if (eat)
        {
            switch(grabbed)
            {
                case 0:
                System.out.println("Your mouth is empty, you don't have anything to" +
                "\ndrop!");
                default:
                System.out.println("You can't eat that llama. That's not a llama chew" +
                "\nthing.");
            }
        }
        else if (!drop)
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
            boolean empty = false;
            switch (grabbed)
            {
                case 11:
                itn = "computering";
                break;
                default:
                empty = true;
                break;
            }
            if (!empty) System.out.println("You put back the " + itn + " where you found it.");
            else System.out.println("Your mouth is empty, you don't have anything to" +
            "\ndrop!");
            grabbed = 0;
        }
    }
}
