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
        pname.put(1,"bandage"); pvalu.put(1,100); pwght.put(1,1); peffc.put(1,"HP +100"); pamnt.put(1,3);
        pname.put(2,"energy_drink"); pvalu.put(2,250); pwght.put(2,1); peffc.put(2,"AP +10"); pamnt.put(2,2);
        pname.put(3,"dontusethis"); pvalu.put(3,30); pwght.put(3,5); peffc.put(3,"Testing item"); pamnt.put(3,0);
        pname.put(4,"teleporter"); pvalu.put(4,1000); pwght.put(4,5); peffc.put(4,"Return to (0, 0)"); pamnt.put(4,10);
        // 1xx = weapons
        pname.put(101,"wood_sword"); pvalu.put(101,50); pwght.put(101,3); peffc.put(101,"OFF +5"); pamnt.put(101,1);
        // 2xx = head
        pname.put(201,"hide_cowl"); pvalu.put(201,20); pwght.put(201,2); peffc.put(201,"DEF +3"); pamnt.put(201,1);
        // 3xx = body
        pname.put(301,"hide_shirt"); pvalu.put(301,20); pwght.put(301,2); peffc.put(301,"DEF +6"); pamnt.put(301,1);
        // 4xx = arms
        pname.put(401,"hide_sleeves"); pvalu.put(401,20); pwght.put(401,2); peffc.put(401,"DEF +2"); pamnt.put(401,1);
        // 5xx = legs
        pname.put(501,"hide_pants"); pvalu.put(501,20); pwght.put(501,2); peffc.put(501,"DEF +2"); pamnt.put(501,1);
        // 6xx = feet
        pname.put(601,"hide_shoes"); pvalu.put(601,20); pwght.put(601,2); peffc.put(601,"DEF +5"); pamnt.put(601,1);
        // 99xx = other data
        pname.put(9901,"money"); pamnt.put(9901,100);
        pname.put(9902,"hp"); pamnt.put(9902,100);
        pname.put(9903,"maxhp"); pamnt.put(9903,150);
        pname.put(9904,"ap"); pamnt.put(9904,25);
        pname.put(9905,"maxap"); pamnt.put(9905,40);
        pname.put(9906,"enc"); pamnt.put(9906,150);
        pname.put(9907,"weap_equip"); pamnt.put(9907,0);
        pname.put(9908,"head_equip"); pamnt.put(9908,0);
        pname.put(9909,"body_equip"); pamnt.put(9909,0);
        pname.put(9910,"arms_equip"); pamnt.put(9910,0);
        pname.put(9911,"legs_equip"); pamnt.put(9911,0);
        pname.put(9912,"feet_equip"); pamnt.put(9912,0);
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
            setHp(100,true);
			pamnt.put(1,(int)pamnt.get(1)-1);
            break;
            case 2:
            setAp(10,true);
			pamnt.put(2,(int)pamnt.get(2)-1);
            break;
            case 3:
            // empty space
            break;
            case 4:
            Run.tlX = 0;
            Run.tlY = 0;
            System.out.println("Teleported!");
			pamnt.put(4,(int)pamnt.get(4)-1);
            break;
            case 101:
            pamnt.put(9907,1);
			System.out.println("Equipped!");
            break;
			case 201:
			pamnt.put(9908,1);
			System.out.println("Equipped!");
			break;
			case 301:
			pamnt.put(9909,1);
			System.out.println("Equipped!");
			break;
			case 401:
			pamnt.put(9910,1);
			System.out.println("Equipped!");
			break;
			case 501:
			pamnt.put(9911,1);
			System.out.println("Equipped!");
			break;
			case 601:
			pamnt.put(9912,1);
			System.out.println("Equipped!");
			break;
            default:
            System.out.println("Use what item?");
            break;
        }
    }

    public void setHp(int offset, boolean verbose)
    {
        if (((int)pamnt.get(9902) + offset) > (int)pamnt.get(9903)) pamnt.put(9902,(int)pamnt.get(9903));
        else pamnt.put(9902, (int)pamnt.get(9902) + offset);
        if (verbose) {
            if (offset >= 0) System.out.print("Healed " + offset + " HP -- " + (int)pamnt.get(9902) + "/" + (int)pamnt.get(9903) + "");
            else System.out.print("Hurt " + offset + " HP -- " + (int)pamnt.get(9902) + "/" + (int)pamnt.get(9903) + "");
        }
        System.out.println("");
    }

    public void setAp(int offset, boolean verbose)
    {
        if (((int)pamnt.get(9904) + offset) > (int)pamnt.get(9905)) pamnt.put(9904,(int)pamnt.get(9905));
        else pamnt.put(9904, (int)pamnt.get(9904) + offset);
        if (verbose) {
            if (offset >= 0) System.out.print("Got " + offset + " AP -- " + (int)pamnt.get(9904) + "/" + (int)pamnt.get(9905) + "");
            else System.out.print("Lost " + offset + " AP -- " + (int)pamnt.get(9904) + "/" + (int)pamnt.get(9905) + "");
        }
        System.out.println("");
    }

    public void getMoney() {
        System.out.println("You have " + pamnt.get(9901) + " pennies!");
    }

    public void setMoney(int offset)
    {
        int money;
        money = (int)pamnt.get(9901);
        pamnt.put(9901,money + offset);
    }

    public void getInv()
    {
        boolean done = false;
        System.out.println("ITEM / VAL  / WGT / EFF / AMT");
        for (int emi = 1; emi <= 9900; emi++) {
            if (pname.get(emi) != null && (int)pamnt.get(emi) != 0) System.out.println((String) pname.get(emi) + " / " + pvalu.get(emi) + " / " + pwght.get(emi) + " / " + peffc.get(emi) + " / " + pamnt.get(emi));
        }
    }

    public static int getEnc() {
        twght = 0;
        int[] itwgt = new int[9900];
        for (int emi = 1; emi <= 9900; emi++) {
            if (pname.get(emi) != null) itwgt[emi] = (int)pwght.get(emi) * (int)pamnt.get(emi);

        }
        for (int i = 1; i <= 9900; i++) {
            if (pname.get(i) != null) twght += itwgt[i];
        }
        return twght;
    }

    public static void getCatalog() {
        boolean done = false, catfi =  false;
        int idc = 1;
        do {
            if (!Data.pname.containsKey(idc + 5)) done = true;
            System.out.print("\fITEM / VAL / WGT / EFF\n");
            for(int i = 0; i < 5; i++) {
                System.out.println((String) Data.pname.get(idc + i) + " / " + Data.pvalu.get(idc + i) + " / " + Data.pwght.get(idc + i) + " / " + Data.peffc.get(idc + i));
            }
            if(!done) System.out.println("-- Press Enter/Return to scroll --");
            else System.out.println("-- Press Enter/Return to return --");
            inp.nextLine();
            idc++;
        } while (!done);
        System.out.println("\f");
    }
}
