abstract class SomeFigure{
	public String name;
	abstract double area();
	void info(){
		System.out.println(name);
	}
}

class Rectan extends SomeFigure{
	private double a;
	private double b;
	Rectan(double a, double b){
		this.a = a;
		this.b = b;
	}
	double area(){
		return a*b;
	}
}

class Circ extends SomeFigure{
	private double r;
	Circ(double r){
		this.r = r;
	}
	double area() {
		return 3.14*r*r;
	}
}
public class SomeFigures {
	public static void main(String[] args)
	{
		Circ k = new Circ(2);
		Rectan p = new Rectan(1,2);
		k.name = "Circle";
		p.name = "Rectangle";
		System.out.print(k.name+" ");
		System.out.println(k.area());
		System.out.print(p.name+" ");
		System.out.println(p.area());
		SomeFigure f;
		f = k;
		System.out.print(f.name+" ");
		System.out.println(f.area());	
	}
}
