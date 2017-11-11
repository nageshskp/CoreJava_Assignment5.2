
public class Circle extends Figure {


    private final double radius;
    
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }   

    public Circle(double radius) {
        this.radius = radius;
    }


    public void findArea() {
        
        super.dim1 =pi * Math.pow(radius, 2);
    }

    public void findPerimeter() {
        super.dim1= 2 * pi * radius;
    }
}
