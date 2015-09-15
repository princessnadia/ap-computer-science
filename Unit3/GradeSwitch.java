import java.util.*;
public class GradeSwitch
{
    public static void main(String[] args)
    {
        char grade = 'C';
        switch (grade) {
            case 'A': System.out.println("Excellent!"); break;
            case 'B': System.out.println("Very good!"); break;
            case 'C': System.out.println("Decent."); break;
            case 'D': System.out.println("You can do better."); break;
            case 'F': System.out.println("Ouch..."); break;
            default: System.out.println("Try again?"); break;
        }
    }
}