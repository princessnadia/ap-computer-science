/*
 * employee info
 * 
 * @author marlene yuuki
 * @version d71.02.23
 */
import java.util.*;
public class Employees
{
    private List<SalaryInfo> employeeList;
    /*
     * constructor
     */
    public Employees()
    {    
        employeeList = new ArrayList<SalaryInfo>();
    }
    
    /*
     * add employee to the mix
     */
    public void addEmployee(String name, String jobTitle, double salary)
    {
        employeeList.add(new SalaryInfo(name,jobTitle,salary));
    }
    /*
     * for name, get first match
     */
    public int findEmployee(String name)
    {
        int m = -1;
        for (int n = 0; n < employeeList.size(); n++)
        {
            if (employeeList.get(n).getName().equals(name)) m = n;
        }
        return m;
    }
    /*
     * 
     */
    public void updateSalary(String name, double newSalary)
    {
        int m = findEmployee(name);
        employeeList.set(x, new EmployeeList(name, employeeList.get(x).getJobTitle(), employeeList.get(x).getSalary()));
    }
    public void fire(String name)    //removes an employee
    public void newJobTitle(String name, String newTitle)    //updates an employee's job title
    public String printJob(String title)    //prints every employee with a certain job title
    public String toString()    //returns every employee's information
}