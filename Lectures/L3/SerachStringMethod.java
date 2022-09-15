import java.util.Scanner;

public class SerachStringMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Write first word:");
		String word1 = input.next();
		System.out.println("Write second word:");
		String word2 = input.next();
		//We check if length of words are the same
		if (word1.equals(word2))
		{
			System.out.println("Words are the same.");
		}else {
			System.out.println("Words are different.");
		}
		input.close();
	}
}
