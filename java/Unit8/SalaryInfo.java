/*
 * employee info
 * 
 * @author marlene yuuki
 * @version d71.02.25
 */
public class SalaryInfo
{
    private String name, jobTitle;
    private double salary;
    /*
     * constructor
     */
    public SalaryInfo(String name, String jobTitle, double salary)
    {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    /*
     * returns the constructed employee's name
     */
    public String getName()
    {
        return name;
    }
    /*
     * returns the constructed employee's job title
     */
    public String getJobTitle()
    {
        return jobTitle;
    }
    /*
     * returns the constructed employee's salary
     */
    public double getSalary()
    {
        return salary;
    }
    /*
     * changes the constructed employee's job title
     */
    public void updateJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }
}
