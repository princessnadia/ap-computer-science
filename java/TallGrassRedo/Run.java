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
        boolean fi = false, ipcp = false;
        String[] ipcm;
        String ip, saveon = "";
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
        Data dat = new Data();
        System.out.print("Enter character name: ");
        name = inp.next();
        try (BufferedReader br = new BufferedReader(new FileReader("save-" + name.toLowerCase() + ".csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] linecm = line.split(",");
                // System.out.println(linecm[0] + "," + linecm[1]);
                Data.amnt[Integer.parseInt(linecm[0])] = Integer.parseInt(linecm[1]);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Starting new game!");
        }
        FileWriter save = new FileWriter("save-" + name + ".txt");
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
                System.out.println("Commands are:\ntile\ngo <n, e, w, s>\nuse <item>\nlookup <item>\ndrop <item>\nmoney\nstats\nctl <disp/weap/head/body/arms/legs/feet>\nmanual (first time playing?)");
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
                    dat2.useItem(ipcm[1]);
                } else {
                    System.out.println("Use what item?");
                }
                break;
                case "equip":
                if(ipcm.length > 1) 
                {
                    dat2.equipItem(ipcm[1]);
                    RNG rand = new RNG((int)Data1.pamnt.get(9907),(int)Data1.pamnt.get(9908),(int)Data1.pamnt.get(9909),(int)Data1.pamnt.get(9910),(int)Data1.pamnt.get(9911),(int)Data1.pamnt.get(9912));
                    System.out.println("OFF/DEF: " + RNG.getOff() + "/" + RNG.getDef());
                } else {
                    System.out.println("Equip what item?");
                }
                break;
                case "inv":
                dat.getInv();
                break;
                case "ctl":
                if(ipcm.length > 1) 
                {
                    dat2.getCatalog(ipcm[1]);
                } else {
                    System.out.println("Open which catalog? <disp/weap/head/body/arms/legs/feet>");
                }
                break;
                case "drop":
                if(ipcm.length > 1) 
                {
                    dat.dropItem(ipcm[1]);
                } else {
                    System.out.println("Drop what item?");
                }
                break;
                case "money":
                dat.getMoney();
                break;         
                case "stats":
                RNG rand = new RNG((int)Data1.pamnt.get(9907),(int)Data1.pamnt.get(9908),(int)Data1.pamnt.get(9909),(int)Data1.pamnt.get(9910),(int)Data1.pamnt.get(9911),(int)Data1.pamnt.get(9912));
                System.out.println("Name: " + name + 
                    "\nPennies: " + Data1.pamnt.get(9901) + 
                    "\nHP: " + Data1.pamnt.get(9902) + "/" + Data1.pamnt.get(9903) + 
                    "\nAP: " + Data1.pamnt.get(9904) + "/" + Data1.pamnt.get(9905) + 
                    "\nWeight: " + Data1.getEnc() + "/" + Data1.pamnt.get(9906) + 
                    "\nOFF/DEF: " + RNG.getOff() + "/" + RNG.getDef() +
                    "\nlvl: " + RNG.calcLevel() +
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
                    if(Data.amnt[i] == null) owned = 0;
                    else owned = Data.amnt[i];
                    // System.out.println(i + "," + owned);
                    save.append(i + "," + (int)owned + "\n");
                }
                save.append(10001 + "," + name + "\n");
                save.close();
                System.out.println("Saved and quit!");
                break;
                case "manual":
                help.menu();
                break;
                case "dump":
                for(int i = 1; i < 10000; i++) {
                    Object owned;
                    if(Data1.pamnt.get(i) != null) 
                    {
                        owned = Data1.pamnt.get(i);
                        System.out.println(i + "," + owned);
                    }
                }
                break;
                default:
                System.out.println("Command not found!");
                break;
            }
        } while(!fi);
    }
}
