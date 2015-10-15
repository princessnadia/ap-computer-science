/*
 * Run.java
 * run this to start!
 */

import java.util.*;
import java.io.*;

public class Run
{
    public static String name;
    public static int tlX = 0, tlY = 0, emi = 0;
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        boolean fi = false;
        String[] ipcm;
        String ip;
        boolean ipcp = false;
        String saveon = "";
        boolean savefi = false;
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        Data dat = new Data();
        System.out.print("Load save data? (WARNING: Answering no will wipe your save!) (y/n): ");
        saveon = inp.next();
        do {
            switch (saveon) {
                case "y": 
                savefi = true;
                try (BufferedReader br = new BufferedReader(new FileReader("save.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] linecm = line.split(",");
                        System.out.println(linecm[0] + "," + linecm[1]);
                        dat.pownd.put(Integer.parseInt(linecm[0]),linecm[1]);
                    }
                    if(dat.pownd.get(522) == null) {
                        System.out.print("Name not found!\nEnter character name: ");
                        name = inp.next();
                    }
                }
                name = (String)Data.pownd.get(522);
                break;
                case "n":
                savefi = true;
                System.out.print("Enter character name: ");
                name = inp.next();
                break;
                default:
                System.out.print("\n(y/n): ");
            }
        } while (!savefi);
        FileWriter save = new FileWriter("save.txt");
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
                        case "n": tlX++; break;
                        case "s": tlX--; break;
                        case "e": tlY++; break;
                        case "w": tlY--; break;
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
                System.out.println("Name: " + name + "\nPennies: " + Data.pownd.get(514) + "\nHP: " + Data.pownd.get(517) + "/" + Data.pownd.get(518) + "\nAP: " + Data.pownd.get(519) + "/" + Data.pownd.get(520) + "\nWeight: " + dat.getEnc() + "/" + Data.pownd.get(521));
                break;
                case "quit":
                fi = true;
                save.write("");
                for(int i = 1; i < 515; i++) {
                    Object owned;
                    if(Data.pownd.get(i) == null) owned = "0";
                    else owned = Data.pownd.get(i);
                    System.out.println(i + "," + owned);
                    save.append(i + "," + owned + "\n");
                }
                save.append(522 + "," + name + "\n");
                save.append(517 + "," + Data.pownd.get(517) + "\n");
                save.append(518 + "," + Data.pownd.get(518) + "\n");
                save.append(519 + "," + Data.pownd.get(519) + "\n");
                save.append(520 + "," + Data.pownd.get(520) + "\n");
                save.append(521 + "," + Data.pownd.get(521) + "\n");
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
