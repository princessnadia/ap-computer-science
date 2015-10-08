/*
 * Run.java
 * run this to start!
 */

import java.util.*;

public class Run
{
    public static int hp = 100, maxhp = 150, ap = 25, maxap = 40, enc = 150, tlX = 0, tlY = 0, emi = 0;
    public static void main(String[] args)
    {
        Items itm = new Items();
        boolean fi = false;
        String[] ipcm;
        String ip, name;
        boolean ipcp = false;
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        // System.out.print("Enter character name: ");
        // name = inp.next();
        System.out.println("DEBUG: skipping character naming!");
        name = "Marlene";
        do {
            Encounter mon = new Encounter();
            System.out.print("> ");
            ip = inp.next();
            ip = ip.toLowerCase();
            ipcm = ip.split("\\s+");
            switch(ipcm[0]) {
                case "help":
                System.out.println("Commands are:\ntile\ngo <n, e, w, s>\nuse <item>\ndesc <item>\nlookup <item>\nmoney\nstats\nRemember: the catalog shows you every item!");
                break;
                case "tile":
                System.out.println("You are standing in (" + tlX + ", " + tlY + ")");
                break;
                case "go":
                if(ipcm.length > 1) {
                    switch (ipcm[1]) {
                        case "n": tlY++; break;
                        case "s": tlY--; break;
                        case "e": tlX++; break;
                        case "w": tlX--; break;
                        default: System.out.println("Go which way? <north, south, east, west>"); break;
                    }
                    mon.tile();
                    System.out.println("(" + tlX + ", " + tlY + ")");
                } else {
                    System.out.println("Go which way? <north, south, east, west>");
                }
                break;
                case "desc":
                if(ipcm.length > 1) {
                    System.out.println(itm.getDesc(ipcm[1]));
                } else {
                    System.out.println("Describe which item?");
                }
                break;
                case "lookup":
                if(ipcm.length > 1) {
                    System.out.println(itm.getDetail(ipcm[1]));
                } else {
                    System.out.println("Look which item up?");
                }
                break;
                case "use":
                if(ipcm.length > 1) 
                {
                    itm.useItem(ipcm[1]);
                } else {
                    System.out.println("Use what item?");
                }
                break;
                case "inv":
                itm.getInv();
                break;
                case "money":
                itm.useItem("wallet");
                break;         
                case "stats":
                System.out.println("Name: " + name + "\nHP: " + hp + "/" + maxhp + "\nAP: " + ap + "/" + maxap);
                break;
                default:
                System.out.println("Command not found!");
                break;

            }

        } while(!fi);
    }
}
