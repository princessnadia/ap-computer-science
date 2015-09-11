import java.util.*;
import java.text.NumberFormat;

public class ChargeAccount
{
   public static void main (String[] args)
   {
       Scanner inp = new Scanner(System.in);
       NumberFormat dol = NumberFormat.getCurrencyInstance();
       double bal, add, ntr, nwb = 0.0, min = 0.0;
       // last time
       System.out.print("Previous balance: ");
       bal = inp.nextDouble();
       System.out.print("Additional charges: ");
       add = inp.nextDouble();
       if (bal > 0.0) ntr = (bal + add) * 0.02;
       else ntr = 0.0;
       nwb = bal + add + ntr;
       if (nwb < 50.0) min = nwb;
       else if (nwb <= 300.0 || nwb >= 50.0) min = 50.0;
       // statement
       System.out.print("\f");
       System.out.println("CS CARD International Statement\n===============================\n\n");
       System.out.println("Previous balance:\t" + dol.format(bal));
       System.out.println("Additional charges:\t" + dol.format(add));
       System.out.println("Interest:\t" + dol.format(ntr) + "\n");
       System.out.println("New balance:\t" + dol.format(nwb) + "\n");
       System.out.println("Minimum payment:\t" + dol.format(min));
    }
}
