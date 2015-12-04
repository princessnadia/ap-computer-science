import java.util.*;
import java.lang.Math;
public class Data2
{
    public static void equipItem(String it)
    {
        int itemd = 0;
        for (int emi = 100; emi < 2000; emi++) {
            if (it.equals(Data1.pname.get(emi))) itemd = emi;
        }
        if ((int)Data1.pamnt.get(itemd) != 0) 
        {
            switch (itemd) {
                
                default:
                System.out.println("Equip what item?");
                break;
            }
        }
    }

    public static void useItem(String it)
    {
        int itemd = 0;
        for (int emi = 0; emi < 100; emi++) 
        {
            if (it.equals(Data1.pname.get(emi))) itemd = emi;
        }
        if ((int)Data1.pamnt.get(itemd) != 0)
        {
            switch (itemd) 
            {
                case 1:
                Data1.setHp(100,true);
                Data1.pamnt.put(1,(int)Data1.pamnt.get(1)-1);
                break;
                case 2:
                Data1.setAp(10,true);
                Data1.pamnt.put(2,(int)Data1.pamnt.get(2)-1);
                break;
                case 3:
                Run.tlX = 0;
                Run.tlY = 0;
                System.out.println("Teleported!");
                Data1.pamnt.put(3,(int)Data1.pamnt.get(3)-1);
                break;
                case 4:
                Data1.pamnt.put(9903,((int)Data1.pamnt.get(9903) + 50));
                Data1.pamnt.put(9902,(int)Data1.pamnt.get(9903));
                System.out.println("You now have " + Data1.pamnt.get(9903) + " HP.");
                Data1.pamnt.put(4,(int)Data1.pamnt.get(4)-1);
                break;
                case 5:
                Data1.pamnt.put(9905,((int)Data1.pamnt.get(9905) + 10));
                Data1.pamnt.put(9904,(int)Data1.pamnt.get(9905));
                System.out.println("You now have " + Data1.pamnt.get(9905) + " AP.");
                Data1.pamnt.put(5,(int)Data1.pamnt.get(5)-1);
                break;
                default:
                System.out.println("Use what item?");
                break;
            }
        }
        else
        {
            System.out.println("You don't have any of that item!");
        }
    }
    
        public static void getCatalog(String catg) 
    {
        Scanner inp = new Scanner(System.in); 
        int idc;
        boolean done = false, catfi =  false;
        switch (catg)
        {
            case "disp":
            idc = 1;
            break;
            case "neck":
            idc = 101;
            break;
            case "head":
            idc = 201;
            break;
            case "ring":
            idc = 301;
            break;
            case "back":
            idc = 401;
            break;
            case "body":
            idc = 501;
            break;
            case "arms":
            idc = 601;
            break;
            case "feet":
            idc = 701;
            break;
            case "legs":
            idc = 801;
            break;
            case "hand":
            idc = 901;
            break;
            case "weap":
            idc = 1001;
            break;
            case "curi":
            idc = 1101;
            break;
            case "secn":
            idc = 1201;
            break;
            default:
            idc = 0;
            done = true;
            break;
        }
        if (done) System.out.println("Open which catalog? <disp/weap/head/body/arms/legs/feet>");
        while (!done) {
            if (!Data1.pname.containsKey(idc + 10)) done = true;
            System.out.print("\fITEM / VAL / WGT / EFF\n");
            for(int i = 0; i < 10; i++) {
                System.out.println((String) Data1.pname.get(idc + i) + " / " + Data1.pvalu.get(idc + i) + " / " + Data1.pwght.get(idc + i) + " / " + Data1.peffc.get(idc + i));
            }
            if(!done) System.out.println("-- Press Enter/Return to scroll --");
            else System.out.println("-- Press Enter/Return to return --");
            inp.nextLine();
            idc++;
        }
    }
}