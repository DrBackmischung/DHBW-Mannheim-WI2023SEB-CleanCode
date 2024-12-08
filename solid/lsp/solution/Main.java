package solid.lsp.solution;

public class Main {

	public static void main(String[] args) {
		Cat lion = new Lion("Mauzi");
		Cat orangeCat = new OrangeCat("Megatron");
		
		lion.eat();
		((Lion) lion).hunt();
		
		orangeCat.eat();
//		((Lion) orangeCat).hunt();
		
//		Hunter miezer = new OrangeCat("Miezer");
	}

}
