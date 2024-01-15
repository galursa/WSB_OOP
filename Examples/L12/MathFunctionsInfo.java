abstract class MathClass
{
	protected String name;
	protected String explanation;
	abstract void printInfo();
}

class AlgebraicFunctions extends MathClass
{
	AlgebraicFunctions(String name, String explanation)
	{
		this.name = name;
		this.explanation = explanation;
	}
	void printInfo()
	{
		System.out.println("----------------------------------------------------");
		System.out.println(name+":");
		System.out.println(explanation);
		System.out.println("----------------------------------------------------");
	}
}



public class MathFunctionsInfo {
	public static void main(String[] args) {
		AlgebraicFunctions linFun = new AlgebraicFunctions("Linear function", "Straight line");
		linFun.printInfo();
		AlgebraicFunctions quadFun = new AlgebraicFunctions("Quadratic function", "Parabola");
		quadFun.printInfo();
	}
}
