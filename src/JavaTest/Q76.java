package JavaTest;

public class Q76 {

	public static void main(String[] args) {
	
		int[] array = {1, 2, 3, 4, 5};
		
		 
		for(int i: array) {      //enhanced (advanced loop) loop.  //1
			System.out.print(i);
		}  
		
System.out.println();
		
		  System.out.println("Original array: ");  
	        for (int i = 0; i < array.length; i++) {  //3
	            System.out.print(array[i] + " ");  
	        } 
	        
System.out.println();  
	        
	        System.out.println("Array in reverse order: ");  
	        //Loop through the array in reverse order  //2
	        
	        for (int i = array.length-1; i >= 0; i--) {  
	            System.out.print(array[i] + " ");  
	        }  

System.out.println(); 

	        for (int i = 0; i < array.length; i+=2) {
	            System.out.print(array[i]+ " ");  
	        } 
	}

}
