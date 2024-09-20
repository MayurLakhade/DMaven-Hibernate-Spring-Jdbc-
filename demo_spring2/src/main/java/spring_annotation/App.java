package spring_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * xxml
 * <bean id class="">
 * 
 * @Configuration
 * @ComponentScan (basePackage name="")
 * 
 * @Configuration
 * it is used to indicate that the class declare one or more @bean method
 * this class are process by spring container
 * 
 * @Bean - method level
 * indicates that a method produced a bean to be managed by spring container
 * 
 * @ComponantScan
 * configure the component scanning directives for used with @configuration classes
 * 
 * @Component
 * indicates that annotated class is a component
 * such classes are considered as candidate for auto detection when using annotation based configuration.
 * 
 * @Autowired
 * it is used for automatic injections of beans
 * 
 * @Service
 * 
 * @Repository
 * 
 * @Controller
 * 
 * @RestController
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Engine engine =  context.getBean(Engine.class);
        engine.setEngineType("IC877");

        Car car = context.getBean(Car.class);
        car.setCarName("Alto");

        System.out.println("Car "+ car.getCarName() + " is using the engine type "+ car.getEngine().getEngineType());

        context.close();
    }
}
