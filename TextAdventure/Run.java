/*
 * Run.java
 * start the adventure!
 */

import java.util.*;

public class Run
{
    public static void main(String[] args)
    {
        int rmX = 0, rmY=0, emi=0;    // 
        int em, ps; // employee id, password
        boolean fi = false;
        String[] ipcm;
        String ip;
        boolean ipcp = false;
        Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");

        Random gen = new Random();
        em = gen.nextInt(5001);
        ps = gen.nextInt(9999);

        do {
            Look exm = new Look(rmX,rmY,em,ps);
            System.out.print("> ");

            ip = inp.next();

            ipcm = ip.split("\\s+");

            switch(ipcm[0]) {
                case "help":
                System.out.println("commands are:\nlook <ahead, right, back, left, up, down, around>\nuse <item>\nexamine <item>\nanything enclosed in (parentheses) is an item");
                break;
                case "fi":
                fi = true;
                System.out.println("bye");
                break;
                case "look":
                if(ipcm.length > 1) {
                        System.out.println(exm.getDetail(ipcm[1]));
                } else {
                    System.out.println("look where?");
                }
                break;
                case "examine":
                if(ipcm.length > 1) {
                        System.out.println(exm.getItemDetail(ipcm[1]));
                } else {
                    System.out.println("examine what?");
                }
                break;
                case "use":
                if(ipcm.length > 1) 
                {
                    emi = exm.getItemId(ipcm[1]);
                    System.out.println(emi);
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
