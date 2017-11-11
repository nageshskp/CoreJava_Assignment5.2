
public class Triangle extends Figure{

    private final double a, b, c;

    public Triangle() {
        this(1,1,1);
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public void findArea() {
        double s = (a + b + c) / 2;
        super.dim1=Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    public void findPerimeter() {
        super.dim1= a + b + c;
    }
}