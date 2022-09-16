import java.util.LinkedList;

public class Paints {
	public static void main(String[] args) {
		LinkedList <String> kindOfPaint = new LinkedList<String>();
		kindOfPaint.add("Acrylic");
		kindOfPaint.add("Aquarell");
		kindOfPaint.add("Oil");
		System.out.println("List");
		System.out.println(kindOfPaint);
		//We print chosen element
		System.out.println("Second element in the list");
		System.out.println(kindOfPaint.get(1));
		//Some functions which works on list's element
		System.out.println("Las element in the list: ");
		System.out.println(kindOfPaint.getLast());
		System.out.println("Add element as first one");
		kindOfPaint.addFirst("Gouache");
		System.out.println("Last version of list");
		System.out.println(kindOfPaint);
	}
}
