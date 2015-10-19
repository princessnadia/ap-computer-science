import java.util.*;
public class Data
{
    private static Scanner inp = new Scanner(System.in); 
    public static Hashtable pname = new Hashtable(); // item name
    public static Hashtable pdesc = new Hashtable(); // item description
    public static Hashtable pvalu = new Hashtable(); // item price
    public static Hashtable pwght = new Hashtable(); // item price
    public static Hashtable peffc = new Hashtable(); // item effect description
    public static Hashtable pownd = new Hashtable(); // amount owned
    public static int twght;
    public Data()
    {
        pname.put(1,"catalog"); pdesc.put(1,"It's a simple catalog. Its title is \"Things in the Tall Grass.\""); pvalu.put(1,150); pwght.put(1,3); peffc.put(1,"Readable"); pownd.put(1,1);
        pname.put(2,"bandage"); pdesc.put(2,"A pack of bandages that closes your wounds."); pvalu.put(2,100); pwght.put(2,1); peffc.put(2,"HP +100"); pownd.put(2,3);
        pname.put(3,"energydrink"); pdesc.put(3,"It's a small bottle of some drink that gives you pep."); pvalu.put(3,250); pwght.put(3,1); peffc.put(3,"AP +10"); pownd.put(3,2);
        pname.put(4,"dontusethis"); pdesc.put(4,"Don't use this. Seriously."); pvalu.put(4,30); pwght.put(4,10); peffc.put(4,"Testing item"); pownd.put(4,0);
        pname.put(5,"teleporter"); pdesc.put(5,"A small crystal that you can easily crush."); pvalu.put(5,1000); pwght.put(5,5); peffc.put(5,"Return to (0, 0)"); pownd.put(5,10);
        pname.put(514,"money"); pownd.put(514,100);
        pname.put(517,"hp"); pownd.put(517,100);
        pname.put(518,"maxhp"); pownd.put(518,150);
        pname.put(519,"ap"); pownd.put(519,25);
        pname.put(520,"maxap"); pownd.put(520,40);
        pname.put(521,"enc"); pownd.put(521,150);
    }

    public String getDesc(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 513; emi++) {
            if (it.equals(pname.get(emi))) itemd = emi;
        }
        String itemt = (String) pdesc.get(itemd);
        return itemt;
    }

    public String getDetail(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 513; emi++) {
            if (it.equals(pname.get(emi))) itemd = emi;
        }
        String itemt = "Item name: " + (String) pname.get(itemd) + "\nItem description: " + (String) pdesc.get(itemd) + "\nItem price: " + pvalu.get(itemd) + "\nItem effect: " + peffc.get(itemd);
        return itemt;
    }

    public void useItem(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 513; emi++) {
            if (it.equals(pname.get(emi))) itemd = emi;
        }
        switch (itemd) {
            case 1:
            boolean done = false;
            int idc = 1;
            System.out.print("\fITEM / DESC / VAL / WGT / EFF\n");
            do {
                if (!pname.containsKey(idc + 5)) done = true;
                System.out.print("\fITEM / DESC / VAL / WGT / EFF\n");
                for(int i = 0; i < 5; i++) {
                    System.out.println((String) pname.get(idc + i) + " / " + (String) pdesc.get(idc + i) + " / " + pvalu.get(idc + i) + " / " + pwght.get(idc + i) + " / " + peffc.get(idc + i));
                }
                if(!done) System.out.println("-- Press Enter/Return to scroll --");
                else System.out.println("-- Press Enter/Return to return --");
                inp.nextLine();
                idc++;
            } while (!done);
            System.out.println("\f");
            break;
            case 2:
            setHp(100,true);
            break;
            case 3:
            setAp(10,true);
            break;
            default:
            System.out.println("Use what item?");
            break;
        }
        pownd.put(itemd,(int)pownd.get(itemd) - 1);
    }

    public void setHp(int offset, boolean verbose)
    {
        if (((int)pownd.get(517) + offset) > (int)pownd.get(518)) pownd.put(517,(int)pownd.get(518));
        else pownd.put(517, (int)pownd.get(517) + offset);
        if (verbose) {
            if (offset >= 0) System.out.print("Healed " + offset + " HP -- " + (int)pownd.get(517) + "/" + (int)pownd.get(518) + "");
            else System.out.print("Hurt " + offset + " HP -- " + (int)pownd.get(517) + "/" + (int)pownd.get(518) + "");
        }
        System.out.println("");
    }
    
    public void setAp(int offset, boolean verbose)
    {
        if (((int)pownd.get(519) + offset) > (int)pownd.get(520)) pownd.put(519,(int)pownd.get(520));
        else pownd.put(519, (int)pownd.get(519) + offset);
        if (verbose) {
            if (offset >= 0) System.out.print("Got " + offset + " AP -- " + (int)pownd.get(519) + "/" + (int)pownd.get(520) + "");
            else System.out.print("Lost " + offset + " AP -- " + (int)pownd.get(519) + "/" + (int)pownd.get(520) + "");
        }
        System.out.println("");
    }
    
    public void getMoney()
    {
        int money;
        money = (int)pownd.get(514);
        System.out.println("You have " + money + " pennies!");
    }

    public void setMoney(int offset)
    {
        int money;
        money = (int)pownd.get(514);
        pownd.put(514,money + offset);
    }

    public void getInv()
    {
        boolean done = false;
        System.out.println("ITEM / VAL / EFF / AMT");
        for (int emi = 1; emi < 513; emi++) {
            if (pname.get(emi) != null && (int)pownd.get(emi) != 0) System.out.println((String) pname.get(emi) + " / " + pvalu.get(emi) + " / " + peffc.get(emi) + " / " + pownd.get(emi));
        }
    }

    public static int getEnc() {
        twght = 0;
        int[] itwgt = new int[513];
        for (int emi = 1; emi < 513; emi++) {
            if (pname.get(emi) != null) itwgt[emi] = (int)pwght.get(emi) * (int)pownd.get(emi);

        }
        for (int i = 1; i < 513; i++) {
            if (pname.get(i) != null) twght += itwgt[i];
        }
        return twght;
    }
}
