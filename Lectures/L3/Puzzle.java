import java.util.Formatter;

public class Puzzle {
	public static void main(String[] args) {
		Formatter text = new Formatter();
		int number = 5;
		int number2 = number-1;
		int number3 = number - 2;
		text.format("We have  %3$d books, %2$d pensils and  %1$d notebooks.", number, number2, number3 );
		System.out.print(text);
	}
}
