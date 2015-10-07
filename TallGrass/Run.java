/*
 * Run.java
 * run this to start!
 */

import java.util.*;

public class Run
{
    public static int hp = 100, maxhp = 100, ap = 25, maxap = 25, tlX = 0, tlY = 0, emi = 0;
    public static void main(String[] args)
    {
        Items itm = new Items();
        boolean fi = false;
        String[] ipcm;
        String ip;
        boolean ipcp = false;
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        do {
            Encounter mon = new Encounter();
            System.out.print("> ");
            ip = inp.next();
            ip = ip.toLowerCase();
            ipcm = ip.split("\\s+");
            switch(ipcm[0]) {
                case "help":
                System.out.println("Commands are:\ntile\ngo <north, east, west, south>\nuse <item>\ndesc <item>\nlookup <item>\nRemember: the catalogue shows you every item!");
                break;
                case "tile":
                System.out.println("You are standing in (" + tlX + ", " + tlY + ")");
                break;
                case "go":
                if(ipcm.length > 1) {
                    switch (ipcm[1]) {
                        case "north": tlY++; break;
                        case "south": tlY--; break;
                        case "east": tlX++; break;
                        case "west": tlX--; break;
                        default: System.out.println("Go which way? <north, south, east, west>"); break;
                    }
                    mon.tile();
                    System.out.println("You are standing in (" + tlX + ", " + tlY + ")");
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
                /*
                case "rich":
                if(ipcm.length > 1) 
                {
                itm.setMoney(Integer.parseInt(ipcm[1]));
                } else {
                System.out.println("Give yourself how much money?");
                }
                break;
                 */                
                default:
                System.out.println("Command not found!");
                break;

            }

        } while(!fi);
    }
}
