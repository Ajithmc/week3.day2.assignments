package ListAndSetsAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		//// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		//sort
		Arrays.sort(arr);
		List<Integer> arrlist = new ArrayList<Integer>();
		//loop
		for(int i=1;i<arr.length;i++) {
			arrlist.add(arr[i]);
			if(i!=arr[i-1]) {
				System.out.println("The Missing Element is "+i);
				break;
			}
			}
		
		}

	}


