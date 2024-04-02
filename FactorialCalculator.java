package Class18;

import java.util.Scanner;

public class FactorialCalculator {
	
 public static long calculateFactorial(int number) {
	        if (number == 0 || number == 1) {
	            return 1;
	        } else {
	            return number * calculateFactorial(number - 1);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int userInput = scanner.nextInt();

	        if (userInput < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            long factorial = calculateFactorial(userInput);
	            System.out.println("The factorial of " + userInput + " is: " + factorial);
	        }

	        scanner.close();
	    }
	}
