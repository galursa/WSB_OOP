import java.util.Scanner;

/*We read word from user and we change first letter to capital letter upper case and 
 other letters to small letters - lower case */

public class UpperLowerCase
{
	public static void main(String[] args) {
	    
	    Scanner data = new Scanner(System.in);
	    String word;
	    System.out.println("Write word please.");
	    word = data.next();
	    word = word.toLowerCase();
	    String newWord ="";
	    newWord += word.charAt(0);
	    newWord = newWord.toUpperCase();
	    for(int i = 1; i<word.length(); i++)
	    {
	        newWord +=word.charAt(i);
	    }
	    System.out.println("Correct word: "+newWord);

	}
}
