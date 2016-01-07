/*
 * Run.java
 * @author marlene yuuki
 * @version d71.01.07
 */

import java.util.*;
import java.io.*;

public class Run
{
    public static String name;
    public static void main(String[] args) throws ToBeImplementedException, FileNotFoundException, IOException
    {
        boolean fi = false, ipcp = false;
        String[] ips;
        String ip, saveon = "";
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        Data dat = new Data();
        System.out.print("Enter character name: ");
        {
            name = inp.nextLine();
            try (BufferedReader br = new BufferedReader(new FileReader("save-" + name.toLowerCase() + ".csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] lines = line.split(",");
                    // System.out.println(linecm[0] + "," + linecm[1]);
                    Data.amnt[Integer.parseInt(lines[0])] = Integer.parseInt(lines[1]);
                }
            }
            catch (FileNotFoundException e)
            {
                // nothing
            }
        }
        ip = "";
        FileWriter save = new FileWriter("save-" + name.toLowerCase() + ".csv");
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
            ips = ip.split("\\s+");
            switch(ips[0]) {
                case "help":
                System.out.println("Commands are:\ntile\ngo <n, e, w, s>\nuse <item>\nlookup <item>\ndrop <item>\nmoney\nstats\nctl <disp/weap/head/body/arms/legs/feet>\nmanual (first time playing?)");
                break;
                case "tile":
                System.out.println("You are standing in (" + Data.amnt[1992] + ", " + Data.amnt[1993] + ")");
                break;
                case "go":
                if(ips.length > 1) {
                    switch (ips[1]) {
                        case "n": Data.amnt[1993]++; break;
                        case "s": Data.amnt[1993]--; break;
                        case "e": Data.amnt[1992]++; break;
                        case "w": Data.amnt[1992]--; break;
                        default: System.out.println("Go which way? <north, south, east, west>"); break;
                    }
                    System.out.println("(" + Data.amnt[1992] + ", " + Data.amnt[1993] + ")");
                } else {
                    System.out.println("Go which way? <north, south, east, west>");
                }
                break;
                case "lookup":
                if(ips.length > 1) {
                    System.out.println(Data.searchItem(ips[1]));
                } else {
                    System.out.println("Look which item up?");
                }
                break;
                case "use":
                if(ips.length > 1) 
                {
                    Data.useItem(ips[1],false);
                } else {
                    System.out.println("Use what item?");
                }
                break;
                case "equip":
                if(ips.length > 1) 
                {
                    Data.useItem(ips[1],true);
                } else {
                    System.out.println("Equip what item?");
                }
                //break;
                case "inv":
                throw new ToBeImplementedException("I AM INCOMPLETE");
                //break;
                case "ctl":
                if(ips.length > 1) 
                {
                    throw new ToBeImplementedException("I AM INCOMPLETE");
                } else {
                    System.out.println("Open which catalog? <disp/weap/head/body/arms/legs/feet>");
                    throw new ToBeImplementedException("I AM INCOMPLETE");
                }
                //break;
                case "drop":
                if(ips.length > 1) 
                {
                    throw new ToBeImplementedException("I AM INCOMPLETE");
                } else {
                    System.out.println("Drop what item?");
                    throw new ToBeImplementedException("I AM INCOMPLETE");
                }
                //break;
                case "money":
                System.out.println("You have " + Data.amnt[1994] + " valis!");
                break;
                case "stats":
                System.out.println("Name: " + name + 
                    "\nValis: " + Data.amnt[1994] + 
                    "\nHP: " + Data.amnt[1995] + "/" + Data.amnt[1996] + 
                    "\nAP: " + Data.amnt[1997] + "/" + Data.amnt[1998] + 
                    "\nWeight: " + "TBR" + "/" + Data.amnt[1999] + 
                        // "\nOFF/DEF: " + RNG.getOff() + "/" + RNG.getDef() +
                        // "\nlvl: " + RNG.calcLevel() +
                    "\nTile: (" + Data.amnt[1992] + ", " + Data.amnt[1993] + ")");
                break;
                case "battle":
                if(ips.length > 1) 
                {
                    throw new ToBeImplementedException("I AM INCOMPLETE");
                } else {
                    System.out.println("start a battle against?");
                    throw new ToBeImplementedException("I AM INCOMPLETE");
                }
                //break;
                case "quit":
                fi = true;
                save.write("");
                for(int i = 1; i < Data.name.length; i++) {
                    Object owned;
                    if(Data.amnt[i] == 0) owned = 0;
                    else owned = Data.amnt[i];
                    // System.out.println(i + "," + owned);
                    save.append(i + "," + (int)owned + "\n");
                }
                save.close();
                System.out.println("Saved and quit!");
                break;
                case "manual":
                throw new ToBeImplementedException("I AM INCOMPLETE");
                //break;
                case "dump":
                for(int i = 1; i < 2000; i++) {
                    Object owned;
                    owned = Data.amnt[i];
                    System.out.println(i + "," + owned);
                }
                break;
                default:
                System.out.println("Command not found!");
                break;
            }
        } while(!fi);
    }
}
