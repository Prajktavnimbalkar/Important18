package Class18;

public class RemoveDuplicates {
	
	
	public static void main(String a[]){
    String name="Madan";
    System.out.println("orignal format = "+name);
    StringBuilder sb=new StringBuilder(name);
    for(int i=0;i<name.length();i++){
        for(int j=i+1;j<name.length();j++){
           if(name.charAt(i)==name.charAt(j)){
            sb.deleteCharAt(j);

           }
        }
    }
   System.out.println("After deletion = "+sb+"");

  }
}
