public class Items
{
    private int rmX, rmY, itemu;
    private String north, south, east, west;
    public static String[] item = new String[513];
    public Items()
    {
        item[0] = "name$price$description$effect";
    }
    public String getDetail(String it)
    {
        int itemn = 0;
        for (int emi = 0; emi < 513; emi++) {
              if (it.equals(item[emi])) {
                  itemn = emi;
                  break;
                }
            }
        String[] itemt = item[itemn].split("$");
        return itemt[2];
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
