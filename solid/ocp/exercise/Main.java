package solid.ocp.exercise;

public class Main {

	public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Parallelogram parallelogram = new Parallelogram(8, 3);
        Triangle triangle = new Triangle(8, 2);
        
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Parallelogram Area: " + parallelogram.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
	}

}
