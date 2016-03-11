import java.util.*;
public class recursiveMergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of numbers?");
        int sortLength = scan.nextInt();
        int[] sorter = new int[sortLength];
        for (int n = 0; n < sorter.length; n++) {
            sorter[n] = rand.nextInt(1000);
        }
        System.out.println("\n-----\n" + isSorted(sorter));
        for (int m: sorter) System.out.print(m + " ");
        int[] sorted = mergeSort(sorter);
        System.out.println("\n-----\n" + isSorted(sorted));
        for (int m: sorted) System.out.print(m + " ");
    }
    public static int[] mergeSort(int[] arr) {
        for (int m: arr) System.out.print(m + " ");
        System.out.print("\n");
        if (isSorted(arr)) return arr;
        if (arr.length == 2 || (arr.length % 2) == 1) return sort(arr);
        int[] arr2 = new int[arr.length / 2];
        for (int m = 0; m < arr2.length; m++) arr2[m] = arr[m];
        arr2 = mergeSort(arr2);
        int[] arr3 = new int[arr.length / 2];
        for (int m = (arr.length / 2); m < arr.length; m++) arr3[(m - (arr.length / 2))] = arr[m];
        arr3 = mergeSort(arr3);
        int[] arr4 = new int[arr.length];
        for (int m = 0; m < arr2.length; m++) arr4[m] = arr2[m];
        for (int m = (arr.length / 2); m < arr.length; m++) arr4[m] = arr3[(m - (arr.length / 2))];
        return sort(arr4);
    }
    public static void stressTest(int sortLength) {
        Random rand = new Random();
        int[] sorter = new int[sortLength];
        for (int n = 0; n < sorter.length; n++) {
            sorter[n] = rand.nextInt(1000);
        }
        System.out.println("\f-----\n" + isSorted(sorter));
        for (int m: sorter) System.out.print(m + ", ");
        int[] sorted = sort(sorter);
        System.out.println("\n-----\n" + isSorted(sorted));
        for (int m: sorted) System.out.print(m + ", ");
    }
    public static int[] sort(int[] sortme) {
        int[] sorted = sortme;
        int sort1 = 0, sort2 = 0;
        boolean done;
        do {
            done = true;
            for (int n = 0; n < sorted.length - 1; n++) {
                sort1 = sorted[n];
                sort2 = sorted[n + 1];
                if (sort1 > sort2) {
                    done = false;
                    sorted[n] = sort2;
                    sorted[(n + 1)] = sort1;
                }
            }
        } while (!done);
        return sorted;
    }
    public static boolean isSorted(int[] arr) {
        for (int m = 1; m < arr.length; m++) {
            if (arr[m] < arr[m - 1]) return false;
        }
        return true;
    }
}
