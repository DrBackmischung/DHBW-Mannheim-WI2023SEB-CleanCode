package solid.lsp;

public class Main {

	public static void main(String[] args) {
		Cat lion = new Lion("Katzilein", "Blume", "Bunt", 10);
		Cat orangeCat = new OrangeCat("Megatron", "the Emperor", "Very orange", 2);
		
		lion.eat();
		lion.hunt();
		
		orangeCat.eat();
		orangeCat.hunt();
	}

}
