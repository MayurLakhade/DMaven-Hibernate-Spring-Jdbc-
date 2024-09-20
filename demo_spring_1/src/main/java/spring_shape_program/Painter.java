package spring_shape_program;

public class Painter implements Performer {

    Shape shape;

    public Painter(Shape shape) {
        this.shape = shape;
    }

    public void perform()
    {
        System.out.println("Painter is ");
        shape.draw();
    }
    
}
