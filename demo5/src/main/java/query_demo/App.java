package query_demo;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * interfaces of hibernate framework
 * Configuration
 * SessionFactory
 * Session
 * Transaction
 * Query
 * 
 * jdbc use = sql-structural query language.
 * 
 * Hibernate use = hql-Hibernate query language.
 * -hql is an object-oriented query language similar to sql.
 * But instead of operating on tables and columns, hql works with persistant objects and their properties.
 * 
 * -Hql queries are translated by Hibernate into
 *  conventional sql queries, which in turn perform an action on a database.
 * 
 * -sql-select * from employee; table employee
 * 
 * -hql- from employee; class Employee
 * 
 * String hql = "From Employee";
 * Query query = session 
 * 
 * 
 * The As clause can be used to assign aliases to the classes in 
 * your hql queries, especially when you have long queries.
 * 
 * As clause
 * String hql = "from Employee AS e";
 * Query query = session.createQuery(hql);
 * List result = query.list();
 * 
 * The SELECT clause
 * String hql = "select e.firstName from Employee e";
 * Query query = session.createQuery(hql);
 * List result = query.list();
 * 
 * Where clause 
 * String hql = "from Employee e where e.id = 10";
 * String hql = "select e.firstName from Employee e where e.id = 10";
 * Query query = session.createQuery(hql);
 * List result = query.list();
 * 
 * Order by clause
 * String hql = "from Employee e where e.id > 10 order by e.email DESC";
 * Query query = session.createQuery(hql);
 * List result = query.list();
 * 
 * Group by clause
 * String hql = "select count (e.empId) e.firstName from Employee e group by e.city";
 * Query query = session.createQuery(hql);
 * List result = query.list();
 * 
 * Using Named Parameters
 * String hql = "from Employee e where e.empId =: empId";
 * Query query = session.createQuery(hql);
 * query.setParameter("empId", 10);
 * List result = query.list();
 * 
 * pojo/entity/persistance object
 * 
 * session.save();
 * session.update();
 * session.delete(); delete from table where empId = 1;
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Configuration cfg = new Configuration();
        // cfg.configure("hibernate.cfg.xml");
        // configure hibernate file using StandardServiceRegistry.

        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  // We can use these two lines to configure as well.

        SessionFactory factory = meta.buildSessionFactory();

        Session session = factory.openSession();
        Transaction tr = session.beginTransaction();

        Employee em = new Employee();
        em.setName("Mohak");
        em.setSalary(45552);
        em.setJob("Tester");

        session.save(em);

        TypedQuery query = session.getNamedQuery("findEmployeeByName");
        query.setParameter("name", "Mohak");
        List<Employee> employeeList = query.getResultList();

        Iterator<Employee> itr = employeeList.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();
            System.out.println(e);
            
        }
        
        session.close();




    }
}
