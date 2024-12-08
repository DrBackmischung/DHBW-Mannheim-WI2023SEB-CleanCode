package solid.dip.exercise;

public class Main {

	public static void main(String[] args) {
		Robot r = new Robot(new BasicLegs(), new BasicHands(), new BasicPowerSource());
		r.goToChargingStation();
	}

}
