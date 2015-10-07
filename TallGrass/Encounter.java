import java.util.*;
import java.lang.Math;
public class Encounter
{
    private static Scanner inp = new Scanner(System.in); 
    private static Random gen = new Random();
    public Encounter()
    {
        Random gen = new Random(Run.tlX + Run.tlY);
    }

    public void tile()
    {
        int rng = gen.nextInt(8);
        System.out.println(rng);
        if(rng == 6 || (Math.abs(Run.tlX) + Math.abs(Run.tlY)) % 10 == 0) {
            System.out.println("Encounters WIP!");
        }
    }
}
