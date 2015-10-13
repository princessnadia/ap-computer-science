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
        Random gen = new Random((int)Data.pownd.get(521) + (int)Data.pownd.get(521));
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
            } while (Data.pname.get(rni) == null);
            Data.pownd.put(rni,((int)Data.pownd.get(rni)+1));
            System.out.println("You found a " + Data.pname.get(rni) + "!");
        }
    }
}
