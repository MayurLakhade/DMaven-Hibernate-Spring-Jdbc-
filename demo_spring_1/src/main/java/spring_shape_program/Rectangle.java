package spring_shape_program;

public class Rectangle implements Shape {

   private String color;

    @Override
    public void draw() {
        System.out.println("Drawing "+color+" rectangle");
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
