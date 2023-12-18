/*
 * SoftDrinks
--
#name:String
#hotOrCold: String
#volume: double
#price: double
...
--
+printInfo():void


Coffee
--
#typeOfCoffee: String
#addMilk: boolean
#extraIngriedient: String
--
+printCoffee():void
 */

class SoftDrinks
{
	protected String name;
	protected String hotOrCold;
	protected double volume;
	protected double price;
	public void setName(String name)
	{
		this.name = name;
	}
	public void setHotOrCold(String hotOrCold)
	{
		this.hotOrCold = hotOrCold;
	}
	public void setVolume(double volume)
	{
		this.volume = volume;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void printInfo()
	{
		System.out.println("Name: "+name);
		System.out.println("Temperature: "+hotOrCold);
		System.out.println("Cup of: "+volume+" ml");
		System.out.println("Price: "+price+" zl");
	}
}

class Coffee extends SoftDrinks
{
	protected String typeOfCoffee;
	protected boolean addMilk;
	protected String extraIngriedient;
	Coffee(String name, String hotOrCold, double volume, double price, String typeOfCoffee, boolean addMilk, String extraIngriedient )
	{
		this.name = name;
		this.hotOrCold = hotOrCold;
		this.volume = volume;
		this.price = price;
		this.typeOfCoffee = typeOfCoffee;
		this.addMilk = addMilk;
		this.extraIngriedient = extraIngriedient;
	}
	public void printCoffee()
	{
		System.out.println("***");
		this.printInfo();
		System.out.println("Type: "+typeOfCoffee);
		System.out.println("Milk: "+addMilk);
		System.out.println("Extra: "+extraIngriedient);
		System.out.println("***");
	}
}

public class CoffeeBar {
	public static void main(String[] args) {
		Coffee espresso = new Coffee("Coffee drink", "Hot", 50.0, 6.0, "espresso", false, "none");
		espresso.printCoffee();
		Coffee cappuccino = new Coffee("Coffee drink", "Hot", 200.0, 10.0, "cappuccino", true, "cinnamon, sugar");
		cappuccino.printCoffee();
		cappuccino.setPrice(8.5);
		cappuccino.printCoffee();
	}
}
