public class Look
{
    private int rmX, rmY, itemu;
    private String desc, mae, ato, hidari, migi, ue, sita;
    private String[] item = new String[255];
    private String[] itemd = new String[255];
    public Look(int rmX, int rmY, int em, int ps)
    {
        if (rmX == 0 && rmY == 0) {
            desc = "you are in a plain room, flooded by light from a bulb. there is a (door) behind you, and a (note) to your left.\nyou are facing north.";
            mae = "a wall here. boring.";
            migi = "a (mirror) hangs on the wall.";
            ato = "a huge (door) with a (keypad) next to it.";
            hidari = "the (note) is stuck to the wall with adhesive.";
            ue = "yup, they still use incandescents. blame the republicans.";
            sita = "your shadow hangs below you, for obvious reasons.";
            item[0] = "keypad"; itemd[0] = "it's a plain keypad, with a screen saying \"Enter employee ID and password.\"";
            item[1] = "door"; itemd[1] = "it's locked on the side of the (keypad). probably need to do something with the keypad.";
            item[2] = "mirror"; itemd[2] = "you see a girl with long, blue hair and a ravishing face.";
            item[3] = "note"; itemd[3] = "a post-it. it says: \n--Your employee ID is: " + em + "--\n--Your password is: " + ps + "--";
        }
    }

    public String getDetail(String look)
    {
        String detail;
        switch(look) {
            case "ahead": detail = mae; break;
            case "right": detail = migi; break;
            case "back": detail = ato; break;
            case "left": detail = hidari; break;
            case "up": detail = ue; break;
            case "down": detail = sita; break;
            case "around": detail = desc; break;
            default: detail = "look where?"; break;
        }
        return detail;
    }
    
    public String getItemDetail(String it)
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
