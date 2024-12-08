package solid.lsp.solution;

public class Lion implements Cat, Hunter {
	
	private String firstName;

	public Lion(String firstName) {
		super();
		this.firstName = firstName;
	}
	
	public void eat() {
		System.out.println("Nom nom nom, "+firstName+" is hungry!");
	}
	
	public void hunt() {
		System.out.println("hehehe >:)");
	}

	@Override
	public void sleep() {
		System.out.println("ZZzzzZzzzzzzz");
	}

}
