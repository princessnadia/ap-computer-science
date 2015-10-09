/*
 * Run.java
 * run this to start!
 */

import java.util.*;
import java.io.*;

public class Run
{
    public static int hp = 100, maxhp = 150, ap = 25, maxap = 40, enc = 150, tlX = 0, tlY = 0, emi = 0;
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        File fle = new File("save.txt");
        FileWriter save = new FileWriter("save.txt");
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
            Tile til = new Tile();
            System.out.print("> ");
            ip = inp.next();
            ip = ip.toLowerCase();
            ipcm = ip.split("\\s+");
            switch(ipcm[0]) {
                case "help":
                System.out.println("Commands are:\ntile\ngo <n, e, w, s>\nuse <item>\ndesc <item>\nlookup <item>\nmoney\nstats\nIf it's your first time, use the catalog!");
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
                    til.tile();
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
                itm.getMoney();
                break;         
                case "stats":
                System.out.println("Name: " + name + "\nHP: " + hp + "/" + maxhp + "\nAP: " + ap + "/" + maxap + "\nWG: " + itm.getEnc() + "/" + enc);
                break;
                case "quit":
                fi = true;
                save.write("");
                for(int i = 1; i < 515; i++) {
                    int owned, id;
                    if(Items.iownd.get(i) == null) owned = 0;
                    else owned = (int)Items.iownd.get(i);
                    save.append(i + "," + owned + "\n");
                }
                save.append(name + "\n");
                save.close();
                System.out.println("Saved and quit!");
                break;
                default:
                System.out.println("Command not found!");
                break;
            }
        } while(!fi);
    }
}
