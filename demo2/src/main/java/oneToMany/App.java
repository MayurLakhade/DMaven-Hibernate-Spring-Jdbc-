package oneToMany;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionfactory = cfg.buildSessionFactory();
        Session session = sessionfactory.openSession();

        Transaction tx = session.beginTransaction();
        
        Parent p1 = new Parent();
        p1.setId(1);
        p1.setpName("amitabh");

        Childs c1 = new Childs();
        c1.setcId(1);
        c1.setcName("Abhishek");

        Childs c2 = new Childs();
        c2.setcId(2);
        c2.setcName("naina");

        session.save(c1);
        session.save(c2);

        HashSet<Childs> childSet = new HashSet<Childs>();
        childSet.add(c1);
        childSet.add(c2);
        
        p1.setChild(childSet);

        session.save(p1);

        tx.commit();
        session.close();

        System.out.println("Data added");

    }
}
