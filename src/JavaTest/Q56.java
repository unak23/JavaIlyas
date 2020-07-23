package JavaTest;

public class Q56 {

	public static void main(String[] args) {
		
		int [] stack = {10,20,30};
		int size =3;
		int idx=0;
		
//		do {
//			idx++;
//		}while(idx>=size);
		
//		while (idx<size) {
//			idx++;
//		}
		
		do {
			idx++;
			System.out.println("The Top element: "+stack[idx]);
		} while (idx < size-1);
		
//		do {
//			idx++;
//		} while (idx <= size);
//		
//		while (idx <= size-1) {
//			idx++
//		}
		
		//System.out.println("The Top element: "+stack[idx]);
	}

}
