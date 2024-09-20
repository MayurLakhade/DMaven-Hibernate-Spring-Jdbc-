package spring_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring_annotation")
public class AppConfig {

    @Bean
    public Engine engine()
    {
        return new Engine();
    }

    @Bean
    public Car getCar()
    {
        return new Car();
    }
    
}
