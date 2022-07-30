package ListAndSetsAssignments;

import java.util.Arrays;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		//  input
		int[] data = {3,2,11,4,6,7};
		//arranging in ascending order
		Arrays.sort(data);
		//pick 2nd largest
		System.out.println("The second largest number is "+data[data.length-2]);
	}

}
