package solid.lsp.solution;

public class OrangeCat implements Cat {
	
	private String firstName;

	public OrangeCat(String firstName) {
		super();
		this.firstName = firstName;
	}
	
	public void eat() {
		System.out.println("I am so orange, I am so hungry");
	}
	
	public void sleep() {
		System.out.println("...eepy....."+firstName+" is tired...now sleep...");
	}

}
