import java.util.*;
public class Data1
{
    private static Scanner inp = new Scanner(System.in); 
    private static int rni;
    private static Random gen = new Random();
    public static Hashtable pname = new Hashtable(); // item name
    public static Hashtable pvalu = new Hashtable(); // item price
    public static Hashtable pwght = new Hashtable(); // item weight
    public static Hashtable peffc = new Hashtable(); // item effect description
    public static Hashtable pamnt = new Hashtable(); // amount owned
    public static int twght;
    // constructor declares all items
    public Data1()
    {
        // 0xx = single-use items
        pname.put(1,"bandage"); pvalu.put(1,100); pwght.put(1,1); peffc.put(1,"HP +100"); pamnt.put(1,3);
        pname.put(2,"energy_drink"); pvalu.put(2,250); pwght.put(2,1); peffc.put(2,"AP +10"); pamnt.put(2,2);
        pname.put(3,"teleporter"); pvalu.put(3,1000); pwght.put(3,5); peffc.put(3,"Return to (0, 0)"); pamnt.put(3,10);
        pname.put(4,"tonic"); pvalu.put(4,500); pwght.put(4,1); peffc.put(4,"Max HP +50"); pamnt.put(4,2);
        pname.put(5,"ether"); pvalu.put(5,750); pwght.put(5,1); peffc.put(5,"Max AP +10"); pamnt.put(5,2);
        // 1xx = weapons
        pname.put(100,"fists"); pvalu.put(100,0); pwght.put(100,0); peffc.put(100,"OFF +3"); pamnt.put(100,1);
        pname.put(101,"wood_sword"); pvalu.put(101,50); pwght.put(101,3); peffc.put(101,"OFF +5"); pamnt.put(101,1);
        pname.put(102,"iron_sword"); pvalu.put(102,100); pwght.put(102,3); peffc.put(102,"OFF +10"); pamnt.put(102,0);
        pname.put(103,"lambent_light"); pvalu.put(103,1000); pwght.put(103,0); peffc.put(103,"(DBG) OFF +50"); pamnt.put(103,1);
        // 2xx = head
        pname.put(200,"bonnet"); pvalu.put(200,0); pwght.put(200,0); peffc.put(200,"DEF +1"); pamnt.put(200,1);
        pname.put(201,"hide_cowl"); pvalu.put(201,20); pwght.put(201,1); peffc.put(201,"DEF +3"); pamnt.put(201,1);
        pname.put(202,"iron_helmet"); pvalu.put(202,40); pwght.put(202,2); peffc.put(202,"DEF +5"); pamnt.put(202,0);
        pname.put(203,"pikachu_ears"); pvalu.put(203,20); pwght.put(203,0); peffc.put(203,"(DBG) DEF +50"); pamnt.put(203,1);
        // 3xx = body
        pname.put(300,"shirt"); pvalu.put(300,0); pwght.put(300,0); peffc.put(300,"DEF +1"); pamnt.put(300,1);
        pname.put(301,"hide_tunic"); pvalu.put(301,20); pwght.put(301,2); peffc.put(301,"DEF +6"); pamnt.put(301,1);
        pname.put(302,"iron_plate"); pvalu.put(302,50); pwght.put(302,4); peffc.put(302,"DEF +12"); pamnt.put(302,0);
        pname.put(303,"kob_clan_dress"); pvalu.put(303,20); pwght.put(303,0); peffc.put(303,"(DBG) DEF +50"); pamnt.put(303,1);
        // 4xx = arms
        pname.put(400,"hands"); pvalu.put(400,0); pwght.put(400,0); peffc.put(400,"DEF +1"); pamnt.put(400,1);
        pname.put(401,"hide_gloves"); pvalu.put(401,20); pwght.put(401,2); peffc.put(401,"DEF +2"); pamnt.put(401,1);
        // 5xx = legs
        pname.put(500,"shorts"); pvalu.put(500,0); pwght.put(500,0); peffc.put(500,"DEF +1"); pamnt.put(500,1);
        pname.put(501,"hide_pants"); pvalu.put(501,20); pwght.put(501,2); peffc.put(501,"DEF +2"); pamnt.put(501,1);
        // 6xx = feet
        pname.put(600,"shoes"); pvalu.put(600,0); pwght.put(600,0); peffc.put(600,"DEF +1"); pamnt.put(600,1);
        pname.put(601,"hide_boots"); pvalu.put(601,20); pwght.put(601,2); peffc.put(601,"DEF +5"); pamnt.put(601,1);
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
        for (int emi = 0; emi < 513; emi++)
        {
            if (it.equals(pname.get(emi))) itemd = emi;
        }
        String itemt = "Item name: " + (String) pname.get(itemd) + "\nItem price: " + pvalu.get(itemd) + "\nItem effect: " + peffc.get(itemd);
        return itemt;
    }

