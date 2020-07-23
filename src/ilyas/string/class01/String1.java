package ilyas.string.class01;

public class String1 {

	public static void main(String[] args) {
		String str1="Hello Word"; //literal(aslina uygun)
		String str2=new String ("MERHABA DUNYA"); //keyword
		String str3="   Selam   ";
		System.out.println(str1.length());
		
		int size=str1.length();
		System.out.println(size);
		
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		str2=str2.toLowerCase();
		System.out.println(str2);
		
		String birlestir=str1.concat(str2);
		System.out.println(birlestir);
		
		System.out.println(str1+" "+str2);
		
		boolean empty=str1.isEmpty();
		System.out.println(empty);
		
		str3=str3.trim();
		System.out.println(str3);	
		System.out.println(str3.trim());
		
		if(str1.equals(str2)) {
			System.out.println("String are equal");
		}else {
			System.out.println("String are not equal");
		}
		
		
	}

}
