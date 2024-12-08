package solid.ocp.solution;

public class Main {

	public static void main(String[] args) {
		Cat c = new Cat("Tommy", "Neunzig", "Bunt", 1);

		c.play(new Ball());
		c.play(new Feather());
	}

}
