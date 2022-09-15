class Rectangle{
	double a;
	double b;
}

public class FirstClass {
	public static void main(String[] args) {
	Rectangle rectan = new Rectangle();
	rectan.a = 3.5;
	rectan.b = 2;
	System.out.println("Field of rectangle ="+rectan.a*rectan.b);
	}
}
