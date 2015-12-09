import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Data
{
    public static int[] valu = new int[2000]; 
    public static int[] wght = new int[2000];
    public static int[] amnt = new int[2000];
    public static String[] name = new String[2000];
    public static String[] desc = new String[2000];
    // order: ID, NAME, DESC, VALUE, WEIGHT, AMOUNT
    public Data()
    {
        String csvFile = "StaticItems.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        try 
        {
            String[] lines = line.split(csvSplitBy);
            br = new BufferedReader(new FileReader(csvFile));
            int id;
            while ((line = br.readLine()) != null) 
            {
                if(lines[0].equals("nt"))
                {
                    // do nothing
                }
                else
                {
                    lines = line.split(csvSplitBy);
                    id = Integer.parseInt(lines[0]);
                    name[id] = lines[1];
                    desc[id] = lines[2];
                }
            }

        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("--LINE SKIPPED--");
        }
        System.out.println("Done");
    }

    public static void printItemGrid()
    {
        System.out.println("\f-----ITEM LIST-----\n-------------------");
        String csvFile = "StaticItems.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        try 
        {
            String[] lines = line.split(csvSplitBy);
            br = new BufferedReader(new FileReader(csvFile));
            int id;
            while ((line = br.readLine()) != null) 
            {
                lines = line.split(csvSplitBy);
                if(lines[0].equals("nt"))
                {
                    System.out.println("// " + lines[1]); 
                }
                else
                {
                    id = Integer.parseInt(lines[0]);
                    name[id] = lines[1];
                    desc[id] = lines[2];
                    System.out.println(lines[0] + ": " + lines[1] + "\n" + lines[2] + "\n-------------------"); 
                }
            }

        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("--LINE SKIPPED--");
        }
    }
}