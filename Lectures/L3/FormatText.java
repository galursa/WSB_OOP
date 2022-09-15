import java.util.Formatter;

public class FormatText {
	public static void main(String[] args) {
		Formatter text = new Formatter();
		text.format("This is a string: %s. This is integer value: %d, "
				+ "and this is floating point value: %f","good morning", 20, 3.14);
		System.out.println(text);
		text.close();
	}
}

