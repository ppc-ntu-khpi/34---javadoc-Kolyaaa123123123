package domain;
/**
 * class Manager extends Employee
 * @author Kolya
 */
public class Manager extends Employee {

    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    
    /**
     * method with getting Employees
     * @return string s
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * method with setting employees
     * @param employees 
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * getting list with employees
     * @return 
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
