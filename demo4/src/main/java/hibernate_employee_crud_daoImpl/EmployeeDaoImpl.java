package hibernate_employee_crud_daoImpl;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate_employee_crud_Entity.Employee;
import hibernate_employee_crud_config.HibernateUtil;
import hibernate_employee_crud_dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {
    Scanner sc = new Scanner(System.in);

    @Override
    public void addEmp() {
       

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();

        String empName, surname, desig;
        long phone;

        System.out.println("Enter first name: ");
        empName = sc.nextLine();

        System.out.println("Enter surname: ");
        surname = sc.nextLine();

        System.out.println("Enter designation: ");
        desig = sc.nextLine();

        System.out.println("Enter phone : ");
        phone = sc.nextLong();
        sc.nextLine();

        Employee emp = new Employee();
        emp.setEmpName(empName);
        emp.setSurname(surname);
        emp.setDesig(desig);
        emp.setPhone(phone);

        session.save(emp);
        ts.commit();
        session.close();

        System.out.println("Employee added successfully.");
    }

    @Override
    public void deleteEmp() {
        System.out.println("Enter the Id of employee to be deleted:");
        int Id = sc.nextInt();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        Query query = session.createQuery("delete from Employee where empId =:Id");
        query.setParameter("Id", Id);
       

        int result = query.executeUpdate();
        tr.commit();
        if(result > 0)
        {
            System.out.println("Employee deleted successfully.");
        }
        else
        System.out.println("Error while deleting employee");

        session.close();
        
    }

    @Override
    public void updateEmp() {
        // Session session = HibernateUtil.getSessionFactory().openSession();
        // Transaction ts = session.beginTransaction();

        // Query query = session.createQuery("update employee_details set desig =: des where empId =: Id");
        // query.setParameter("des", sc.nextLine());
        // query.setParameter("Id", sc.nextInt());
        // query.executeUpdate();

        // System.out.println("Employee updated.");
        // ts.commit();
        // session.close();

        Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.print("Enter the student id to update: ");
		int empId = sc.nextInt();
		
		Employee employeeUpdate = session.get(Employee.class, empId);
		if(employeeUpdate != null) {
			
			boolean isUpdating = true;
			while(isUpdating) {
				System.out.println("Select the field to update: ");
				System.out.println("1. Name: ");
				System.out.println("2. surname: ");
				System.out.println("3. Mobile Number: ");
				System.out.println("4. Designation ");
                System.out.println("5. exit");
				
				int choice = sc.nextInt();
				sc.nextLine(); // consume newline
				
				switch (choice) {
			
				case 1:
					System.out.print("Enter the name: ");
					String name = sc.nextLine();
					employeeUpdate.setEmpName(name);
					break;
					
				case 2:
					System.out.print("Enter the surname: ");
					String surname = sc.nextLine();
					employeeUpdate.setSurname(surname);
					break;
					
				case 3:
					System.out.print("Enter the phone number: ");
					long phone = sc.nextLong();
					employeeUpdate.setPhone(phone);
					break;
                    

                case 4:
                    System.out.println("Enter the Designation: ");
                    String desig = sc.nextLine();
                    employeeUpdate.setDesig(desig);
                    break;
					
				case 5:
					isUpdating = false;
					break;
				
				default:
					System.out.print("Invalid choice. Please select a valid option. ");
					break;
				}
			}
			session.update(employeeUpdate);
			tx.commit();
			System.out.println("Employee with Id " + empId + " has been updated.");
		}
		else 
			System.out.println("Employee with Id " + empId + " not found.");
	
		session.close();
    }

    @Override
    public void getEmployee() {
        Session session = HibernateUtil.getSessionFactory().openSession();
		List<Employee> employee = session.createQuery("FROM employee_details", Employee.class).list();
		session.close();
		
		System.out.println("Employee List: ");
		for(Employee std: employee) {
			
			System.out.println("Student Id: " + std.getEmpId());
			System.out.println("Name: " + std.getEmpName());
			System.out.println("Course: " + std.getSurname());
			System.out.println("Mobile Number: " + std.getPhone());
            System.out.println("Mobile Number: " + std.getDesig());
		}
    }
    
}
