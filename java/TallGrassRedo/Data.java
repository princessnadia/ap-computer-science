import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.tools.*;
public class Data
{
    public static int[] valu = new int[2000]; 
    public static int[] wght = new int[2000];
    public static int[] amnt = new int[2000];
    public static String[] name = new String[2000];
    public static String[] desc = new String[2000];
    public static boolean[] spec = new boolean[2000]; 
    public static int[] hpup = new int[2000];
    public static int[] apup = new int[2000];
    public static int[] ofup = new int[2000];
    public static int[] dfup = new int[2000];
    public static int[] enup = new int[2000];
    public static int[] ofrp = new int[2000];
    public static int[] dfrp = new int[2000];
    public static int[] enrp = new int[2000];
    // order: ID, NAME, DESC, VALUE, WEIGHT, AMOUNT
    public Data()
    {
        String csvFile = "StaticItems.psv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = "%";
        try 
        {
            String[] lines = line.split(csvSplitBy);
            br = new BufferedReader(new FileReader(csvFile));
            int id;
            while ((line = br.readLine()) != null) 
            {
                if(lines[0].equals("nt") != true)
                {
                    lines = line.split(csvSplitBy);
                    id = Integer.parseInt(lines[0]);
                    name[id] = lines[1];
                    desc[id] = lines[2];
                    valu[id] = Integer.parseInt(lines[3]);
                    wght[id] = Integer.parseInt(lines[4]);
                    amnt[id] = Integer.parseInt(lines[5]);
                    spec[id] = (Integer.parseInt(lines[6]) == 1) ? true : false;
                    hpup[id] = Integer.parseInt(lines[7]);
                    apup[id] = Integer.parseInt(lines[8]);
                    ofup[id] = Integer.parseInt(lines[9]);
                    dfup[id] = Integer.parseInt(lines[10]);
                    enup[id] = Integer.parseInt(lines[11]);
                    ofrp[id] = Integer.parseInt(lines[12]);
                    dfrp[id] = Integer.parseInt(lines[13]);
                    enrp[id] = Integer.parseInt(lines[14]);
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

    public static void main(String[] args)
    {
        System.out.println("\f-----ITEM LIST-----\n-------------------");
        String csvFile = "StaticItems.psv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = "%";
        try 
        {
            String[] lines = line.split(csvSplitBy);
            br = new BufferedReader(new FileReader(csvFile));
            int id;
            while ((line = br.readLine()) != null) 
            {
                lines = line.split(csvSplitBy);
                if(Integer.parseInt(lines[0]) == 0)
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

    public static void useItem(String itn,boolean eqp)
    {
        if (eqp) Use.equipthis(itn);
        else Use.usethis(itn);
    }

    public static String searchItem(String itn)
    {
        int n = 0;
        for (int i = 1; i < Data.name.length; i++)
        {
            if (itn.equals(Data.name[i]))
            {
                n = i;
            }
        }
        return "\n-------------------\n" + Data.name[n] + " x" + Data.amnt[n] + "\n" + Data.desc[n] + "\n-------------------";
    }
}
