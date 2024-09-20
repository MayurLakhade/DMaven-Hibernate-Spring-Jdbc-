package hibernetutilclasdemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session = HiberUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();

        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setEmpName("Mohak");
        emp.setSurname("Samarth");
        emp.setDesignation("Developer");
        emp.setPhone(45456654);

        session.save(emp);
        tr.commit();
        session.close();
        System.out.println("Data entered successfully.");
    }
}
