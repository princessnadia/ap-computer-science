import java.util.*;
import java.lang.Math;
public class Data2
{
    public static void equipItem(String it)
    {
        int itemd = 0;
        for (int emi = 100; emi < 1000; emi++) {
            if (it.equals(Data1.pname.get(emi))) itemd = emi;
        }
        if ((int)Data1.pamnt.get(itemd) != 0) 
        {
            switch (itemd) {
                case 100:
                Data1.pamnt.put(9907,0);
                break;
                case 101:
                Data1.pamnt.put(9907,1);
                break;
                case 102:
                Data1.pamnt.put(9907,2);
                break;
                case 103:
                Data1.pamnt.put(9907,3);
                break;
                case 200:
                Data1.pamnt.put(9908,0);
                break;
                case 201:
                Data1.pamnt.put(9908,1);
                break;
                case 202:
                Data1.pamnt.put(9908,2);
                break;
                case 203:
                Data1.pamnt.put(9908,3);
                break;
                case 300:
                Data1.pamnt.put(9908,0);
                break;
                case 301:
                Data1.pamnt.put(9909,1);
                break;
                case 302:
                Data1.pamnt.put(9909,2);
                break;
                case 303:
                Data1.pamnt.put(9909,3);
                break;
                case 400:
                Data1.pamnt.put(9910,0);
                break;
                case 401:
                Data1.pamnt.put(9910,1);
                break;
                case 402:
                Data1.pamnt.put(9910,2);
                break;
                case 403:
                Data1.pamnt.put(9910,3);
                break;
                case 500:
                Data1.pamnt.put(9911,0);
                break;
                case 501:
                Data1.pamnt.put(9911,1);
                break;
                case 502:
                Data1.pamnt.put(9911,2);
                break;
                case 503:
                Data1.pamnt.put(9911,3);
                break;
                case 600:
                Data1.pamnt.put(9912,0);
                break;
                case 601:
                Data1.pamnt.put(9912,1);
                break;
                case 602:
                Data1.pamnt.put(9912,2);
                break;
                case 603:
                Data1.pamnt.put(9912,3);
                break;
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
            case "weap":
            idc = 101;
            break;
            case "head":
            idc = 201;
            break;
            case "body":
            idc = 301;
            break;
            case "arms":
            idc = 401;
            break;
            case "legs":
            idc = 501;
            break;
            case "feet":
            idc = 601;
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