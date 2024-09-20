package junit_programs;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  
    private int empId;
    private String empName;
    private String salary;

    public Employee(int empId, String empName, String salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + empId;
        result = prime * result + ((empName == null) ? 0 : empName.hashCode());
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
       Employee emp = (Employee) obj;
       boolean status = false;
       if(this.empName.equalsIgnoreCase(emp.empName) && this.empId == emp.empId && this.salary == emp.salary)
       {
        status =true;
       }
       return status;
    }

    public static List<Employee> getEmployeeList()
    {
        List<Employee> emps = new ArrayList<Employee>();

        emps.add(new Employee(1, "Naman", "456" ));
        emps.add(new Employee(2, "Kartik", "123"));
        emps.add(new Employee(3, "mayank", "866"));

        return emps;
    }
    
     
    
}
