
public class EatCake {

	public EatCake() {
		
	}
	
	public static void eatCake(Recursion cake) {
		if(!cake.isEmpty()) {
			cake.takeBite();
			eatCake(cake);
		}
		
	}
	
	public static void main(String[] args) {
		Recursion cake = new Recursion();
		eatCake(cake);
		System.out.println("Done eating cake - ready to go back to Java 2!");


	}

}
