public class Rooms
{
    private String desc, nord, sud, est, ouest, up, dn;
    private String[] item = new String[255];
    private String[] itemd = new String[255];
    public Rooms(int rmX, int rmY, int em, int ps)
    {
        if (rmX == 0 && rmY == 0) {
            desc = "you are in a plain room, flooded by light from a bulb. there is a (door) behind you, and a (note) to your left.";
            nord = "a wall here. boring.";
            est = "a (mirror) hangs on the wall.";
            sud = "the (door) is huge. the (keypad) installer must've been compensating for something.";
            ouest = "the (note) is stuck to the wall with adhesive.";
            up = "yup, they still use incandescents. blame the republicans.";
            dn = "your shadow hangs below you, for obvious reasons.";
            item[0] = "keypad"; itemd[0] = "it's a plain keypad, with a screen saying \"Enter employee ID and password.\"";
            item[1] = "door"; itemd[1] = "it's locked on the side of the (keypad). probably need to do something with the keypad.";
            item[2] = "mirror"; itemd[2] = "you see a girl with long, blue hair, and a diamond-like face. you see her smile.";
            item[3] = "note"; itemd[3] = "a post-it. it says: \n--Your employee ID is: " + em + "--\n--Your password is: " + ps + "--";
        }
    }

    public String getDetail(String look)
    {
        String detail;
        switch(look) {
            case "ahead": detail = nord; break;
            case "right": detail = est; break;
            case "back": detail = sud; break;
            case "left": detail = ouest; break;
            case "up": detail = up; break;
            case "down": detail = dn; break;
            case "around": detail = desc; break;
            default: detail = "look where?"; break;
        }
        return detail;
    }
    
    public String getItemDetail(String it)
    {
        String itemr = "";
        for (int em = 0; em < 255; em++) {
              if (it.equals(item[em])) {
                  itemr = itemd[em];
                  break;
                }
            } 
        return itemr;
    }
    
    public String getDesc()
    {
        return desc;
    }
}
