class GeomFigs{
	public int side;
	protected String name;
	GeomFigs(int a, String n)
	{
		side = a;
		name = n;
	}
	
	public void infoFig() {
		System.out.println("Geometric figures class");
		System.out.println("side = "+ side);
		System.out.println("name = "+ name);
	}
}

class Rectangle1 extends GeomFigs{
	public int side; // overrides side from superclass
	public  int side2;
	Rectangle1(int a, int b, String n)
	{
		super(a, n);
		side2 = b;
		side = a*2;
	}
	public void infoRectangle1() {
		System.out.println("Rectangle1 Class");
		System.out.println("side 1, Rectangle1 class = "+ side);
		System.out.println("side 1, GeomFigs class = "+ super.side);
		System.out.println("side 2 = "+ side2);
		System.out.println("name = "+ name);
	}
}
public class GeomFig {
	public static void main(String[] args) {
		GeomFigs fig1 = new GeomFigs(2, "Square");
		fig1.infoFig();
		Rectangle1 fig2 = new Rectangle1(3, 4, "Rectangle1");
		fig2.infoRectangle1();
	}
}
