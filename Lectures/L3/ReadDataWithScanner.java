import java.util.Scanner;

public class ReadDataWithScanner {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int inVal;
		double floatVal;
		String strVal;
		System.out.println("Write integer value please.");
		inVal = data.nextInt();
		System.out.println("Write floating point value value please");
		floatVal = data.nextDouble();
		System.out.println("Write string value please");
		strVal = data.next();
		System.out.println("You have written:");
		System.out.println("Integer Value: "+inVal+", floating point value: "+floatVal);
		System.out.println("String value: "+strVal);
		data.close();
	}
}
