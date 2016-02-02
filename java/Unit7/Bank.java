import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.tools.*;
public class Bank
{
    public String[] name;
    public int[] chek, save, numb;
    public Bank()
    {
        String csvFile = "Bank.csv";
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
                if(lines[0].equals("nt") != true)
                {
                    lines = line.split(csvSplitBy);
                    id = lines[0];
		    name[id] = lines[1];
                    chek[id] = Integer.parseInt(lines[2]);
                    save[id] = Integer.parseInt(lines[3]);
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
        System.out.println("--DATA LOADED--");
        FileWriter save = new FileWriter("Bank.csv", true);
    }

    public void saveNewChange (int sid, int term, int def)
    {
        switch (term)
	{
	    case 1:
                save.append("\n" + sid + "," + name[sid] + "," + (chek[sid] + def) + "," + save[sid]);
	        break;
            case 2:
	        save.append("\n" + sid + "," + name[sid] + "," + chek[sid] + "," + (save[sid] + def));
		break;
	}
    }

    public void saveNewName (int sid, String nName)
    {
        save.append("\n" + sid + "," + nName + "," + chek[sid] + "," + save[sid]);
    }
}
