import java.util.*;
import java.text.SimpleDateFormat;
public class RNG 
{
    public static int damage;
    public RNG(int equip)
    {
        int off;
        SimpleDateFormat df = new SimpleDateFormat("sS");
        Date date = new Date();
        Random gen = new Random(Integer.parseInt(df.format(date)));
        Random gen2 = new Random(Integer.parseInt(df.format(date)) + 1);
        switch (equip) {
            case 1: 
            off = 5;
            break;
            default:
            off = 3;
            break;
        }
        damage = (gen.nextInt(off) + 1) * (gen2.nextInt(off) + 1) + off;
    }
}