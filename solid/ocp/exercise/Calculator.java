package solid.ocp.exercise;

public class Calculator {
    public static double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidth() * rectangle.getHeight();
        } else if (shape instanceof Parallelogram) {
            Parallelogram parallelogram = (Parallelogram) shape;
            return parallelogram.getBase() * parallelogram.getHeight();
        } else if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            return triangle.getBase() * triangle.getHeight() * 0.5;
        }
        throw new IllegalArgumentException("Unknown shape type");
    }
}
