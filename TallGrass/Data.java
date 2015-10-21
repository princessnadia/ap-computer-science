import java.util.*;
public class Data
{
    private static Scanner inp = new Scanner(System.in); 
    public static Hashtable pname = new Hashtable(); // item name
    public static Hashtable pvalu = new Hashtable(); // item price
    public static Hashtable pwght = new Hashtable(); // item weight
    public static Hashtable peffc = new Hashtable(); // item effect description
    public static Hashtable pamnt = new Hashtable(); // amount owned
    public static int twght;
    public Data()
    {
        // 0xx = single-use items
        pname.put(1,"catalog"); pvalu.put(1,150); pwght.put(1,3); peffc.put(1,"Readable"); pamnt.put(1,1);
        pname.put(2,"bandage"); pvalu.put(2,100); pwght.put(2,1); peffc.put(2,"HP +100"); pamnt.put(2,3);
        pname.put(3,"energy_drink"); pvalu.put(3,250); pwght.put(3,1); peffc.put(3,"AP +10"); pamnt.put(3,2);
        pname.put(4,"dontusethis"); pvalu.put(4,30); pwght.put(4,10); peffc.put(4,"Testing item"); pamnt.put(4,0);
        pname.put(5,"teleporter"); pvalu.put(5,1000); pwght.put(5,5); peffc.put(5,"Return to (0, 0)"); pamnt.put(5,10);
        // 1xx = weapons
        pname.put(101,"wood_sword"); pvalu.put(101,50); pwght.put(101,3); peffc.put(101,"OFF +5"); pamnt.put(101,1);
        // 2xx = head
        pname.put(201,"hide_cowl"); pvalu.put(101,20); pwght.put(201,2); peffc.put(201,"DEF +3"); pamnt.put(201,1);
        // 3xx = body
        pname.put(301,"hide_shirt"); pvalu.put(101,20); pwght.put(301,2); peffc.put(301,"DEF +3"); pamnt.put(301,1);
        // 4xx = arms
        pname.put(401,"hide_sleeves"); pvalu.put(101,20); pwght.put(401,2); peffc.put(401,"DEF +3"); pamnt.put(401,1);
        // 5xx = legs
        pname.put(501,"hide_pants"); pvalu.put(101,20); pwght.put(501,2); peffc.put(501,"DEF +3"); pamnt.put(501,1);
        // 6xx = feet
        pname.put(601,"hide_shoes"); pvalu.put(101,20); pwght.put(601,2); peffc.put(601,"DEF +3"); pamnt.put(601,1);
        // 10xx = other data
        pname.put(1001,"money"); pamnt.put(1001,100);
        pname.put(1002,"hp"); pamnt.put(1002,100);
        pname.put(1003,"maxhp"); pamnt.put(1003,150);
        pname.put(1004,"ap"); pamnt.put(1004,25);
        pname.put(1005,"maxap"); pamnt.put(1005,40);
        pname.put(1006,"enc"); pamnt.put(1006,150);
        pname.put(1007,"weap_equip"); pamnt.put(1007,0);
        pname.put(1008,"head_equip"); pamnt.put(1008,0);
        pname.put(1009,"body_equip"); pamnt.put(1009,0);
        pname.put(1010,"arms_equip"); pamnt.put(1010,0);
        pname.put(1011,"legs_equip"); pamnt.put(1011,0);
        pname.put(1012,"feet_equip"); pamnt.put(1012,0);
    }

    public String getDetail(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 513; emi++) {
            if (it.equals(pname.get(emi))) itemd = emi;
        }
        String itemt = "Item name: " + (String) pname.get(itemd) + "\nItem price: " + pvalu.get(itemd) + "\nItem effect: " + peffc.get(itemd);
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
            boolean done = false, catfi =  false;
            int idc = 1;
            do {
                if (!pname.containsKey(idc + 5)) done = true;
                System.out.print("\fITEM / VAL / WGT / EFF\n");
                for(int i = 0; i < 5; i++) {
                    System.out.println((String) pname.get(idc + i) + " / " + pvalu.get(idc + i) + " / " + pwght.get(idc + i) + " / " + peffc.get(idc + i));
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
            case 4:
            // empty space
            break;
            case 5:
            Run.tlX = 0;
            Run.tlY = 0;
            System.out.println("Teleported!");
            break;
            case 6:
            pamnt.put(1007,6);
            break;
            default:
            System.out.println("Use what item?");
            break;
        }
        pamnt.put(itemd,(int)pamnt.get(itemd) - 1);
    }

    public void setHp(int offset, boolean verbose)
    {
        if (((int)pamnt.get(517) + offset) > (int)pamnt.get(518)) pamnt.put(517,(int)pamnt.get(518));
        else pamnt.put(517, (int)pamnt.get(517) + offset);
        if (verbose) {
            if (offset >= 0) System.out.print("Healed " + offset + " HP -- " + (int)pamnt.get(517) + "/" + (int)pamnt.get(518) + "");
            else System.out.print("Hurt " + offset + " HP -- " + (int)pamnt.get(517) + "/" + (int)pamnt.get(518) + "");
        }
        System.out.println("");
    }

    public void setAp(int offset, boolean verbose)
    {
        if (((int)pamnt.get(519) + offset) > (int)pamnt.get(520)) pamnt.put(519,(int)pamnt.get(520));
        else pamnt.put(519, (int)pamnt.get(519) + offset);
        if (verbose) {
            if (offset >= 0) System.out.print("Got " + offset + " AP -- " + (int)pamnt.get(519) + "/" + (int)pamnt.get(520) + "");
            else System.out.print("Lost " + offset + " AP -- " + (int)pamnt.get(519) + "/" + (int)pamnt.get(520) + "");
        }
        System.out.println("");
    }

    public void getMoney()
    {
        int money;
        money = (int)pamnt.get(514);
        System.out.println("You have " + money + " pennies!");
    }

    public void setMoney(int offset)
    {
        int money;
        money = (int)pamnt.get(514);
        pamnt.put(514,money + offset);
    }

    public void getInv()
    {
        boolean done = false;
        System.out.println("ITEM / VAL  / WGT / EFF / AMT");
        for (int emi = 1; emi < 513; emi++) {
            if (pname.get(emi) != null && (int)pamnt.get(emi) != 0) System.out.println((String) pname.get(emi) + " / " + pvalu.get(emi) + " / " + pwght.get(emi) + " / " + peffc.get(emi) + " / " + pamnt.get(emi));
        }
    }

    public static int getEnc() {
        twght = 0;
        int[] itwgt = new int[513];
        for (int emi = 1; emi < 513; emi++) {
            if (pname.get(emi) != null) itwgt[emi] = (int)pwght.get(emi) * (int)pamnt.get(emi);

        }
        for (int i = 1; i < 513; i++) {
            if (pname.get(i) != null) twght += itwgt[i];
        }
        return twght;
    }
}