    public static void dropItem(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 9900; emi++) 
        {
            if (it.equals(pname.get(emi))) itemd = emi;
        }
        pamnt.put(itemd,(int)pamnt.get(itemd)-1);
        System.out.println("Dropped " + it);
    }

    public static void setHp(int offset, boolean verbose)
    {
        if (((int)pamnt.get(9902) + offset) > (int)pamnt.get(9903)) pamnt.put(9902,(int)pamnt.get(9903));
        else pamnt.put(9902, (int)pamnt.get(9902) + offset);
        if (verbose) {
            if (offset >= 0) System.out.print("Healed " + offset + " HP -- " + (int)pamnt.get(9902) + "/" + (int)pamnt.get(9903) + "");
            else System.out.print("Hurt " + offset + " HP -- " + (int)pamnt.get(9902) + "/" + (int)pamnt.get(9903) + "");
        }
        System.out.println("");
    }

    public static void setAp(int offset, boolean verbose)
    {
        if (((int)pamnt.get(9904) + offset) > (int)pamnt.get(9905)) pamnt.put(9904,(int)pamnt.get(9905));
        else pamnt.put(9904, (int)pamnt.get(9904) + offset);
        if (verbose) {
            if (offset >= 0) System.out.print("Got " + offset + " AP -- " + (int)pamnt.get(9904) + "/" + (int)pamnt.get(9905) + "");
            else System.out.print("Lost " + offset + " AP -- " + (int)pamnt.get(9904) + "/" + (int)pamnt.get(9905) + "");
        }
        System.out.println("");
    }

    public static void getMoney() {
        System.out.println("You have " + pamnt.get(9901) + " pennies!");
    }

    public static void setMoney(int offset)
    {
        int money;
        money = (int)pamnt.get(9901);
        pamnt.put(9901,money + offset);
    }

    public static void getInv()
    {
        boolean done = false;
        System.out.println("ITEM / VAL  / WGT / EFF / AMT");
        for (int emi = 1; emi <= 9900; emi++) {
            if (pname.get(emi) != null && (int)pamnt.get(emi) != 0 && emi % 100 != 0) System.out.println((String) pname.get(emi) + " / " + pvalu.get(emi) + " / " + pwght.get(emi) + " / " + peffc.get(emi) + " / " + pamnt.get(emi));
        }
    }

    public static int getEnc() 
    {
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

    public static void getCatalog(String catg) 
    {
        int idc;
        boolean done = false, catfi =  false;
        switch (catg)
        {
            case "disp":
            idc = 1;
            break;
            case "weap":
            idc = 101;
            break;
            case "head":
            idc = 201;
            break;
            case "body":
            idc = 301;
            break;
            case "arms":
            idc = 401;
            break;
            case "legs":
            idc = 501;
            break;
            case "feet":
            idc = 601;
            break;
            default:
            idc = 0;
            done = true;
            break;
        }
        if (done) System.out.println("Open which catalog? <disp/weap/head/body/arms/legs/feet>");
        while (!done) {
            if (!pname.containsKey(idc + 5)) done = true;
            System.out.print("\fITEM / VAL / WGT / EFF\n");
            for(int i = 0; i < 5; i++) {
                System.out.println((String) pname.get(idc + i) + " / " + pvalu.get(idc + i) + " / " + pwght.get(idc + i) + " / " + peffc.get(idc + i));
            }
            if(!done) System.out.println("-- Press Enter/Return to scroll --");
            else System.out.println("-- Press Enter/Return to return --");
            inp.nextLine();
            idc++;
        }
    }

    public static void findItem(boolean verbose)
    {
        do {
            rni = gen.nextInt(100);
        } while (pname.get(rni) == null && rni % 100 != 0);
        pamnt.put(rni,((int)pamnt.get(rni)+1));
        if (verbose) System.out.println("You found a " + pname.get(rni) + "!");
    }
}
