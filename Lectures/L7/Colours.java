import java.util.ArrayList;
import java.util.List;

public class Colours {
	public static void main(String[] args) {
		//We make list
		List <String> ourColours = new ArrayList<String>();
		//We print elements
		ourColours.add("White");
		ourColours.add("Red");
		ourColours.add("Yellow");
		System.out.println("List:");
		System.out.println(ourColours);
		//We choose element
		System.out.println("Second element of the list");
		System.out.println(ourColours.get(1));
	}
}