package hibernetutilclasdemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private int empId;
    @Column(name = "FirstName", length = 20)
    private String empName;
    @Column(name = "LastName",length = 20)
    private String surname;
    @Column(name = "Mobile",length = 20)
    private long phone;
    @Column(name = "Desig",length = 20)
    private String designation;

    public Employee()
    {
        
    } 

    public Employee(int empId, String empName, String surname, long phone, String designation) {
        this.empId = empId;
        this.empName = empName;
        this.surname = surname;
        this.phone = phone;
        this.designation = designation;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", surname=" + surname + ", phone=" + phone
                + ", designation=" + designation + "]";
    }
    
}
