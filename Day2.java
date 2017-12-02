import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\n");
		System.out.println("Enter your input:");
		int checkSum = 0;
		while (scanner.hasNext()) {
			int lineMax = 0;
			int lineMin = 0;
			String x = scanner.next();
			String[] arr = x.split("\\s+");
			for (int i = 0; i < arr.length; i++) {
				int intValue = Integer.parseInt(arr[i]);
				if (intValue < lineMin || i == 0) {
					lineMin = intValue;
				}
				if (intValue > lineMax || i == 0) {
					lineMax = intValue;
				}
			}
			checkSum += lineMax - lineMin;
		}
		System.out.println("Answer " +checkSum);
	}
}
