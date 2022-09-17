final class Triangle{
	private double a;
	private double h;
	Triangle(double a, double h)
	{
		this.a = a;
		this.h = h;
	}
	void printInfo()
	{
		System.out.println("Base of triangle = "+a);
		System.out.println("Height of triangle = "+h);
	}
}


public class Triangles {
	public static void main(String[] args) {
		Triangle t = new Triangle(2,3);
		t.printInfo();
	}
}
