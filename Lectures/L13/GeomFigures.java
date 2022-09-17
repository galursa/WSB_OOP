interface FigGeom {
 	public double perimeter();
 	public double area();
 	public void info();
}

interface MathConst{
	double Pi = 3.14159265;
	double e = 2.71828183;
	double Fi = 1.61803399;
}

class FigCircles implements FigGeom, MathConst{
	private double r;
	FigCircles(double r){
		this.r = r;
	}
	public double area() {
		return Pi*r*r;
	}
	public double perimeter() {
		return 2*Pi*r;
	}
	public void info()
	{
		System.out.println("This is a circle.");
	}
}

class FigRectang implements FigGeom{
	private double a;
	private double b;
	FigRectang(double a, double b){
		this.a = a;
		this.b = b;
	}
	public double area(){
		return a*b;
	}
 	public double perimeter(){
 		return 2*a+2*b;
 	}
 	public void info()
	{
		System.out.println("This is a rectangle");
	}
}

abstract class poligon implements FigGeom{
	public void info()
	{
		System.out.println("This is a poligon");
	}
}

public class GeomFigures {
	public static void main(String[] args)
	{
		FigCircles k = new FigCircles(4);
		FigRectang p = new FigRectang(1,2);
		k.info();
		System.out.println(k.area());
		System.out.println(k.perimeter());
		p.info();
		System.out.println(p.area());
		System.out.println(p.perimeter());
	}
}
