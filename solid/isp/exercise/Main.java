package solid.isp.exercise;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        Vehicle airplane = new Airplane();
        airplane.startEngine();
        airplane.fly();
//        airplane.sail();

        Vehicle boat = new Boat();
        boat.sail();

        Vehicle truck = new Truck();
        truck.loadCargo();
//        truck.fly();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.startEngine();
    }

}
