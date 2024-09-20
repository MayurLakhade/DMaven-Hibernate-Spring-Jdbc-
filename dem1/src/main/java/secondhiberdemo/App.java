package secondhiberdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionfactory = cfg.buildSessionFactory();
        Session session = sessionfactory.openSession();

        Transaction transaction = session.beginTransaction();

        Student s = new Student();

        s.setId(1);
        s.setName("Mohak");
        s.setAge(20);
        s.setCourse("java");

        session.save(s);
        System.out.println("Student is added");
        transaction.commit();
        session.close();

    }
}
