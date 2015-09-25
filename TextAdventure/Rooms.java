public class Rooms
{
    private String desc, nord, sud, est, ouest, up, dn;
    public Rooms(int rmX, int rmY)
    {
        if (rmX == 0 && rmY == 0) {
            desc = "you are in a plain room, flooded by light from a bulb. there is a (door) behind you, and a (note) to your left.";
            nord = "a wall here. boring.";
            est = "a (mirror) hangs on the wall.";
            sud = "now that is a big door. the (keypad) installer must've been compensating for something.";
            ouest = "the (note) is stuck to the wall with adhesive.";
            up = "yup, they still use incandescents. blame the republicans.";
            dn = "your shadow hangs below you, for obvious reasons.";
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

    public String getDesc()
    {
        return desc;
    }
}
