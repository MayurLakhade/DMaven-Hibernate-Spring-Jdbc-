package hibernate_employee_crud_Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Employee_Details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int empId;
    private String empName;
    private String surname;
    private long phone;
    private String desig;

    public Employee()
    {

    }

    public Employee(int empId, String empName, String surname, long phone, String desig) {
        this.empId = empId;
        this.empName = empName;
        this.surname = surname;
        this.phone = phone;
        this.desig = desig;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", surname=" + surname + ", phone=" + phone
                + ", desig=" + desig + "]";
    }

    
}
