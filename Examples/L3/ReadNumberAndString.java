import java.util.Scanner;

/* we want read number and word from user and we want to print it with format */

public class ReadNumberAndString
{
	public static void main(String[] args) {
	    
	    Scanner data = new Scanner(System.in);
	    System.out.println("Write number: ");
	    int number;
	    number = data.nextInt();
	    String word;
	    System.out.println("Write word: ");
	    word = data.next();
	    System.out.format("User have written value = %d, word = %s",number, word );
	}
}
