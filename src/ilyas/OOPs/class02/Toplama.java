package ilyas.OOPs.class02;

public class Toplama {

	public int toplama() {
		int a=15;
		int b=20;
		int c=a+b;
		return c;
	}
	
	
	
	public static void main(String[] args) {
		 
		Toplama obj=new Toplama();
		int x=obj.toplama();
		System.out.println(x);

	}

}
