package solid.dip.exercise;

public class BasicLegs {
	public void walk(int steps) {
		System.out.println("Walking "+steps+" steps forward.");
	}
	
	public void turn(int degree) {
		System.out.println("Turning "+degree+" degrees.");
	}
	
	public void turnLeft() {
		turn(270);
	}
	
	public void turnRight() {
		turn(90);
	}
	
	public void turnAround() {
		turn(180);
	}
}
