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
 
      Scanner inp = new Scanner(System.in).useDelimiter("\\r*\\n+");

      Random gen = new Random(0x73a56f);
      em = gen.nextInt(5001);
      ps = gen.nextInt(9999);
      
      System.out.println("You are in a plain room, flooded by light above. There is a DOOR behind you, and a NOTE to your left.");
      
        do {
            System.out.print("> ");

            ip = inp.next();

            ipcm = ip.split("\\s+");
      
            switch(ipcm[0]) {
                case "help":
                    System.out.println("success");
                    break;
                case "fi":
                    fi = true;
                    break;
                case "cplx":
                    if(ipcm.length > 1) {
                        switch(ipcm[1]) {
                            case "usagi":
                                System.out.println("usagi tsukino");
                                break;
                        }
                    } else {
                        System.out.println("kazuto kirigaya");
                    }
                    break;
                default:
                    System.out.println("command not found");
                    break;
            }

        } while(!fi);
    }
}
