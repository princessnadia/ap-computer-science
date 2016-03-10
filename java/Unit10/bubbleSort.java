import java.util.*;
/*
 * bubbleSort.java
 * @author marlene yuuki
 * @version d71.03.08
 */
public class bubbleSort
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] sorter = new int[8];
        for (int n = 0; n < sorter.length; n++)
        {
            sorter[n] = rand.nextInt(1000);
        }
        int[] sorted = sortArray(sorter);
        for (int m: sorted) System.out.print(m + ", ");
    }

    public static int[] sortArray(int[] sortme)
    {
        int[] sorted = sortme;
        int sort1 = 0, sort2 = 0;
        boolean done;
        do
        {
            done = true;
            for (int n = 0; n < sorted.length - 1; n++)
            {
                sort1 = sorted[n];
                sort2 = sorted[n + 1];
                if (sort1 > sort2)
                {
                    done = false;
                    sorted[n] = sort2;
                    sorted[(n + 1)] = sort1;
                }
            }
        } while (!done);
        return sorted;
    }
}
