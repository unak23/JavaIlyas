package ilyas.string.class01;

public class String2 {

	public static void main(String[] args) {
		
		String me="Herkese Selam 123456789";
		
		System.out.println(me.contains("Herkese"));
		System.out.println(me.contains("selam"));
	
		System.out.println(me.startsWith("Herkese"));
		System.out.println(me.endsWith("selam"));
		
		boolean ends=me.endsWith("Selam");
		System.out.println(ends);
		
		System.out.println(me.replace("e", "a"));
		
		me=me.replace("Selam", "Hi");
		System.out.println(me);
		
		System.out.println(me.replaceAll("[A-Z]", " "));
		
		System.out.println(me.replaceAll("[0-9]", " "));
		
		System.out.println(me.charAt(4));
		
		System.out.println(me.indexOf(1));
		
		System.out.println(me.substring(6));
		
		System.out.println(me.substring(6,15));
		
	}

}
