import java.util.*;
public class Items
{
    private static Scanner inp = new Scanner(System.in); 
    private static int rni;
    private static Random gen = new Random();
    public static Hashtable iname = new Hashtable(); // item name
    public static Hashtable idesc = new Hashtable(); // item description
    // constructor declares all items
    public Items()
    {
        iname.put(1,"test");
    }

    public void getDetail(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 513; emi++)
        {
            if (it.equals(iname.get(emi))) itemd = emi;
        }
        switch (itemd)
        {
            default:
            System.out.println("test");
            break;
        }
    }
}
