import java.util.*;
import java.lang.Math;
public class Tile
{
    private static Scanner inp = new Scanner(System.in); 
    private static Random gen = new Random();
    int rng;
    int rni;
    public Tile()
    {
        Random gen = new Random(Run.tlX + Run.tlY);
    }

    public void tile()
    {
        rng = gen.nextInt(100);
        System.out.println(rng);
        if (rng >= 90) {
            System.out.println("Encounters WIP!");
        }
        if (rng <= 5) {
            do {
                rni = gen.nextInt(513);
            } while (Items.iname.get(rni) == null);
            Items.iownd.put(rni,((int)Items.iownd.get(rni)+1));
            System.out.println("You found a " + Items.iname.get(rni) + "!");
        }
    }
}
