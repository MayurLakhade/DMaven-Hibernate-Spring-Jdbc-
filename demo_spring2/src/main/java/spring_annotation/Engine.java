package spring_annotation;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String engineType;

    public Engine()
    {
        
    }

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
    
}
