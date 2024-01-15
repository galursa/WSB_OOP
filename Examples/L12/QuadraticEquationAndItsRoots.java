
public class QuadraticEquationAndItsRoots {
	static void rootsOfQuadraticEq(double a, double b, double c)
	{
		double delta = b*b-4*a*c;
		if (delta<0)
		{
			System.out.println("Quadratic equation does not have roots");
			System.out.println();
		} else if(delta==0)
		{
			double x0 = - b / (2*a);
			System.out.println("Delta = 0 therefore we have one root x0 = "+x0);
			System.out.println();
		} else if (delta>0)
		{
			double x1 = (-b+ Math.sqrt(delta))/(2*a);
			double x2 = (-b- Math.sqrt(delta))/(2*a);
			System.out.println("Quadratic equation has two roots: ");
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		rootsOfQuadraticEq(1,2,3);
		rootsOfQuadraticEq(1,5,1);
		rootsOfQuadraticEq(1,2,1);
	}
}
