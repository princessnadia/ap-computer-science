import java.util.*;
public class Items
{
    private int tlX, tlY, itemu;
    private String desc;
    public static String[] item = new String[513];
    public static String[] itemd = new String[513];
    public Items()
    {
        Dictionary items = new Hashtable();
        items.put(1,"
    }
    
    public String getItemDesc(String it)
    {
        String itemr = "";
        for (int emi = 0; emi < 255; emi++) {
              if (it.equals(item[emi])) {
                  itemr = itemd[emi];
                  break;
                }
            } 
        return itemr;
    }
    public int getItemId(String it)
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
}
