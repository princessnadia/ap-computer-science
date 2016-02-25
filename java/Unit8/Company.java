// @version d71.02.25
import java.util.*;
public class Company
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Scanner scanLine = new Scanner(System.in);
        Employees list = new Employees();
        int choice = 0;
        do{
            System.out.println("What would you like to do");
            System.out.println("0. Print all employees");
            System.out.println("1. Add an employee");
            System.out.println("2. Update a salary");
            System.out.println("3. Fire employee");
            System.out.println("4. New job title");
            System.out.println("5. Print all of a job title");
            System.out.println("9. Quit");
            System.out.print("Your choice: ");
            choice = scan.nextInt();
            if (choice == 0)
                System.out.print(list);
            if (choice == 1)
            {
                System.out.print("Name: ");
                String name = scanLine.nextLine();
                System.out.print("Job Title: ");
                String title = scanLine.nextLine();
                System.out.print("Salary: ");
                double salary = scan.nextDouble();
                list.addEmployee(name, title, salary);
            }
            if (choice == 2)
            {
                System.out.print("Which employee: ");
                String name = scanLine.nextLine();
                System.out.print("New Salary: ");
                double salary = scan.nextDouble();
                list.updateSalary(name, salary);
            }
            if (choice == 3)
            {
                System.out.print("Which employee: ");
                String name = scanLine.nextLine();
                list.fire(name);
            }
            if (choice == 4)
            {
                System.out.print("Which employee: ");
                String name = scanLine.nextLine();
                System.out.print("New job title: ");
                String newTitle = scanLine.nextLine();
                list.newJobTitle(name, newTitle);
            }
            if (choice == 5)
            {
                System.out.print("Which job title: ");
                String jobTitle = scanLine.nextLine();
                System.out.println(list.printJob(jobTitle));
            }
        }while (choice != 9);
    }
}