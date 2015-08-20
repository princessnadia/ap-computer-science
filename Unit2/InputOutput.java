import java.util.*;
public class InputOutput
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.nextLine();
        System.out.print("How old are you? ");
        int age = scan.nextInt();
        System.out.println(name + " is " + age + " years old!");
    }
}