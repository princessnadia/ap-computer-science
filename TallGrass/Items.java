import java.util.*;
public class Items
{
    private static Scanner inp = new Scanner(System.in); 
    public static Hashtable tm1 = new Hashtable(); // item name
    public static Hashtable tm2 = new Hashtable(); // item description
    public static Hashtable tm3 = new Hashtable(); // item price
    public static Hashtable tm4 = new Hashtable(); // item effect description
    public static Hashtable tm5 = new Hashtable(); // amount owned
    public Items()
    {
        tm1.put(1,"catalogue"); tm2.put(1,"It's a simple catalogue. Its title is \"Things in the Tall Grass.\""); tm3.put(1,150); tm4.put(1,"It's readable."); tm5.put(1,1);
        tm1.put(2,"bandage"); tm2.put(2,"A pack of bandages that closes your wounds."); tm3.put(2,100); tm4.put(2,"Restores 100 HP."); tm5.put(2,3);
        tm1.put(3,"energydrink"); tm2.put(3,"It's a small bottle of some drink that gives you pep."); tm3.put(3,250); tm4.put(3,"Restores 100 AP."); tm5.put(3,2);
        tm1.put(4,"dontusethis"); tm2.put(4,"Don't use this. Seriously."); tm3.put(4,30); tm4.put(4,"Yeah, don't use it."); tm5.put(4,0);
        tm1.put(5,"teleporter"); tm2.put(5,"A small crystal that you can easily crush."); tm3.put(5,1000); tm4.put(5,"Teleports you back to (0, 0)."); tm5.put(5,10);
        tm1.put(6,"wallet"); tm2.put(6,"It's just a plain leather wallet."); tm3.put(6,0); tm4.put(6,"Holds the pennies you get from monsters."); tm5.put(6,1);
        tm1.put(514,"money"); tm2.put(514,"THIS SHOULD BE HIDDEN!"); tm3.put(514,1); tm4.put(514,"Shows how rich you are."); tm5.put(514,100);
    }

    public String getDesc(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 513; emi++) {
            if (it.equals(tm1.get(emi))) itemd = emi;
        }
        String itemt = (String) tm2.get(itemd);
        return itemt;
    }

    public String getDetail(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 513; emi++) {
            if (it.equals(tm1.get(emi))) itemd = emi;
        }
        String itemt = "Item name: " + (String) tm1.get(itemd) + "\nItem description: " + (String) tm2.get(itemd) + "\nItem price: " + tm3.get(itemd) + "\nItem effect: " + tm4.get(itemd);
        return itemt;
    }

    public void useItem(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 513; emi++) {
            if (it.equals(tm1.get(emi))) itemd = emi;
        }
        switch (itemd) {
            case 1:
            boolean done = false;
            int idc = 1;
            System.out.print("\fITEM / DESCRIPTION / PRICE / EFFECT\n");
            do {
                if (!tm1.containsKey(idc + 5)) done = true;
                System.out.print("\fITEM / DESCRIPTION / PRICE / EFFECT\n");
                System.out.println((String) tm1.get(idc) + " / " + (String) tm2.get(idc) + " / " + tm3.get(idc) + " / " + tm4.get(idc));
                System.out.println((String) tm1.get(idc + 1) + " / " + (String) tm2.get(idc + 1) + " / " + tm3.get(idc + 1) + " / " + tm4.get(idc + 1));
                System.out.println((String) tm1.get(idc + 2) + " / " + (String) tm2.get(idc + 2) + " / " + tm3.get(idc + 2) + " / " + tm4.get(idc + 2));
                System.out.println((String) tm1.get(idc + 3) + " / " + (String) tm2.get(idc + 3) + " / " + tm3.get(idc + 3) + " / " + tm4.get(idc + 3));
                System.out.println((String) tm1.get(idc + 4) + " / " + (String) tm2.get(idc + 4) + " / " + tm3.get(idc + 4) + " / " + tm4.get(idc + 4));
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
        money = (int)tm5.get(514);
        return money;
    }

    public void setMoney(int offset)
    {
        int money;
        money = (int)tm5.get(514);
        tm5.put(514,money + offset);
    }

    public void getInv()
    {
        boolean done = false;
        System.out.print("\fITEM / DESCRIPTION / VALUE / EFFECT\n");
        for (int emi = 1; emi < 513; emi++) {
            if (tm1.get(emi) != null && (int)tm5.get(emi) != 0) System.out.println((String) tm1.get(emi) + " / " + (String) tm2.get(emi) + " / " + tm3.get(emi) + " / " + tm4.get(emi));
        }
        System.out.println("-- Press Enter/Return to return --");

        
    }
}
