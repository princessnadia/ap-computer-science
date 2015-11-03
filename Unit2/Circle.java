//**********************************************************

//  Circle.java

//

//  Print the area of a circle with two different radii

//**********************************************************
import java.util.*;
public class Circle

{

    public static void main(String[] args)

    {
     Scanner scan = new Scanner(System.in);

     final double PI = 3.14159;

     System.out.print("What is your radius? ");
     int radius = scan.nextInt();

     double area = PI * radius * radius;
     double circumference = PI * radius * 2;

     System.out.println("The area of a circle with radius " + radius +

                        " is " + area);
     
     System.out.println("The circumference of a circle with radius " + radius +

                        " is " + circumference);

     radius = radius * 2;
     area = PI * radius * radius;
     circumference = PI * radius * 2;

     System.out.println("The area of a circle with radius " + radius +

                        " is " + area);
                        
     System.out.println("The circumference of a circle with radius " + radius +

                        " is " + circumference);
    }

}