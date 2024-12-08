package solid.isp.exercise;

public class Motorcycle implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Motorcycles cannot fly.");
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException("Motorcycles cannot sail.");
    }

    @Override
    public void loadCargo() {
        throw new UnsupportedOperationException("Motorcycles cannot load cargo.");
    }
}
