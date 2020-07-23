package JavaTest;

public class Q80Vowel {

	private char var;
	
	public static void main(String[] args) {
		
		char var1 = 'a';
		char var2 = var1;
		
		System.out.println(var1);
		System.out.println(var2);
		var2 = 'e';
		System.out.println(var2);
		
		Q80Vowel obj1 = new Q80Vowel();
		Q80Vowel obj2 = obj1;
		
		obj1.var = 'i';
		System.out.println(obj1.var);
		System.out.println(obj2.var);

		obj2.var = 'o';
		System.out.println(obj1.var);
		System.out.println(obj2.var);
		
		
		System.out.println(var1 + ", "+var2);
		System.out.println(obj1.var+ ", "+obj2.var);

	}

}
