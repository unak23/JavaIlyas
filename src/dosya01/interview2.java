package dosya01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class interview2 {

	/*Given a list of people’s names “Ahmed”,“John”,“Eric” ,
	 *  write a  java operation to remove all the names named “Ahmed”
	 */
			public static void main(String[] args) {
			
				List<String> myList = new ArrayList<>();
				myList.add("Ahmed");
				myList.add("John");
				myList.add("Eric");
				myList.add("Ahmed");
				System.out.println(myList);
				System.out.println();
				Set<String> newList = new HashSet<>(myList);
				System.out.println(newList);
				newList.remove("Ahmed");
				System.out.println(newList);
			}
		

	}


