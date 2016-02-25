/*
 * employee info
 * 
 * @author marlene yuuki
 * @version d71.02.25
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
     * add employee to the mix at salary rate
     */
    public void addEmployee(String name, String jobTitle, double salary)
    {
        if (employeeList.size() != 0)
        {
            for (int m = 0; m < employeeList.size(); m++) 
            {
                if (employeeList.get(m).getSalary() < salary)
                {
                    employeeList.add(m - 1,new SalaryInfo(name,jobTitle,salary));
                    return;
                }
            }
        }
        else
        {
            employeeList.add(new SalaryInfo(name,jobTitle,salary));
            return;
        }
    }

    /*
     * for name, get first match
     */
    public int findEmployee(String name)
    {
        for (int n = 0; n < employeeList.size(); n++)
        {
            if (employeeList.get(n).getName().equals(name)) return n;
        }
        return -1;
    }

    /*
     * fires and re-adds an employee
     */
    public void updateSalary(String name, double newSalary)
    {
        int m = findEmployee(name);
        String n = employeeList.get(m).getName(), o = employeeList.get(m).getJobTitle();
        Double p = newSalary;
        fire(name);
        addEmployee(n,o,p);
    }

    public void fire(String name)
    {
        int m = findEmployee(name);
        employeeList.remove(m);
    }
    
    /*
     * updates an employee's job title
     */
    public void newJobTitle(String name, String newTitle)
    {
        int m = findEmployee(name);
        employeeList.get(m).updateJobTitle(newTitle);
    }
    

    /*
     * returns every employee with a certain job title
     */
    public String printJob(String title)
    {
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < employeeList.size(); x++)
        {
            sb.append("\n" + employeeList.get(x).getName());
        }
        return sb.toString();
    }

    /*
     * returns every employee's info
     * format: \nname
     */
    public String toString()
    {
        StringBuilder out = new StringBuilder();
        for (int x = 0; x < employeeList.size(); x++)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(employeeList.get(x).getName());
            sb.append(" - ");
            sb.append(employeeList.get(x).getJobTitle());
            sb.append(" - ");
            sb.append(employeeList.get(x).getSalary());
            out.append(sb.toString());
        }
        return out.toString();
    }
}