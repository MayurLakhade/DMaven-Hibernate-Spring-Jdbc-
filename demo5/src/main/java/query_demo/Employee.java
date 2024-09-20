package query_demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(
    {
        @NamedQuery(
            name = "findEmployeeByName",
            query = "from Employee e where e.name =:name"
        )
        // @NamedQuery (
        //     name = "findEmployeeBySalary",
        //     query = "from Employee e where e.salary =:salary"
        // ),
        // @NamedQuery(
        //     name = "findEmployeeBySalary",
        //     query = "from Employee e where e.salary>500"
        // )
    }
)
@Entity
@Table(name = "employee_info")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    int salary;
    String job;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", job=" + job + "]";
    }
    
}
