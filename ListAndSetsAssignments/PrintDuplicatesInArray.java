package ListAndSetsAssignments;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int arrlength = arr.length;//length of array
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i =0;i <arrlength-1; i++) {
			
			for(int j = i+1;j<arrlength;j++) {
			
				if(arr[i] == arr[j]) {
					list.add(arr[i]);
								
				}		
			}
		}
		System.out.println(list);	
		}
	}


