package solid.isp.exercise;

public class Truck implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Truck engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Trucks cannot fly.");
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException("Trucks cannot sail.");
    }

    @Override
    public void loadCargo() {
        System.out.println("Truck cargo loaded.");
    }
}
