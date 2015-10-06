import java.util.*;
import java.lang.Math;
public class Encounter
{
    private static Scanner inp = new Scanner(System.in); 
    private static Random gen = new Random();
    public Encounter(int tlX, int tlY)
    {
        Random gen = new Random(tlX + tlY);
    }

    public void tile(int tlX, int tlY)
    {
        int rng = gen.nextInt(8);
        System.out.println(rng);
        if(rng == 6) {
            System.out.println("Encounters WIP!");
        }
    }
}
