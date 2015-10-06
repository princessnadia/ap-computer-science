import java.util.*;
public class Items
{
    private int rmX, rmY, itemu;
    private String north, south, east, west;
    public static String[] item = new String[513];
    public Items()
    {
        item[0] = "eggs$100$boiled eggs$10 HP";
        item[1] = "name$price$description$effect";
    }
    public String getDetail(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 513; emi++) {
                String itemn = item[emi];
                String[] itemncm = itemn.split("$");
            }
        String[] itemt = item[itemd].split("$");
        return itemt[1];
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
