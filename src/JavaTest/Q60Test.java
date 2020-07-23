package JavaTest;

public class Q60Test {

	public static void main(String[] args) {
		
		Q60Test ts = new Q60Test();
		System.out.println(isAvailable + " ");
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
		
	}

	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable = false;
}
