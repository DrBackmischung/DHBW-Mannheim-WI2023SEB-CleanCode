package solid.dip.exercise;

public class Robot {
	
	private BasicLegs legs;
	private BasicHands hands;
	private BasicPowerSource powerSource;
	
	public Robot(BasicLegs legs, BasicHands hands, BasicPowerSource powerSource) {
		super();
		this.legs = legs;
		this.hands = hands;
		this.powerSource = powerSource;
	}
	
	public void goToChargingStation() {
		legs.walk(20);
		legs.turnLeft();
		legs.walk(10);
		hands.grab(powerSource);
		powerSource.charge();
	}
	
}
