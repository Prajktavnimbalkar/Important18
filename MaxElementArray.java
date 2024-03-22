package Class18;

public class MaxElementArray {
	
	public static void main(String[] args) {
		
		int[] array = {6,9,8,0,1,3,6};
		int max = array[0];
		for (int num :array) {
			
			if(num>max) {
				max=num;
			}
		}
		System.out.println("Maximum element in the array = " + max);

}
}