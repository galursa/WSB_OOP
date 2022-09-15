import java.util.Scanner;

public class ReadSentence {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("Write a sentence");
		String sentence = data.nextLine();
		System.out.println("You wrote:");
		System.out.println(sentence);
		data.close();
	}
}
