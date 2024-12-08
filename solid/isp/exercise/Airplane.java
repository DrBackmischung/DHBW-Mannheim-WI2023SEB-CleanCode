package solid.isp.exercise;

public class Airplane implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Airplane engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Airplane engine stopped.");
    }

    @Override
    public void fly() {
        System.out.println("Airplane is flying.");
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException("Airplanes cannot sail.");
    }

    @Override
    public void loadCargo() {
        System.out.println("Airplane cargo loaded.");
    }
}
