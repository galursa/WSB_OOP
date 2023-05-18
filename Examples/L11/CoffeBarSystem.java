/*
 * CoffeeBar
--
#name: String
#openingHours: String
#numberOfGuests: int
--
+printInfo(): void
+setOpeningHours(hours: String): void
+setNumberOfGuests(number: int):void
+printOpeningHours():void
+getNumberOfGuests(): int
 */

class CoffeBar
{
	protected String name;
	protected String openingHours;
	protected int numberOfGuests;
	CoffeBar(String name,String openingHours, int numberOfGuests)
	{
		this.name = name;
		this.openingHours = openingHours;
		this.numberOfGuests = numberOfGuests;
	}
	public void printInfo()
	{
		System.out.println("CoffeBar: "+name);
		System.out.println("Opening Hours: "+ openingHours);
		System.out.println("Number of available seats: "+numberOfGuests);
	}
	public void setOpeningHours(String hours)
	{
		openingHours = hours;
	}
	public void setNumberOfGuests(int number)
	{
		numberOfGuests = number;
	}
	public void printOpeningHours()
	{
		System.out.println("CoffeBar is opened beetwen hours: "+openingHours);
	}
	public int getNumberOfGuests()
	{
		return numberOfGuests;
	}
}

/*
 * Drinks
--
#kind: String
#sizeOfCup: double 
#listOfExtraElements: String
#openingHours: String
--
+printInfo():void
 */

class Drinks extends CoffeBar
{
	protected String kind;
	protected double sizeOfCup;
	protected String listOfExtraElements;
	protected String openingHours;
	Drinks(String name,String openingHours, int numberOfGuests,String kind, double sizeOfCup, String listOfExtraElements, String accessTime )
	{
		super(name, openingHours, numberOfGuests);
		this.kind = kind;
		this.sizeOfCup = sizeOfCup;
		this.listOfExtraElements = listOfExtraElements;
		this.openingHours = accessTime;
	}
	public void printInfo()
	{
		super.printInfo();
		System.out.println("You have chosen: "+ kind+" of "+sizeOfCup+ " ml");
		System.out.println("We add: "+listOfExtraElements);
		System.out.println("Dring is available between: "+openingHours);
	}
}

public class CoffeBarSystem {
	public static void main(String[] args) {
		Drinks tea = new Drinks("The Best Tea And Coffee", "12.00-20.00",20, "Tea", 250.5, "Lemon, Sugar, Milk", "12.30 - 19.30");
		tea.printInfo();
		Drinks coffee = new Drinks("The Best Tea And Coffee", "12.00-20.00", 40, "coffee", 330, "Milk, Vanilla sirup", "12.30 - 19.30");
		coffee.printInfo();
	}
}
