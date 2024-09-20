package spring_annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    private String carName;
    @Autowired
    private Engine engine;

    public String getCarName() {
        return carName;
    }
    public Engine getEngine() {
        return engine;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    
}
