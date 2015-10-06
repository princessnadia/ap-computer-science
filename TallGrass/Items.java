import java.util.*;
public class Items
{
    private int rmX, rmY, itemu;
    private String north, south, east, west;
    public static Hashtable tm1 = new Hashtable(); // item name
    public static Hashtable tm2 = new Hashtable(); // item description
    public static Hashtable tm3 = new Hashtable(); // item price
    public static Hashtable tm4 = new Hashtable(); // item effect
    public Items()
    {
        tm1.put(0,"manual"); tm2.put(0,"It's a simple manual. Its title is \"Tall Grass and You.\""); tm3.put(0,150); tm4.put(0,"Readable.");
        tm1.put(1,"potion"); tm2.put(1,"A simple healing potion."); tm3.put(1,1000); tm4.put(1,"Restores 100 HP.");
        tm1.put(2,"eggs"); tm2.put(2,"boiled eggs"); tm3.put(2,250); tm4.put(2,"Restores 100 HP.");
        tm1.put(3,"bacon"); tm2.put(3,"mmmmmmm"); tm3.put(3,300); tm4.put(3,"Restores 100 HP.");
        tm1.put(4,"spam"); tm2.put(4,"vikings"); tm3.put(4,10); tm4.put(4,"Restores 100 HP.");
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
        String itemt = "item name:" + (String) tm1.get(itemd) + "\nitem description: " + (String) tm2.get(itemd) + "\nitem price: " + tm3.get(itemd);
        return itemt;
    }

    /*public int getItemId(String it)
    {
    String itemr = "";
    for (int emi = 0; emi < 255; emi++) {
    if (it.equals(item[emi])) {
    itemu = emi;
    break;
    }
    } 
    return itemu;
    }
     */
}
