package solid.isp.exercise;

public class Airplane implements Flyable {
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
}
