package ilyas.string.class01;

public class string3 {

	public static void main(String[] args) {
		System.out.println("-----split() FUNCTION-------");
		 
		String today="Today is my favorite Java class";
		String[] array=today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);

		String today1="Today is my favorite Java class";
		String[] stringArray=today1.split("a");
		//print all element from array 1 by 1
		//(element type variableName:name of array
		for(String     arr          :stringArray) {
			System.out.print(arr+"-");
		}
	}

}
