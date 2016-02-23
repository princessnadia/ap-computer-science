
/**
 * Write a description of class ArrayListSB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ArrayListSB
{
    private static ArrayList<ListObject> lo;
    public static void main(String[] args)
    {
        lo = new ArrayList<ListObject>();
        lo.add(new ListObject("Meow"));
        lo.add(new ListObject("Woof"));
        for (int x = 0; x < lo.size(); x++)
        System.out.println(lo.get(x).ObjectName());
    }
}
