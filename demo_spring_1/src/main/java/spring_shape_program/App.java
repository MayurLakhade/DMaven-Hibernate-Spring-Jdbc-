package spring_shape_program;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Performer performer = (Performer) context.getBean("sohan");
        Performer performer2 = (Performer) context.getBean("Mohak");
        performer.perform();
    }
}
