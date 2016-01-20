import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class TestScores7

{
    public static void main(String[] args)
    {
        int stn = 0, tsn = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("How many students? > ");
        stn = inp.nextInt();
        Students[] st = new Students[stn];
        System.out.print("How many tests? > ");
        tsn = inp.nextInt();
        inp.nextLine();
        for (int n = 0; n < stn; n++)
        {
            System.out.print("Name of student no." + (n + 1) + "? > ");
            st[n] = new Students(inp.nextLine(), tsn);
        }
        for (int o = 0; o < stn; o++)
        {
            for (int p = 0; p < tsn; p++)
            {
                System.out.print(st[o].getName() + "'s score on test no. " + (p + 1) + "? > ");
                st[o].setScore(p, inp.nextInt());
            }
        }
        for (int n = 0; n < stn; n++)
        {
            System.out.println(st[n]);
        }
    }
}





































