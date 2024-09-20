package spring_shape_program;

public class Circle implements Shape {

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
          System.out.println("Drawing "+color+" circle.");
    }
    
}
