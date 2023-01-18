/*
------
ITools
------
printName()
quantity()
priceForBox()
priceForOne()
makePriceTag()

class KitchenTools
*/

interface ITools
{
	public void printName();
	public int quantity();
	public double priceForBox();
	public double priceForOne();
	public void makePriceTag();
}

class KitchenTools implements ITools
{
	protected String name;
	protected double priceForBox;
	protected int numberOfElements;
	protected String materialFromWhichItIsMade;
	protected int lowestPossibleTemparature;
	protected int highestPossibleTemperature;
	protected String colour;
	protected boolean canBeWashedInDishWasher;
	KitchenTools(String name,double priceForBox,int numberOfElements, String materialFromWhichItIsMade, int lowestPossibleTemparature, int highestPossibleTemperature, String colour, boolean canBeWashedInDishWasher)
	{
		this.name = name;
		this.priceForBox = priceForBox;
		this.numberOfElements = numberOfElements;
		this.materialFromWhichItIsMade = materialFromWhichItIsMade;
		this.lowestPossibleTemparature = lowestPossibleTemparature;
		this.highestPossibleTemperature = highestPossibleTemperature;
		this.colour = colour;
		this.canBeWashedInDishWasher = canBeWashedInDishWasher;
	}
	public void printName()
	{
		System.out.println("Kitchen tool: "+ name);
	}
	public int quantity() {
		return numberOfElements;
	}
	public double priceForBox()
	{
		return priceForBox;
	}
	public double priceForOne()
	{
		return priceForBox/numberOfElements;
	}
	public void makePriceTag()
	{
		System.out.println(name);
		System.out.println(priceForBox);
		System.out.println("Price for single element: " + priceForOne());
		System.out.println("It is made of: "+ materialFromWhichItIsMade);
		System.out.println("It can be used from: "+lowestPossibleTemparature+" grades of C to"+ highestPossibleTemperature+ " grades of C.");
		System.out.println("Colour: "+colour);
		System.out.println("It can be washed in Dishwasher: "+ canBeWashedInDishWasher);
	}
}


public class KitchenUtencils {
	public static void main(String[] args) {
		KitchenTools spoon = new KitchenTools("Spoon", 50.99, 1, "Steel", -10, 200, "Silver", true );
		spoon.makePriceTag();
	}
}

