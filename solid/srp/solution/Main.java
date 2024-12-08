package solid.srp.solution;

public class Main {

	public static void main(String[] args) {
		Cat c = new Cat("Tommy", "Neunzig", "Bunt", 1);
		Person p = new Person();
		
		c.eat();
		p.feedCat(c);
	}

}
