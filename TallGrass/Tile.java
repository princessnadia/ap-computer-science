import java.util.*;
import java.lang.Math;
public class Tile
{
    private static Scanner inp = new Scanner(System.in); 
    private static Random gen = new Random();
    private static int rng;
    private static boolean cfi = false;
    private static int rni;
    public static Hashtable mnam = new Hashtable(); // monster name
    public static Hashtable mdes = new Hashtable(); // monster description
    public static Hashtable mmhp = new Hashtable(); // monster max hp
    public static Hashtable mmap = new Hashtable(); // monster max ap
    public static Hashtable moff = new Hashtable(); // monster offense
    public static Hashtable mdef = new Hashtable(); // monster defense
    public static Hashtable mdrp = new Hashtable(); // monster drop (item id)
    public Tile()
    {
        Random gen = new Random(Run.tlX + Run.tlY);
        // 0 is an example
        // mnam.put(0,"");  mdes.put(0,"");  mmhp.put(0,0);     mmap.put(0,0);  moff.put(0,0);  mdef.put(0,0);  mdrp.put(0,0);
        mnam.put(1,"Frenzy Boar");              mdes.put(1,"A simple, angry pig.");                                 mmhp.put(1,50);     mmap.put(1,10);     moff.put(1,15);     mdef.put(1,10);  mdrp.put(1,0);
        mnam.put(2,"Frozen Bone");              mdes.put(2,"A skeleton of ice.");                                   mmhp.put(2,70);     mmap.put(2,20);     moff.put(2,30);     mdef.put(2,40);  mdrp.put(2,0);
        mnam.put(3,"Land Anemone");             mdes.put(3,"Don't trust the name, it's a flower.");                 mmhp.put(3,25);     mmap.put(3,25);     moff.put(3,50);     mdef.put(3,25);  mdrp.put(3,0);
        mnam.put(4,"Drunk Ape");                mdes.put(4,"It holds a drink in its hand all the time.");           mmhp.put(4,100);    mmap.put(4,40);     moff.put(4,75);     mdef.put(4,30);  mdrp.put(4,0);
        mnam.put(5,"Nicholas the Renegade");    mdes.put(5,"A deranged Santa who's had a bit too much eggnog.");    mmhp.put(5,250);    mmap.put(5,75);     moff.put(5,90);     mdef.put(5,60);  mdrp.put(5,0);
        mnam.put(6,"The Gleam Eyes");           mdes.put(6,"74th floor boss. Barely beatable.");                    mmhp.put(6,500);    mmap.put(6,150);    moff.put(6,120);    mdef.put(6,150);  mdrp.put(6,0);
        mnam.put(7,"Illfang the Kobold Lord");  mdes.put(7,"1st floor boss. How'd he get out here?");               mmhp.put(7,125);    mmap.put(7,60);     moff.put(7,80);     mdef.put(7,70);  mdrp.put(7,0);
        mnam.put(8,"Ragout Rabbit");            mdes.put(8,"A fast rabbit with VERY delicious meat.");              mmhp.put(8,10);     mmap.put(8,5);      moff.put(8,20);     mdef.put(8,5);  mdrp.put(8,0);
        mnam.put(9,"Oberon");        			mdes.put(9,"The self proclaimed king of the fairies.");             mmhp.put(9,1000);     mmap.put(9,10);      moff.put(9,150);     mdef.put(9,200);  mdrp.put(9,0);
        mnam.put(10,"Minotaur");          		mdes.put(10,"A minotaur, no need to explain.");                     mmhp.put(10,75);     mmap.put(10,15);      moff.put(10,50);     mdef.put(10,100);  mdrp.put(10,0);
    }

    public void tile()
    {
        rng = gen.nextInt(50);
        System.out.println(rng);
        if (rng >= 40) {
            do {
                rni = gen.nextInt(513);
            } while (mnam.get(rni) == null);
            battle(rni);
        }
        if (rng <= 5) {
            do {
                rni = gen.nextInt(1000);
            } while (Data.pname.get(rni) == null);
            Data.pamnt.put(rni,((int)Data.pamnt.get(rni)+1));
            System.out.println("You found a " + Data.pname.get(rni) + "!");
        }
    }

    public void battle(int mid)
    {
        System.out.println("You encounter " + mnam.get(mid) + "!");
        int mchp = (int)mmhp.get(mid);
        int mcap = (int)mmap.get(mid);
        String[] ipcm;
        String ip;
        do {
            System.out.print("- ");
            ip = inp.next();
            ip = ip.toLowerCase();
            ipcm = ip.split("\\s+");
            switch(ipcm[0]) {
                case "help":
                System.out.println("Commands are:\nattack\nuse <item>\nstats\ninspect");
                break;
                case "attack":
					RNG rand = new RNG((int)Data.pamnt.get(9907));
                    mchp -= rand.damage;
                    System.out.println("hurt " + mnam.get(mid) + " by " + rand.damage + " points");
                break;
                case "use":
                if(ipcm.length >= 1) 
                {
                    Data.useItem(ipcm[1]);
                } else {
                    System.out.println("Use what item?");
                }
                break;
                case "stats":
                System.out.println("Name: " + Run.name + 
                    "\nPennies: " + Data.pamnt.get(9901) + 
                    "\nHP: " + Data.pamnt.get(9902) + "/" + Data.pamnt.get(9903) + 
                    "\nAP: " + Data.pamnt.get(9904) + "/" + Data.pamnt.get(9905) + 
                    "\nWeight: " + Data.getEnc() + "/" + Data.pamnt.get(9906) + 
                    "\nCombat against: " + mnam.get(mid));
                break;
                case "inspect":
                System.out.println("Monster name: " + mnam.get(mid) + 
                    "\nDescription: " + mdes.get(mid) + 
                    "\nHP: " + mchp + "/" + mmhp.get(mid) + 
                    "\nAP: " + mcap + "/" + mmap.get(mid) + 
                    "\nOFF/DEF: " + moff.get(mid) + "/" + mdef.get(mid));
                break;
                case "break":
                cfi = true;
                System.out.println("broke from battle");
                break;
                default:
                System.out.println("Command not found!");
                break;
            }
            if(mchp <= 0) {
                cfi = true;
                System.out.println("killed " + mnam.get(mid));
            }
        } while (!cfi);
    }
}
