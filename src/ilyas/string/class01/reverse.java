package ilyas.string.class01;

public class reverse {

	public static void main(String[] args) {
		/*Create a String and print it in reverse order 
		 * (Sunday → yadnuS).*/

	       String str="Sunday";
				/*char reverse;
				for( int i=5; i>=0; i--) {
				reverse=str.charAt(i);
				System.out.print(reverse);
				}*/
				
				char reverse;
				for (int i=str.length()-1;i>-1;i--) {
					reverse=str.charAt(i);
					System.out.print(reverse);
				}
				System.out.println();
				
	}
}
