import java.util.*;
import java.lang.Math;
public class Tile
{
    private static Scanner inp = new Scanner(System.in); 
    private static Random gen = new Random();
    private static int rng;
    private static int rni;
    private static boolean cfi = false;
    public static Hashtable mnam = new Hashtable(); // monster name
    public static Hashtable mdes = new Hashtable(); // monster description
    public static Hashtable mmhp = new Hashtable(); // monster max hp
    public static Hashtable mmap = new Hashtable(); // monster max ap
    public static Hashtable moff = new Hashtable(); // monster offense
    public static Hashtable mdef = new Hashtable(); // monster defense
    public static Hashtable mmny = new Hashtable(); // monster drop (money)
    public Tile()
    {
        Random gen = new Random(Run.tlX + Run.tlY);
        // * is an example
        // mnam.put(*,"");  mdes.put(*,"");  mmhp.put(*,0);     mmap.put(*,0);  moff.put(*,0);  mdef.put(*,0);  mmny.put(*,0);
        mnam.put(1,"Frenzy Boar");              mdes.put(1,"A simple, angry pig.");                                 mmhp.put(1,50);     mmap.put(1,10);     moff.put(1,15);     mdef.put(1,10);     mmny.put(1,15);
        mnam.put(2,"Frozen Bone");              mdes.put(2,"A skeleton of ice.");                                   mmhp.put(2,70);     mmap.put(2,20);     moff.put(2,30);     mdef.put(2,40);     mmny.put(2,30);
        mnam.put(3,"Land Anemone");             mdes.put(3,"Don't trust the name, it's a flower.");                 mmhp.put(3,25);     mmap.put(3,25);     moff.put(3,50);     mdef.put(3,25);     mmny.put(3,35);
        mnam.put(4,"Drunk Ape");                mdes.put(4,"It holds a drink in its hand all the time.");           mmhp.put(4,100);    mmap.put(4,40);     moff.put(4,75);     mdef.put(4,30);     mmny.put(4,50);
        mnam.put(5,"Nicholas the Renegade");    mdes.put(5,"A deranged Santa who's had a bit too much eggnog.");    mmhp.put(5,250);    mmap.put(5,75);     moff.put(5,90);     mdef.put(5,60);     mmny.put(5,100);
        mnam.put(6,"The Gleam Eyes");           mdes.put(6,"74th floor boss. Barely beatable.");                    mmhp.put(6,500);    mmap.put(6,150);    moff.put(6,120);    mdef.put(6,150);    mmny.put(6,1000);
        mnam.put(7,"Illfang the Kobold Lord");  mdes.put(7,"1st floor boss. How'd he get out here?");               mmhp.put(7,125);    mmap.put(7,60);     moff.put(7,80);     mdef.put(7,70);     mmny.put(7,500);
        mnam.put(8,"Ragout Rabbit");            mdes.put(8,"A fast rabbit with VERY delicious meat.");              mmhp.put(8,10);     mmap.put(8,5);      moff.put(8,20);     mdef.put(8,5);      mmny.put(8,25);
        mnam.put(9,"Oberon");                   mdes.put(9,"The self proclaimed king of the fairies.");             mmhp.put(9,1000);   mmap.put(9,10);     moff.put(9,150);    mdef.put(9,200);    mmny.put(9,10000);
        mnam.put(10,"Minotaur");                mdes.put(10,"A minotaur, no need to explain.");                     mmhp.put(10,75);    mmap.put(10,15);    moff.put(10,50);    mdef.put(10,100);   mmny.put(10,7500);
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
            Data1.findItem(true);
        }
    }

    public static void battle(int mid)
    {
        System.out.println("You encounter " + mnam.get(mid) + "!");
        int mchp = (int)mmhp.get(mid);
        int mcap = (int)mmap.get(mid);
        int att;
        boolean enemy = false;
        String[] ipcm;
        String ip;
        do {
            ip = "";
            RNG rand = new RNG((int)Data1.pamnt.get(9907),(int)Data1.pamnt.get(9908),(int)Data1.pamnt.get(9909),(int)Data1.pamnt.get(9910),(int)Data1.pamnt.get(9911),(int)Data1.pamnt.get(9912));
            System.out.print("- ");
            try {
                ip = inp.nextLine();
            }
            catch (NoSuchElementException n)
            {
                System.out.println("--break from battle--");
                cfi = true;
            }
            ip = ip.toLowerCase();
            ipcm = ip.split("\\s+");
            switch(ipcm[0]) {
                case "help":
                System.out.println("Commands are:\nattack\nuse <item>\nstats\ninspect");
                break;
                case "attack":
                att = rand.attackMonster();
                mchp -= att;
                if (mchp > 0) System.out.println("You hit " + mnam.get(mid) + " for " + att + " HP!\n"
                        + mnam.get(mid) + " " + mchp + "/" + mmhp.get(mid));
                else System.out.println("You hit " + mnam.get(mid) + " for " + att + " HP!\n");
                enemy = true;
                break;
                case "use":
                if(ipcm.length >= 1) 
                {
                    Data2.useItem(ipcm[1]);
                } else {
                    System.out.println("Use what item?");
                }
                enemy = true;
                break;
                case "equip":
                if(ipcm.length > 1) 
                {
                    Data2.equipItem(ipcm[1]);
                } else {
                    System.out.println("Equip what item?");
                }
                break;
                case "stats":
                System.out.println("Name: " + Run.name + 
                    "\nPennies: " + Data1.pamnt.get(9901) + 
                    "\nHP: " + Data1.pamnt.get(9902) + "/" + Data1.pamnt.get(9903) + 
                    "\nAP: " + Data1.pamnt.get(9904) + "/" + Data1.pamnt.get(9905) + 
                    "\nWeight: " + Data1.getEnc() + "/" + Data1.pamnt.get(9906) +
                    "\nOFF/DEF: " + RNG.getOff() + "/" + RNG.getDef() +
                    "\nCombat against: " + mnam.get(mid));
                break;
                case "inspect":
                System.out.println("Monster name: " + mnam.get(mid) + 
                    "\nDescription: " + mdes.get(mid) + 
                    "\nHP: " + mchp + "/" + mmhp.get(mid) + 
                    "\nAP: " + mcap + "/" + mmap.get(mid) + 
                    "\nOFF/DEF: " + moff.get(mid) + "/" + mdef.get(mid));
                break;
                case "inv":
                Data1.getInv();
                break;
                case "dump":
                for(int i = 1; i < 10000; i++) {
                    Object owned;
                    if(Data1.pamnt.get(i) != null) 
                    {
                        owned = Data1.pamnt.get(i);
                        System.out.println(i + "," + owned);
                    }
                }
                break;
                default:
                System.out.println("Command not found!");
                break;
            }
            if(enemy) {
                /*  try {
                 *    Thread.sleep(1500);
                 *  }
                 *  catch (Exception e) {}
                 */
                att = rand.attackPlayer((int)moff.get(mid));
                Data1.pamnt.put(9902, ((int)Data1.pamnt.get(9902) - att));
                System.out.println(Run.name + " " + Data1.pamnt.get(9902) + "/" + Data1.pamnt.get(9903) + "\n" + att);
                enemy = false;
            }
            if(mchp <= 0) {
                cfi = true;
                System.out.println("You successfully killed " + mnam.get(mid) + ", which drops " + mmny.get(mid) + " pennies!");
                Data1.pamnt.put(9901,(int)Data1.pamnt.get(9901) + (int)mmny.get(mid));
            }
        } while (!cfi);
    }
}
