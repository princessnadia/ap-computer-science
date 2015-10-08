import java.util.*;
public class Items
{
    private static Scanner inp = new Scanner(System.in); 
    public static Hashtable iname = new Hashtable(); // item name
    public static Hashtable idesc = new Hashtable(); // item description
    public static Hashtable ivalu = new Hashtable(); // item price
    public static Hashtable iwght = new Hashtable(); // item price
    public static Hashtable ieffc = new Hashtable(); // item effect description
    public static Hashtable iownd = new Hashtable(); // amount owned
    public Items()
    {
        iname.put(1,"catalog"); idesc.put(1,"It's a simple catalog. Its title is \"Things in the Tall Grass.\""); ivalu.put(1,150); iwght.put(1,3); ieffc.put(1,"It's readable."); iownd.put(1,1);
        iname.put(2,"bandage"); idesc.put(2,"A pack of bandages that closes your wounds."); ivalu.put(2,100); iwght.put(2,1); ieffc.put(2,"Restores 100 HP."); iownd.put(2,3);
        iname.put(3,"energydrink"); idesc.put(3,"It's a small bottle of some drink that gives you pep."); ivalu.put(3,250); iwght.put(3,1); ieffc.put(3,"Restores 100 AP."); iownd.put(3,2);
        iname.put(4,"dontusethis"); idesc.put(4,"Don't use this. Seriously."); ivalu.put(4,30); iwght.put(4,10); ieffc.put(4,"Yeah, don't use it."); iownd.put(4,0);
        iname.put(5,"teleporter"); idesc.put(5,"A small crystal that you can easily crush."); ivalu.put(5,1000); iwght.put(5,5); ieffc.put(5,"Teleports you back to (0, 0)."); iownd.put(5,10);
        iname.put(6,"wallet"); idesc.put(6,"It's just a plain leather wallet."); ivalu.put(6,0); iwght.put(6,0); ieffc.put(6,"Holds the pennies you get from monsters."); iownd.put(6,1);
        iname.put(514,"money"); idesc.put(514,"THIS SHOULD BE HIDDEN!"); ivalu.put(514,1); iwght.put(514,0); ieffc.put(514,"STILL HIDDEN!"); iownd.put(514,100);
    }

    public String getDesc(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 513; emi++) {
            if (it.equals(iname.get(emi))) itemd = emi;
        }
        String itemt = (String) idesc.get(itemd);
        return itemt;
    }

    public String getDetail(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 513; emi++) {
            if (it.equals(iname.get(emi))) itemd = emi;
        }
        String itemt = "Item name: " + (String) iname.get(itemd) + "\nItem description: " + (String) idesc.get(itemd) + "\nItem price: " + ivalu.get(itemd) + "\nItem effect: " + ieffc.get(itemd);
        return itemt;
    }

    public void useItem(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 513; emi++) {
            if (it.equals(iname.get(emi))) itemd = emi;
        }
        switch (itemd) {
            case 1:
            boolean done = false;
            int idc = 1;
            System.out.print("\fITEM / DESCRIPTION / PRICE / EFFECT\n");
            do {
                if (!iname.containsKey(idc + 5)) done = true;
                System.out.print("\fITEM / DESCRIPTION / PRICE / EFFECT\n");
                System.out.println((String) iname.get(idc) + " / " + (String) idesc.get(idc) + " / " + ivalu.get(idc) + " / " + ieffc.get(idc));
                System.out.println((String) iname.get(idc + 1) + " / " + (String) idesc.get(idc + 1) + " / " + ivalu.get(idc + 1) + " / " + ieffc.get(idc + 1));
                System.out.println((String) iname.get(idc + 2) + " / " + (String) idesc.get(idc + 2) + " / " + ivalu.get(idc + 2) + " / " + ieffc.get(idc + 2));
                System.out.println((String) iname.get(idc + 3) + " / " + (String) idesc.get(idc + 3) + " / " + ivalu.get(idc + 3) + " / " + ieffc.get(idc + 3));
                System.out.println((String) iname.get(idc + 4) + " / " + (String) idesc.get(idc + 4) + " / " + ivalu.get(idc + 4) + " / " + ieffc.get(idc + 4));
                if(!done) System.out.println("-- Press Enter/Return to scroll --");
                else System.out.println("-- Press Enter/Return to return --");
                inp.nextLine();
                idc++;
            } while (!done);
            System.out.println("\f");
            break;
            case 2:
            if ((Run.hp + 100) > Run.maxhp) Run.hp = Run.maxhp;
            else Run.hp += 100;
            System.out.println("Healed!");
            break;
            case 6:
            System.out.println("You have " + getMoney() + " pennies");
            break;
            default:
            System.out.println("Use what item?");
            break;
        }
    }

    public int getMoney()
    {
        int money;
        money = (int)iownd.get(514);
        return money;
    }

    public void setMoney(int offset)
    {
        int money;
        money = (int)iownd.get(514);
        iownd.put(514,money + offset);
    }

    public void getInv()
    {
        boolean done = false;
        System.out.println("ITEM / DESCRIPTION / VALUE / EFFECT / AMOUNT");
        for (int emi = 1; emi < 513; emi++) {
            if (iname.get(emi) != null && (int)iownd.get(emi) != 0) System.out.println((String) iname.get(emi) + " / " + (String) idesc.get(emi) + " / " + ivalu.get(emi) + " / " + ieffc.get(emi) + " / " + iownd.get(emi));
        }
    }
    
    public int getEnc() {
        int[] itwgt = new int[513];
        for (int emi = 1; emi < 513; emi++) {
            if (iname.get(emi) != null) itwgt[emi] = (int)iwght.get(emi) * (int)iownd.get(emi);
            
        }
        for (int i = 1; emi < 513; emi+= 2) {
            
        }
    }
}
