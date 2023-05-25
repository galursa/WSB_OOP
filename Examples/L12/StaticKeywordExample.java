import java.util.Random;
import java.util.Scanner;

public class StaticKeywordExample {
	static double e = 2.71;
	static double percentage(int percent)
	{
		return (double)percent / 100;
	}
	static {
		Scanner data = new Scanner(System.in);
		System.out.println("Write percentage value please.");
		int value;
		value=data.nextInt();
		System.out.println("You have written: "+ value + " %, which is: "+percentage(value));
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("I am calculating percentage from random value: ");
		Random rnd = new Random();
		int v = rnd.nextInt(100)+1;
		System.out.println("The random value is: "+ v + "%, which is: "+percentage(v));
	}
}
