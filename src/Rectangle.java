
public class Rectangle extends Figure {

    private final double width, length; //sides

    public Rectangle() {
        this(1,1);
    }
    

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public void findArea() {
        super.dim1=width * length;
    }

    public void findPerimeter() {

        super.dim1 =2 * (width + length);
    }
}