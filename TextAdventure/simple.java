/*
 * simple.java
 * a simple, one-room text "adventure". excuse the coding
 */

import java.util.*;

public class simple

{

    public static void main(String[] args)
    {
      int rmX = 0;    // unused
      
      int rmY = 0;  // unused
      
      int em, ps; // employee id, password
      
      int fa = 0;      // 0 = n, 1 = e, 2 = s, 3 = w, 4 = up, 5 = dn
      
      boolean fi = false;
      
      String[] ipcm;
      
      String ip;
      
      boolean ipcp = false;
      
      Scanner inp = new Scanner(System.in);
      
      Random gen = new Random();
      
      em = gen.nextInt(5001);
      
      ps = gen.nextInt(9999);
      
      System.out.println("You are in a plain room, flooded by light above. There is a DOOR behind you, and a NOTE to your left.");
      
      while(!fi) {
      
      System.out.print("> ");
      
      ip = inp.next();
      
      ipcm = ip.split(" ");
      
            switch(ipcm[0]) {
                case "help": System.out.println("success"); break;
                case "fi": fi = true; break;
                case "cplx": switch(ipcm[0]) { 
                                case "usagi": System.out.println("usagi tsukino"); break;
                                default: System.out.println("kazuto kirigaya"); break;
                            }; 
                            break;
                default: System.out.println("command not found"); break;
            }
     }
      
}
}