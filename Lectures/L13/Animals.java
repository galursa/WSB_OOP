interface Mammals
{
	void speak();
	double weight();
	static void info()
	{
		System.out.println();
		System.out.println("This is static method");
	}
}

interface Dogs extends Mammals
{
	void waveTail();
	default void cleanUp()
	{
		System.out.print("bag, shovel, been");	
	}
}

class miniaturePinscher implements Dogs
{
	public void speak() {
		System.out.println("Woof, woof, woof");
	}
	public double weight()
	{
		return 4.5;
	}
	public void waveTail()
	{
		System.out.println("\\ / \\ / \\ / \\ /");
	}
}

public class Animals {
	public static void main(String[] args) {
		miniaturePinscher rex = new miniaturePinscher();
		rex.speak();
		System.out.println("Waga "+rex.weight());
		rex.waveTail();	
		rex.cleanUp();
		Mammals.info();
	}
}
