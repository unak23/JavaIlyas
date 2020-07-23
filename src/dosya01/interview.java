package dosya01;

import java.util.LinkedList;
import java.util.List;

public class interview {
/*Given a list of integers 1,2,3,4,5,6,7 etc. 
 * remove all values greater than 100
 */
	public static void main(String[] args) {
		
		List<Integer> nums=new LinkedList();
		nums.add(23);
		nums.add(89);
		nums.add(103);
		nums.add(120);
		nums.add(200);
		nums.add(300);
		System.out.println("All numbers"+nums);
		for(int i=0; i<nums.size();i++) {
			if(nums.get(i)>100) {
				nums.remove(i);
				i--;
				
			}
		}
		System.out.println(nums);
	}

}
