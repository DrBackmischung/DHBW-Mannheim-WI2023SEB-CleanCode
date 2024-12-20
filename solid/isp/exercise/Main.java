package solid.isp.exercise;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        Flyable airplane = new Airplane();
        airplane.startEngine();
        airplane.fly();

        Sailable boat = new Boat();
        boat.sail();

        Loadable truck = new Truck();
        truck.loadCargo();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.startEngine();
    }

}
