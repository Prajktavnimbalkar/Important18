package Class18;

public class ArraySum {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,2,1,9};
		
		int sum =0;
		for (int num : array) {
			sum+=num;
		}
		System.out.println("Sum of array elements = "+ sum);
	}

}
