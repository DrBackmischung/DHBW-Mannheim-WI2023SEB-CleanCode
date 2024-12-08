package solid.lsp.exercise;

public class Main {

	public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setHeight(5);
        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Expected: 20

        Rectangle square = new Square();
        square.setWidth(4);
        square.setHeight(5); 
        System.out.println("Square Area: " + square.calculateArea()); // Unexpected: 25
	}

}
