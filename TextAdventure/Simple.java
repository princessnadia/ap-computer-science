/*
 * simple.java
 * a simple, one-room text "adventure". excuse the coding
 */

import java.util.*;

public class Simple
{
    public static void main(String[] args)
    {
      int rmX = 0, rmY=0;    // unused
      int em, ps; // employee id, password
      int fa = 0;      // 0 = n, 1 = e, 2 = s, 3 = w, 4 = up, 5 = dn
      boolean fi = false;
      String[] ipcm;
      String ip;
      boolean ipcp = false;
      Rooms rm = new Rooms();
      Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");

      Random gen = new Random(0x73a56f);
      em = gen.nextInt(5001);
      ps = gen.nextInt(9999);
      
      
        do {
            System.out.print("> ");

            ip = inp.next();

            ipcm = ip.split("\\s+");
      
            switch(ipcm[0]) {
                case "help":
                    System.out.println("commands are:\nlook <north, east, south, west, up, down, around>\nuse <item>\nexamine <item>");
                    break;
                case "fi":
                    fi = true;
                    System.out.println("bye");
                    break;
                case "look":
                    if(ipcm.length > 1) {
                        switch(ipcm[1]) {
                            case "north":
                                System.out.println("it's just a brick wall, nothing interesting");
                                break;
                            case "east":
                                System.out.println("a (mirror) hangs on the wall.");
                                break;
                            case "south":
                                System.out.println("");
                                break;
                            case "west":
                                System.out.println("it's just a brick wall, nothing interesting");
                                break;
                            case "up":
                                System.out.println("it's just a brick wall, nothing interesting");
                                break;
                            case "down":
                                System.out.println("it's just a brick wall, nothing interesting");
                                break;
                            case "around":
                                System.out.println(rooms.roomDesc(desc));
                                break;
                        }
                    } else {
                        System.out.println("look where?");
                    }
                    break;
                case "examine":
                    if(ipcm.length > 1) {
                        switch(ipcm[1]) {
                            case "mirror":
                                System.out.println("you see a girl with long, blue hair, and a diamond-like face. you see her smile.");
                                break;
                        }
                    } else {
                        System.out.println("examine what?");
                    }
                    break;
                default:
                    System.out.println("command not found");
                    break;
            }

        } while(!fi);
    }
}
