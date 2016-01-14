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
        System.out.print("How many tests? > ");
        tsn = inp.nextInt();
        String[] stnm = new String[stn];
        int[][] tsnm = new int[stn][tsn];
        for (int n = 0; n < stn; n++)
        {
            System.out.print("Name of student no." + n + "? > ");
            stnm[n] = inp.next();
        }
        for (int o = 0; o < stn; o++)
        {
            for (int p = 0; p < tsn; p++)
            {
                System.out.print( stnm[o] + "'s score on test no. " + p + "? > ");
                tsnm[o][p] = inp.nextInt();
            }
        }
    }
}





































