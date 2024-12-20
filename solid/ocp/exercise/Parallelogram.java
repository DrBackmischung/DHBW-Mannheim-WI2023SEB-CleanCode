package solid.ocp.exercise;

public class Parallelogram extends Shape {
    private double base;
    private double height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    @Override  
    public double calculateArea() {
        return base * height;
    }
}
