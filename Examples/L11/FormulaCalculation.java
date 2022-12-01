/*
/*
Binomial 
--
#b: double
#c: double //bx+c 
--
+calculateValue(double x):double
+printInfo():void
*/

/*
Trinomial
--
#a: double  // ax^2+bx+c
--
+calculateValue(double x):double
+printInfo():void

*/

class Binomial
{
	protected double b;
	protected double c;
	Binomial(double b, double c)
	{
		this.b = b;
		this.c = c;
	}
	public double calculateValue(double x)
	{
		return b*x+c;
	}
	
	public void printInfo()
	{
		System.out.println("Binomial class");
		System.out.println(b+"*x+"+c);
	}
	public double getB()
	{
		return b;
	}
	public double getC()
	{
		return c;
	}
}

class Trinomial extends Binomial
{
	protected double a;
	Trinomial(double a, double b, double c)
	{
		super(b,c);
		this.a = a;
	}
	public double calculateValue(double x)
	{ // ax^2+bx+c
		return a*x*x+b*x+c;
	}
	public void printInfo()
	{
		System.out.println("Trinomial class");
		System.out.println(a+"*x^2+"+b+"*x+"+c);
	}
	public double getA()
	{
		return a;
	}
	
}


public class FormulaCalculation {
	public static void main(String[] args) {
		Binomial b1 = new Binomial(2,1);
		b1.printInfo();
		System.out.println("We calculate value of 3");
		System.out.println(b1.calculateValue(3));
		Trinomial t1 = new Trinomial(2,3,4);
		t1.printInfo();
		System.out.println("We calculate value of 1");
		System.out.println(t1.calculateValue(1));
		System.out.println("Prints b = "+t1.getB());
		System.out.println("Prints c = "+t1.getC());
		System.out.println("Prints a = "+t1.getA());
	}
}
