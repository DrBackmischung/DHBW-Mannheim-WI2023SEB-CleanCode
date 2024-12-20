package solid.lsp.exercise;

public class Main {

	public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setHeight(5);
        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Expected: 20

        Square square = new Square();
        square.setSide(4);
        System.out.println("Square Area: " + square.calculateArea()); // Expected: 16
	}

}
