 
public class FindAreaAndPerimeter {

	public static void main(String[] args) {


        double width = 5, length = 7;// Declared the variables of type double

        Figure rectangle = new Rectangle(width, length);

        System.out.println("Rectangle width: " + width + " and length: " + length);

        rectangle.findArea();

        System.out.println("Resulting area: " + rectangle.dim1);

        rectangle.findPerimeter();

        System.out.println("Resulting perimeter: " + rectangle.dim1);
 
        System.out.println();
        

        double radius = 5;

        Figure circle = new Circle(radius);

        System.out.println("Circle radius: " + radius);

        circle.findArea();

        System.out.println("Resulting Area: " + circle.dim1 );

        circle.findPerimeter();

        System.out.println("Resulting Perimeter: " + circle.dim1);

 
        System.out.println();
        

        double a = 5, b = 3, c = 4;

        Figure triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c );

        triangle.findArea() ;

        System.out.println("Resulting Area: " + triangle.dim1);

        triangle.findPerimeter();

        System.out.println("Resulting Perimeter: " + triangle.dim1);
    }
}