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
		switch (head) {
            case 0:
            pdef = 1;
            break;
            case 1: 
            pdef = 3;
            break;
            default:
            pdef = 1;
            break;
        }
		switch (body) {
            case 0:
            pdef = 1;
            break;
            case 1: 
            pdef = 6;
            break;
            default:
            pdef = 1;
            break;
        }
		switch (arms) {
            case 0:
            pdef = 1;
            break;
            case 1: 
            pdef = 2;
            break;
            default:
            pdef = 1;
            break;
        }
		switch (legs) {
            case 0:
            pdef = 1;
            break;
            case 1: 
            pdef = 2;
            break;
            default:
            pdef = 1;
            break;
        }
		switch (feet) {
            case 0:
            pdef = 1;
            break;
            case 1: 
            pdef = 5;
            break;
            default:
            pdef = 1;
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
        damage = (gen.nextInt(poff) + 1) + (gen2.nextInt(poff) + 1) + poff;
		if (damage < poff) damage = poff;
        return damage;
    }

    public int attackPlayer(int off)
    {
        SimpleDateFormat df = new SimpleDateFormat("sS");
        Date date = new Date();
        Random gen = new Random(Integer.parseInt(df.format(date)));
        Random gen2 = new Random(Integer.parseInt(df.format(date)) + 1);
        Random gen3 = new Random(Integer.parseInt(df.format(date)) + 2);
        int damage = 0;
        damage = ((gen.nextInt(off) + 1) + (gen2.nextInt(off) + 1)) / (gen3.nextInt(pdef) + 1);
        return damage;
    }
}