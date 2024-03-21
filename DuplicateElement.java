package Class18;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,2,5,6,3,7};
		
		Set<Integer>set = new HashSet<>();
		
		Set<Integer>duplicates = new HashSet<>();
		
		for (int num:array) {
			
			if(!set.add(num)) {
				duplicates.add(num);
			}
		}
		
		System.out.println("Duplicate element = "+duplicates);
	}

}
