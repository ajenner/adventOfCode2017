import java.util.Scanner;

public class Day1 {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input:");
		String input = scanner.next();
		char[] charArray = input.toCharArray();
		char first = charArray[0];
		int sum = 0;
		for (int i = 0; i < charArray.length/2; i++) {
			if (charArray[i] == charArray[i+charArray.length/2]) {
				sum += Character.getNumericValue(charArray[i]);
			}
		}
		for (int i = charArray.length/2; i < charArray.length; i++) {
			if (charArray[i] == charArray[Math.abs(i-charArray.length/2)]) {
				sum += Character.getNumericValue(charArray[i]);
			}
		}
		
		System.out.println("Answer: " + sum);
	}

}
