package spring_program;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring framework
 * module
 * Spring core-Ioc
 * AOP
 * Web
 * data access
 * 
 * core container
 * 
 * Interfaces:-                     Implemented classes:-
 * 
 * BeanFactory                      XmlBeanFactory
 * extends
 * ApplicationContext               ClassPathXmlApplicationContext
 * 
 * interface ApplicationContext extends BeanFactory
 * 
 * Configuration 
 * SessionFactory
 * Session
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //this interface will get a bean for a application from spring container
         ApplicationContext context = new ClassPathXmlApplicationContext("Springconfig.xml");
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext/Springconfig.xml");
        Restaurant res = (Restaurant) context.getBean("rest");
        res.greetMessage();
        res.prepareDrink();
    }
}
