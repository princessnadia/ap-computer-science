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
        boolean fi = false, ipcp = false, savefi = false, shortcut = true;
        String[] ipcm;
        String ip, saveon = "";
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        Data dat = new Data();
        if (!shortcut) {
            System.out.print("Load save data? (WARNING: Answering no will wipe your save!) (y/n): ");
            saveon = inp.next();
            switch (saveon) {
                case "y": 
                savefi = true;
                try (BufferedReader br = new BufferedReader(new FileReader("save.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] linecm = line.split(",");
                        // System.out.println(linecm[0] + "," + linecm[1]);
                        if (Integer.parseInt(linecm[0]) != 10001) {
                            dat.pamnt.put(Integer.parseInt(linecm[0]),Integer.parseInt(linecm[1]));
                        }
                        else {
                            dat.pamnt.put(Integer.parseInt(linecm[0]),linecm[1]);
                        }
                    }
                }
                if(dat.pamnt.get(522) == null) {
                    System.out.print("Name not found!\nEnter character name: ");
                    name = inp.next();
                }
                else {
                    name = (String)Data.pamnt.get(10001);
                }
                break;
                case "n":
                savefi = true;
                System.out.print("Enter character name: ");
                name = inp.next();
                break;
                default:
                System.out.print("\n(y/n): ");
            } while (!savefi);
            FileWriter save = new FileWriter("save.txt");
        }
        else {
            name = "Marlene";
            System.out.println("skipping load process");
        }
        FileWriter save = new FileWriter("save.txt");
        do {
            ip = "";
            Tile til = new Tile();
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
            ipcm = ip.split("\\s+");
            switch(ipcm[0]) {
                case "help":
                System.out.println("Commands are:\ntile\ngo <n, e, w, s>\nuse <item>\nlookup <item>\ndrop <item>\nmoney\nstats\nctl <category>");
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
                case "equip":
                if(ipcm.length > 1) 
                {
                    dat.equipItem(ipcm[1]);
                } else {
                    System.out.println("Equip what item?");
                }
                break;
                case "inv":
                dat.getInv();
                break;
                case "ctl":
                Data.getCatalog();
                break;
                case "drop":
                
                case "money":
                dat.getMoney();
                break;         
                case "stats":
                System.out.println("Name: " + name + 
                    "\nPennies: " + Data.pamnt.get(9901) + 
                    "\nHP: " + Data.pamnt.get(9902) + "/" + Data.pamnt.get(9903) + 
                    "\nAP: " + Data.pamnt.get(9904) + "/" + Data.pamnt.get(9905) + 
                    "\nWeight: " + dat.getEnc() + "/" + Data.pamnt.get(9906) + 
                    "\nTile: (" + tlX + ", " + tlY + ")");
                break;
                case "battle":
                if(ipcm.length > 1) 
                {
                    til.battle(Integer.parseInt(ipcm[1]));
                } else {
                    System.out.println("start a battle against?");
                }
                break;
                case "quit":
                fi = true;
                save.write("");
                for(int i = 1; i < 10000; i++) {
                    Object owned;
                    if(Data.pamnt.get(i) == null) owned = 0;
                    else owned = Data.pamnt.get(i);
                    // System.out.println(i + "," + owned);
                    save.append(i + "," + (int)owned + "\n");
                }
                save.append(10001 + "," + name + "\n");
                save.close();
                System.out.println("Saved and quit!");
                break;
                case "break":
                fi = true;
                System.out.println("force quit");
                break;
                default:
                System.out.println("Command not found!");
                break;
            }
        } while(!fi);
    }
}
