/*
 * Run.java
 * start the adventure!
 */

import java.util.*;

public class Run
{
    public static int em, ps; // employee id, password
    public static void main(String[] args)
    {
        int tlX = 0, tlY=0, emi=0;    // 
        boolean fi = false;
        String[] ipcm;
        String ip;
        boolean ipcp = false;
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");

        Random gen = new Random();
        em = gen.nextInt(5001);
        ps = gen.nextInt(9999);
        
        do {
            Items items = new Items();
            
            System.out.print("> ");

            ip = inp.next();

            ipcm = ip.split("\\s+");

            switch(ipcm[0]) {
                case "help":
                System.out.println("commands are:\ngo <north, south, east, west>\nuse <item>\ndesc <item>");
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
                } else {
                    System.out.println("go where?");
                }
                break;
                case "desc":
                if(ipcm.length > 1) {
                    fi = false;
                } else {
                    System.out.println("what item?");
                }
                break;
                case "use":
                if(ipcm.length > 1) 
                {
                    emi = exm.getItemId(ipcm[1]);
                    Use use = new Use(rmX,rmY,emi);
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
