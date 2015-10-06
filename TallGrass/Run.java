/*
 * Run.java
 * run this to start!
 */

import java.util.*;

public class Run
{
    public static void main(String[] args)
    {
	Items itm = new Items();
	Encounter mon = new Encounter();
        int tlX = 0, tlY=0, emi=0; 
        boolean fi = false;
        String[] ipcm;
        String ip;
        boolean ipcp = false;
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");
         do {

            System.out.print("> ");
            ip = inp.next();
            ipcm = ip.split("\\s+");
            switch(ipcm[0]) {
                case "help":
                System.out.println("commands are:\ngo <north, east, west, south>\nuse <item>\ndesc <item>\n");
                break;
                case "fi":
                fi = true;
                System.out.println("bye");
                break;
                case "go":
                if(ipcm.length > 1) {
                    if (ipcm[1] == "north") tlY++;
                    if (ipcm[1] == "south") tlY--;
                    if (ipcm[1] == "east") tlX++;
                    if (ipcm[1] == "west") tlX--;
		    mon.tile(tlX,tlY);
                } else {
                    System.out.println("go where?");
                }
                break;
                case "desc":
                if(ipcm.length > 1) {
                    System.out.println(itm.getItemDetail(ipcm[1]));
                } else {
		    System.out.println("get description of which item?");
                }
                break;
                case "use":
                if(ipcm.length > 1) 
                {
                    emi = exm.getItemId(ipcm[1]);
                    use.runItem(emi,em,ps);
                } else {
                    System.out.println("use what?");
                }
                break;
                default:
                System.out.println("command not found");
                break;
            }

        } while(!fi);
    }
}
