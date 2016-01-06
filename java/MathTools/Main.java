import java.util.*;

public class Main
{
    public static void main (String[] args)
    {
        Scanner inp = new Scanner(System.in);
        Random gen = new Random();
        int a;
        String b;
        System.out.println("----- MAIN MENU -----");
        System.out.println("1. DEGREES TO RADIANS");
        System.out.println("2. RADIANS TO DEGREES");
        //System.out.println("");
        //System.out.println("");
        //System.out.println("");
        //System.out.println("");
        System.out.print("> ");
        a = inp.nextInt();
        switch(a)
        {
            case 1:
            System.out.print("\nd = ");
            double d = inp.nextDouble();
            System.out.println("r = " + DegToRad.dtor(d));
            break;
            case 2:
            System.out.print("\nr = ");
            double r = inp.nextDouble();
            System.out.println("d = " + RadToDeg.rtod(r));
            default:
            break;
        }
    }
}
