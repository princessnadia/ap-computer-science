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
}