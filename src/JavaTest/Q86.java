package JavaTest;

	interface Readable {

		public void readBook();
		public void setBookMark();
	}
	
	abstract class Book implements Readable{     //line n1
		public void readBook() { }
		
		//public abstract void setBookMark(); //line n2
	}
	
	class EBook extends Book{              //line n3
		public void readBook() {  }

	@Override
	public void setBookMark() {
		// TODO Auto-generated method stub
		
	}
		
		
		//public void setBookMark() {  } //line n4
	}
	
	
public class Q86 {
		
	public static void main(String[] args) {
		

	}

}
