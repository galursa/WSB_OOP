class Circle
{
	protected int r;
	Circle(int r)
	{
		this.r = r;
	}
	final void printInfo()
	{
		System.out.println("Radius  = "+r);
	}
}

class SemiCircle extends Circle
{
	protected double area;
	SemiCircle(int r)
	{
		super(r);
	}
	void printArea()
	{
		area = 0.5*3.14*r*r;
		System.out.println("Area of semicircle is : "+area);
	}
}


public class Circles {
	public static void main(String[] args) {
		SemiCircle po1 = new SemiCircle(2);
		po1.printArea();
	}
}
