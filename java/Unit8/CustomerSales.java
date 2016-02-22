import java.util.*;
public class CustomerSales
{
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<BusinessTracker> business = new ArrayList<BusinessTracker>();
    private static void addB ()
    {
        String name = "";
        int cust = 0;
        double doll = 0.0;
        business.add(new BusinessTracker(name, cust, doll));
    }
    
    private static void repB ()
    {
        String name = "";
        int cust = 0;
        double doll = 0.0;
        business.add(new BusinessTracker(name, cust, doll));
    }
    
    private static void delB ()
    {
        String name = "";
        int cust = 0;
        double doll = 0.0;
        business.add(new BusinessTracker(name, cust, doll));
    }
    
    public static void main (String[] args) 
    {
        business.add(new BusinessTracker("Argus Enterprises", 6147, 3500.0));
        business.add(new BusinessTracker("RECT Progress Inc.", 300, 5602.5));
        business.add(new BusinessTracker("Zaskar Entertainment", 4000, 12455.6));
        business.add(new BusinessTracker("Ymir Game Studios", 6000, 2250.0));
        boolean fin = false;
        String inp;
        do
        {
            inp = "";
            System.out.println("Commands: ADD, REPLACE, REMOVE, END");
            System.out.print("\n>");
            inp = scan.nextLine().toLowerCase();
            
            switch (inp) 
            {
                case "add":
                break;
                case "replace":
                break;
                case "remove":
                break;
                case "end":
                break;
                default:
                System.out.println("Command not found");
                break;
            }
        } while (!fin);
    }
}