public class Use
{
    public static void usethis(String itn)
    {
        int dpl = 0;
        boolean used = false;
        for (int i = 1; i < 100; i++)
        {
            if (itn.equals(Data.name[i]))
            {
                used = true;
                if (Data.amnt[i] == 0)
                {
                   System.out.println("You have none of that item!"); 
                }
                else if (Data.spec[i])
                {
                    switch(i)
                    {
                        case 1:
                        Data.amnt[1992] = 0;
                        Data.amnt[1993] = 0;
                        System.out.println("Teleported back home!");
                        dpl = 1;
                        break;
                        default:
                        break;
                    }
                }
                else
                {
                    Data.amnt[1995] += Data.hpup[i];
                    Data.amnt[1996] += Data.apup[i];
                    Data.amnt[1997] += Data.enup[i];
                }
            }
            if (dpl != 0) Data.amnt[i]-= dpl;
        }
        if (used) System.out.println("Use which item? (Equip equippables with \"equip\" ");
    }
    public static void equipthis(String itn)
    {
        for (int i = 1; i < Data.name.length; i++)
        {
            if (itn.equals(Data.name[i]))
            {
                if (Data.amnt[i] == 0)
                {
                   System.out.println("You have none of that item!"); 
                }
                else
                {
                    switch(i)
                    {
                        case 1:
                        Data.amnt[1992] = 0;
                        Data.amnt[1993] = 0;
                        System.out.println("Teleported back home!");
                        break;
                        case 2:
                        break;
                        case 3:
                        break;
                        case 4:
                        break;
                        case 5:
                        break;
                        case 6:
                        break;
                        case 7:
                        break;
                        case 8:
                        break;
                        case 9:
                        break;
                        case 10:
                        break;
                        case 11:
                        break;
                        default:
                        System.out.println("Use which item? (Use disposables with \"use\" ");
                        break;
                    }
                }
            }
        }
    }
}