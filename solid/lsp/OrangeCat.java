package solid.lsp;

public class OrangeCat extends Cat {

	public OrangeCat(String firstName, String lastName, String color, int age) {
		super(firstName, lastName, color, age);
	}
	
	public void eat() {
		System.out.println("NOM NOM NOM I AM SO HUNGRY");
	}
	
	public void hunt() {
		System.out.println("Ich kann aber nicht jagen!!!");
	}

}
