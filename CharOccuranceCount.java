package Class18;

public class CharOccuranceCount {

	public static void main(String[] args) {
		
		String text ="programming";
		
		char targetChar='p';
		
		int occuranceCount=0;
		
		for(char ch :text.toCharArray()) {
			
			if (ch == targetChar){
				
				occuranceCount++;
				
			}
		}
		
		System.out.println("Occurrances of "+targetChar+"="+occuranceCount);
	}
}
