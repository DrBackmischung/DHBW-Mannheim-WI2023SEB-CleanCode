package solid.isp.exercise;

public class Boat implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Boat engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Boat engine stopped.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Boats cannot fly.");
    }

    @Override
    public void sail() {
        System.out.println("Boat is sailing.");
    }

    @Override
    public void loadCargo() {
        System.out.println("Boat cargo loaded.");
    }
}
