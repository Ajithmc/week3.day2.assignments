package ListAndSetsAssignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		//declare array 1 ...
		int arr1[] = {3,2,11,4,6,7};
		//array 2..
		int arr2[] =  {1,2,8,4,9,7};
		
		List<Integer> List1 = new ArrayList<Integer>();//list arary 1
		
		List<Integer> List2 = new ArrayList<Integer>();//list arary 1
		
		for (Integer a1 : arr1) {
			List1.add(a1);
		}
		
		for (Integer a2 : arr2) {
			List2.add(a2);
		}
		List1.retainAll(List2);
		System.out.println(List1);
	}

}
