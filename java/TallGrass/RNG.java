import java.util.*;
import java.text.SimpleDateFormat;
public class RNG 
{
    private int poff;
    private int pdef;
    public RNG(int weap,int head,int body,int arms,int legs,int feet)
    {
        switch (weap) {
            case 0:
            poff = 3;
            break;
            case 1: 
            poff = 5;
            break;
            default:
            poff = 3;
            break;
        }
    }

    public int attackMonster()
    {
        SimpleDateFormat df = new SimpleDateFormat("sS");
        Date date = new Date();
        Random gen = new Random(Integer.parseInt(df.format(date)));
        Random gen2 = new Random(Integer.parseInt(df.format(date)) + 1);
        int damage;
        damage = (gen.nextInt(poff) + 1) * (gen2.nextInt(poff) + 1) + poff;
		if (damage < poff) damage = poff;
        return damage;
    }

    public int attackPlayer(int off)
    {
        SimpleDateFormat df = new SimpleDateFormat("sS");
        Date date = new Date();
        Random gen = new Random(Integer.parseInt(df.format(date)));
        Random gen2 = new Random(Integer.parseInt(df.format(date)) + 1);
        int damage = 0;
        damage = (gen.nextInt(off) + 1) * (gen2.nextInt(off) + 1);
        return damage;
    }
}