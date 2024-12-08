package solid.isp.exercise;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Cars cannot fly.");
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException("Cars cannot sail.");
    }

    @Override
    public void loadCargo() {
        throw new UnsupportedOperationException("Cars cannot load cargo.");
    }
}
