package JavaTest;

public class Caller {
	
	private void init() {
		System.out.println("Initialized");
	}
	
	private void start() {
		init();
		System.out.println("Started");
	}
	
	
	



	
	public static void main(String[] args) {
		
		Caller c = new Caller();

		c.init();
		c.start();
	}
}
