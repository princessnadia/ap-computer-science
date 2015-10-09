/*
 * Run.java
 * run this to start!
 */

import java.util.*;
import java.io.*;

public class Run
{
    public static String name;
    public static int hp = 100, maxhp = 150, ap = 25, maxap = 40, enc = 150, tlX = 0, tlY = 0, emi = 0;
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        boolean fi = false;
        String[] ipcm;
        String ip, name;
        boolean ipcp = false;
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        System.out.print("Enter character name: ");
        name = inp.next();
        // DEBUG ITEMS:
        try (BufferedReader br = new BufferedReader(new FileReader("save.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] linecm = line.split(",");
                //System.out.println(linecm[1]);
            }
        }
        FileWriter save = new FileWriter("save.txt");
        Data dat = new Data();
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
                    System.out.println(dat.getDesc(ipcm[1]));
                } else {
                    System.out.println("Describe which item?");
                }
                break;
                case "lookup":
                if(ipcm.length > 1) {
                    System.out.println(dat.getDetail(ipcm[1]));
                } else {
                    System.out.println("Look which item up?");
                }
                break;
                case "use":
                if(ipcm.length > 1) 
                {
                    dat.useItem(ipcm[1]);
                } else {
                    System.out.println("Use what item?");
                }
                break;
                case "inv":
                dat.getInv();
                break;
                case "money":
                dat.getMoney();
                break;         
                case "stats":
                System.out.println("Name: " + name + "\nHP: " + hp + "/" + maxhp + "\nAP: " + ap + "/" + maxap + "\nWG: " + dat.getEnc() + "/" + enc);
                break;
                case "quit":
                fi = true;
                save.write("");
                for(int i = 1; i < 515; i++) {
                    int owned, id;
                    if(Data.pownd.get(i) == null) owned = 0;
                    else owned = (int)Data.pownd.get(i);
                    save.append(i + "," + owned + "\n");
                }
                save.append(name + "," + enc + "\n");
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
