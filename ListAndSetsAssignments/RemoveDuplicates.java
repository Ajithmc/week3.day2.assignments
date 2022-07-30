package ListAndSetsAssignments;


import java.util.LinkedHashSet;

import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// string input declaration
    String text = "We learn java basics as part of java sessions in java week1";
    
    String[] split = text.split(" ");//split string into array
    Set<String> dup = new LinkedHashSet<String>();
    for(int i =0;i<split.length;i++) {
    	dup.add(split[i]);   	
    }
  for (String text2 : dup) {
	System.out.print(text2 + " ");
}  
    
	}
}