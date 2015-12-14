public class Use
{
    public static void usethis(String itn)
    {
        for (int i = 1; i < Data.name.length; i++)
        {
            if (itn.equals(Data.name[i]))
            {
                if (Data.amnt[i] == 0)
                {
                   System.out.println("You don't have any of that item!"); 
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
                        System.out.println("Use what item? (Equip equippables with \"equip\" ");
                        break;
                    }
                }
            }
        }
    }
}