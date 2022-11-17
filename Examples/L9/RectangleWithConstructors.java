import java.util.Scanner;

/*
Rectangle
--------
a: double
b: double
numberOfSide: integer
-------------
Rectangle()
Rectangle(double side)
Rectangle(double a, double b)
info(): void
area(): double
circumference(double... sides):double
*/

class Rectangle
{
	double a;
	double b;
	int numberOfSide;
	Rectangle()
	{
		Scanner data = new Scanner(System.in);
		System.out.println("Please write side a: ");
		a = data.nextDouble();
		System.out.println("Please write side b: ");
		b = data.nextDouble();
		numberOfSide = 4;
		data.close();
	}
	Rectangle(double side)
	{
		a = side;
		b = side;
		numberOfSide = 4;
	}
	Rectangle(double a, double b)
	{
		this.a = a;
		this.b = b;
		numberOfSide = 4;
	}
	
	
	void info()
	{
		System.out.println("Rectangle");
		System.out.println("Side a: "+a);
		System.out.println("Side b: "+b);
		System.out.println("Number of sides: "+numberOfSide);
	}
	
	double circumference(double... sides)
	{
		double sum = 0.0;
		for(double element : sides)
		{
			sum += element;
		}
		return sum;
	}
	double area()
	{
		return a*b;
	}
}


public class RectangleWithConstructors {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.info();
		Rectangle r2 = new Rectangle(3);
		r2.info();
		Rectangle r3 = new Rectangle(1,2);
		r3.info();
		System.out.println("1st circumference: "+r1.circumference(1,2,3));
		System.out.println("2nd circumference: "+r2.circumference(1,2,3,4));
		System.out.println("3d circumference: "+r1.circumference(1,2,3,4,5));;
		System.out.println("r1 area: "+r1.area());
		System.out.println("r2 area: "+r2.area());
		System.out.println("r3 area: "+r3.area());
	}
}
