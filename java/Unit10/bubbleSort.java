public class bubbleSort
{
	public static void main(String[] args)
	{
		int[] sorter = new int[8];
		sorter[0] = 9;
		sorter[1] = 3;
		sorter[2] = 2;
		sorter[3] = 5;
		sorter[4] = 1;
		sorter[5] = 8;
                sorter[6] = 7;
                sorter[7] = 6;
		int[] sorted = sortArray(sorter);
		for (int m: sorted) System.out.print(m);
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
