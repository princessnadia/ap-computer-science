import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Data
{
    public static int[] id, valu, wght, amnt;
    public static String[] name, desc;
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
            while ((line = br.readLine()) != null) 
            {
                id = Integer.parseInt(lines[0]);
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

        finally {
            if (br != null) 
            {
                try 
                {
                    br.close();
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Done");
    }
}