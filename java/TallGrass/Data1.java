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
        pname.put(1,"teleporter"); pvalu.put(1,1000); pwght.put(1,5); peffc.put(1,"Return to (0, 0)"); pamnt.put(1,10);
        pname.put(2,"tonic"); pvalu.put(2,500); pwght.put(2,1); peffc.put(2,"Max HP +50"); pamnt.put(2,2);
        pname.put(3,"ether"); pvalu.put(3,750); pwght.put(3,1); peffc.put(3,"Max AP +10"); pamnt.put(3,2);
		pname.put(4,"pain_medicine"); pvalu.put(4,100); pwght.put(4,1); peffc.put(4,"HP +100"); pamnt.put(4,3);
        pname.put(5,"granola_bar"); pvalu.put(5,200); pwght.put(5,1); peffc.put(5,"AP +10"); pamnt.put(5,2);
		pname.put(6,"bandage"); pvalu.put(6,250); pwght.put(6,1); peffc.put(4,"HP +250"); pamnt.put(6,0);
        pname.put(7,"water_bottle"); pvalu.put(7,500); pwght.put(7,1); peffc.put(5,"AP +25"); pamnt.put(7,0);
		pname.put(8,"wrap"); pvalu.put(8,500); pwght.put(8,1); peffc.put(4,"HP +500"); pamnt.put(8,0);
        pname.put(9,"energy_drink"); pvalu.put(9,1000); pwght.put(9,1); peffc.put(5,"AP +50"); pamnt.put(9,0);
		pname.put(10,"heal_flower"); pvalu.put(10,1000); pwght.put(10,1); peffc.put(4,"HP +1000"); pamnt.put(10,0);
        pname.put(11,"coffee_jelly"); pvalu.put(11,2000); pwght.put(11,1); peffc.put(5,"AP +100"); pamnt.put(11,0);
        // 10xx = weapons
        pname.put(1000,"fists"); pvalu.put(100,0); pwght.put(100,0); peffc.put(100,"OFF +3"); pamnt.put(100,1);
        pname.put(1001,"wood_sword"); pvalu.put(101,50); pwght.put(101,3); peffc.put(101,"OFF +5"); pamnt.put(101,1);
        pname.put(1002,"iron_sword"); pvalu.put(102,100); pwght.put(102,3); peffc.put(102,"OFF +10"); pamnt.put(102,0);
        pname.put(1003,"lambent_light"); pvalu.put(103,1000); pwght.put(103,0); peffc.put(103,"(DBG) OFF +50"); pamnt.put(103,1);
        // 2xx = head
        pname.put(200,"bonnet"); pvalu.put(200,0); pwght.put(200,0); peffc.put(200,"DEF +1"); pamnt.put(200,1);
        pname.put(201,"hide_cowl"); pvalu.put(201,20); pwght.put(201,1); peffc.put(201,"DEF +3"); pamnt.put(201,1);
        pname.put(202,"iron_helmet"); pvalu.put(202,40); pwght.put(202,2); peffc.put(202,"DEF +5"); pamnt.put(202,0);
        pname.put(203,"pikachu_ears"); pvalu.put(203,20); pwght.put(203,0); peffc.put(203,"(DBG) DEF +50"); pamnt.put(203,1);
        // 5xx = body
        pname.put(300,"shirt"); pvalu.put(300,0); pwght.put(300,0); peffc.put(300,"DEF +1"); pamnt.put(300,1);
        pname.put(301,"hide_tunic"); pvalu.put(301,20); pwght.put(301,2); peffc.put(301,"DEF +6"); pamnt.put(301,1);
        pname.put(302,"iron_plate"); pvalu.put(302,50); pwght.put(302,4); peffc.put(302,"DEF +12"); pamnt.put(302,0);
        pname.put(303,"kob_clan_dress"); pvalu.put(303,20); pwght.put(303,0); peffc.put(303,"(DBG) DEF +50"); pamnt.put(303,1);
        // 9xx = hands
        pname.put(400,"hands"); pvalu.put(400,0); pwght.put(400,0); peffc.put(400,"DEF +1"); pamnt.put(400,1);
        pname.put(401,"hide_gloves"); pvalu.put(401,20); pwght.put(401,2); peffc.put(401,"DEF +2"); pamnt.put(401,1);
        // 7xx = legs (waist)
        pname.put(500,"shorts"); pvalu.put(500,0); pwght.put(500,0); peffc.put(500,"DEF +1"); pamnt.put(500,1);
        pname.put(501,"hide_pants"); pvalu.put(501,20); pwght.put(501,2); peffc.put(501,"DEF +2"); pamnt.put(501,1);
        // 8xx = feet
        pname.put(600,"shoes"); pvalu.put(600,0); pwght.put(600,0); peffc.put(600,"DEF +1"); pamnt.put(600,1);
        pname.put(601,"hide_boots"); pvalu.put(601,20); pwght.put(601,2); peffc.put(601,"DEF +5"); pamnt.put(601,1);
        // 7xx = arms
        // 8xx =
        // 9xx = 
        // 99xx = other data
        pname.put(9901,"money"); pamnt.put(9901,100);
        pname.put(9902,"hp"); pamnt.put(9902,100);
        pname.put(9903,"maxhp"); pamnt.put(9903,150);
        pname.put(9904,"ap"); pamnt.put(9904,25);
        pname.put(9905,"maxap"); pamnt.put(9905,40);
        pname.put(9906,"enc"); pamnt.put(9906,150);
        pname.put(9951,"neck_equip"); pamnt.put(9951,0);
        pname.put(9952,"head_equip"); pamnt.put(9952,0);
        pname.put(9953,"ring_equip"); pamnt.put(9953,0);
        pname.put(9954,"back_equip"); pamnt.put(9954,0);
        pname.put(9955,"body_equip"); pamnt.put(9955,0);
        pname.put(9956,"arms_equip"); pamnt.put(9956,0);
        pname.put(9957,"weap_equip"); pamnt.put(9957,0);
        pname.put(9958,"head_equip"); pamnt.put(9958,0);
        pname.put(9959,"body_equip"); pamnt.put(9959,0);
        pname.put(9960,"arms_equip"); pamnt.put(9960,0);
        pname.put(9961,"legs_equip"); pamnt.put(9961,0);
        pname.put(9962,"feet_equip"); pamnt.put(9962,0);
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

    public static void findItem(boolean verbose)
    {
        do {
            rni = gen.nextInt(100);
        } while (pname.get(rni) == null && rni % 100 != 0);
        pamnt.put(rni,((int)pamnt.get(rni)+1));
        if (verbose) System.out.println("You found a " + pname.get(rni) + "!");
    }
}
