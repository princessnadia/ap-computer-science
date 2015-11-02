import java.util.*;
public class SwitchDemo 
{
    public static void main(String[] args) 
    {
        int month;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a month (1-12): ");
        month = inp.nextInt();
        switch (month) {
            default: System.out.print("Month not found, possibly invalid month?"); break;
            case 1: System.out.print("Morning Star has 31 days!"); break;
            case 2: System.out.print("Sun's Dawn has 28 days!"); break;
            case 3: System.out.print("First Seed has 31 days!"); break;
            case 4: System.out.print("Rain's Hand has 30 days!"); break;
            case 5: System.out.print("Second Seed has 31 days!"); break;
            case 6: System.out.print("Midyear has 30 days!"); break;
            case 7: System.out.print("Sun's Height has 31 days!"); break;
            case 8: System.out.print("Last Seed has 31 days!"); break;
            case 9: System.out.print("Heartfire has 30 days!"); break;
            case 10: System.out.print("Frostfall has 31 days!"); break;
            case 11: System.out.print("Sun's Dusk has 30 days!"); break;
            case 12: System.out.print("Evening Star has 31 days!"); break;
        }
    }
}