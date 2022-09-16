import java.util.HashSet;
import java.util.Set;

public class Alphabet {
	public static void main(String[] args) {
		Set<String> letters = new HashSet<String>();
		letters.add("A");
		letters.add("B");
		System.out.println(letters);
		letters.add("A");
		System.out.println(letters);
		for (String symbol: letters)
		{
			System.out.print(symbol+", ");
		}
		System.out.println();
		System.out.println("Does set contain A? "+ letters.contains("A"));
		System.out.println("Does set contain C? "+letters.contains("C"));
		System.out.println("We clear set");
		letters.clear();
		System.out.println(letters);
	}
}
