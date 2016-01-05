import java.util.*;
import java.lang.Math;

public class DegToRad
{
	public static void main (String[] args)
	{
		Scanner inp = new Scanner(System.in);
		int d;
		String r;
		System.out.print("\nDegree > ");
		d = inp.nextInt();
		r = dtor(d);
		System.out.println("" + r);
	}

	private static String dtor(int d)
	{
		float num = (float)d, den = 1, lc = 1;
		num = num / 180;
		if (num > 1)
			while (num % den != 0)
			{
				den++
				3
			}

		return (num + "π/1");
        }
}
