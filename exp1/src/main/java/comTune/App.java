package comTune;

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
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();

        Husband h = new Husband();
        Wife w = new Wife();
        h.sethId(1);
        h.sethName("Aman");
        h.setWife(w);

        w.setwId(2);
        w.setwName("Nanda");
        w.setHusband(h);

        session.save(w);
        session.save(h);

        tr.commit();
        session.close();
        System.out.println("Details have been added.");

    }
}
