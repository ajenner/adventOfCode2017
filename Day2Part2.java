import java.util.Scanner;

public class Day2Part2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\n");
		System.out.println("Enter your input:");
		int checkSum = 0;
		while (scanner.hasNext()) {
			String x = scanner.next();
			String[] arr = x.split("\\s+");
			for (int i = 0; i < arr.length; i++) {
				int intValue = Integer.parseInt(arr[i]);
				for (int j = i + 1; j < arr.length; j++) {
					int intValue2 = Integer.parseInt(arr[j]);
					if (intValue2 != 0) {
						if (intValue % intValue2 == 0) {
							arr[j] = "0";
							checkSum += intValue / intValue2;
						} else if (intValue2 % intValue == 0) {
							arr[j] = "0";
							checkSum += intValue2 / intValue;
						} 
					}

				}
			}
		}
		System.out.println("Answer " +checkSum);
	}
}
