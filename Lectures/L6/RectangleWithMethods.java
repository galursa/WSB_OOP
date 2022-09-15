class Rectangles{
	double a;
	double b;
	double perimeter()
	{
		return 2*a+2*b;
	}
	void doubleSide()
	{
		a=2*a;
		b=2*b;
	}
	void increaseSide(double value)
	{
		a=value*a;
		b=value*b;
	}
}

public class RectangleWithMethods {
	public static void main(String[] args) {
	Rectangles rectang = new Rectangles();
	rectang.a = 3.5;
	rectang.b = 2;
	System.out.println("Rectangle area ="+rectang.a*rectang.b);
	System.out.println(rectang.perimeter());
	rectang.doubleSide();
	System.out.println(rectang.perimeter());
	rectang.increaseSide(2.5);
	System.out.println(rectang.perimeter());
	}
}
