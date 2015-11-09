import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.Math;
public class RNG 
{
    private static int poff;
    private static int pdef;
    private static int[] lvlq = new int[7];
    public RNG(int weap,int head,int body,int arms,int legs,int feet)
    {
        pdef = 0;
        poff = 0;
        switch (weap) {
            case 0:
            poff = 3;
            break;
            case 1: 
            poff = 5;
            break;
            case 2: 
            poff = 10;
            break;
            case 3: 
            poff = 50;
            break;
            default:
            poff = 3;
            break;
        }
        switch (head) {
            case 0:
            pdef += 1;
            break;
            case 1: 
            pdef += 3;
            break;
            case 2: 
            pdef += 5;
            break;
            case 3: 
            pdef += 50;
            break;
            default:
            pdef += 1;
            break;
        }
        switch (body) {
            case 0:
            pdef += 1;
            break;
            case 1: 
            pdef += 6;
            break;
            case 2: 
            pdef += 12;
            break;
            case 3: 
            pdef += 50;
            break;
            default:
            pdef += 1;
            break;
        }
        switch (arms) {
            case 0:
            pdef += 1;
            break;
            case 1: 
            pdef += 2;
            break;
            default:
            pdef += 1;
            break;
        }
        switch (legs) {
            case 0:
            pdef += 1;
            break;
            case 1: 
            pdef += 2;
            break;
            default:
            pdef += 1;
            break;
        }
        switch (feet) {
            case 0:
            pdef += 1;
            break;
            case 1: 
            pdef += 5;
            break;
            default:
            pdef += 1;
            break;
        }
        lvlq[1] = 3 * weap;
        lvlq[2] = 2 * head;
        lvlq[3] = 3 * body;
        lvlq[4] = 1 * arms;
        lvlq[5] = 1 * legs;
        lvlq[6] = 2 * feet;
    }

    public static int calcLevel()
    {
        int lvl = 0;
        int lvls = lvlq[1] + lvlq[2] + lvlq[3] + lvlq[4] + lvlq[5] + lvlq[6];
        lvl = lvls / 6;
        return lvl;
    }

    public static int getOff()
    {
        return poff;
    }

    public static int getDef()
    {
        return pdef;
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
        damage = ((gen.nextInt(off) + 1) / (gen2.nextInt(pdef) + (pdef)));
        return damage;
    }
}