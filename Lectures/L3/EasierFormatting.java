public class EasierFormatting {
	public static void main(String[] args) {
	 int IntValue = 1234;
	 double DValue = 12.34;
	 String text = "The quick brown fox jumps over the lazy dog.";
	 System.out.printf("a = %2$3.3f %nb = %1$3d %n", IntValue, DValue);
	 System.out.format("English pangram %n%S", text);
	}
}
