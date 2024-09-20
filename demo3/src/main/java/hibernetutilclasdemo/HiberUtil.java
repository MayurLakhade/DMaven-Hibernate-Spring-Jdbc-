package hibernetutilclasdemo;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HiberUtil {
    private static SessionFactory sessionFactory; // This sessionFactory will use to create instance of session.
                                                  // It creates only once.

    public static SessionFactory getSessionFactory()
    {
        if(sessionFactory == null)
        {
            try {
                Properties settings = new Properties(); // Collection framework legecy class.
                settings.put(Environment.HBM2DDL_AUTO, "update");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/Anudip_6201");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "Lakhade@2001");
                settings.put(Environment.SHOW_SQL, "true");

                Configuration configuration = new Configuration();
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(Employee.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return sessionFactory;
    }


    
    
}
