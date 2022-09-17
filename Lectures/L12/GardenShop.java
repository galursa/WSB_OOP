abstract class Plants
{
	protected String spiecies;
	protected float price;
	protected boolean annualOrNot;
	protected String placeToGrow;
	protected int numberInStorehous;
	abstract void printInfo();
	abstract void priceForOne(float priceForOnePlant);
	abstract float discount(float value);
}

class Trees extends Plants
{
	private String LeavesOrNeedles;
	private boolean throwsLeaves;
	Trees(String spiecies,float price,boolean annualOrNot, String placeToGrow,int numberInStorehous,String LeavesOrNeedles,boolean throwsLeaves){
		this.spiecies = spiecies;
		this.price = price;
		this.annualOrNot = annualOrNot;
		this.placeToGrow = placeToGrow;
		this.numberInStorehous = numberInStorehous;
		this.LeavesOrNeedles = LeavesOrNeedles;
		this.throwsLeaves = throwsLeaves;
	}
	void printInfo() {
		System.out.println("spiecies: "+spiecies);
		System.out.println("price: "+ price);
		System.out.println("Annual or perennial ");
		if(annualOrNot)
			System.out.print("yes");
		else
			System.out.print("no");
		System.out.println();
		System.out.println("Place to grow: "+placeToGrow);
		System.out.println("Number in storehouse: "+numberInStorehous);
		System.out.println(LeavesOrNeedles);
		System.out.println("Does it throw them? :");
		if(throwsLeaves)
			System.out.print("yes");
		else
			System.out.print("no");
		System.out.println();
	}
	void priceForOne(float priceForOnePlant)
	{
		price = priceForOnePlant;
	}
	
	float discount(float value)
	{
		return value*price;
	}
}


class FlowerPlants extends Plants
{
	private String colour;
	private Boolean honeyGiving;
	FlowerPlants(String spiecies,float price,boolean annualOrNot, String placeToGrow,int numberInStorehous, String colour, Boolean honeyGiving)
	{
		this.spiecies = spiecies;
		this.price = price;
		this.annualOrNot = annualOrNot;
		this.placeToGrow = placeToGrow;
		this.numberInStorehous = numberInStorehous;
		this.colour = colour;
		this.honeyGiving =honeyGiving;
	}
	void printInfo()
	{
		System.out.println("spiecies: "+spiecies);
		System.out.println("price: "+ price);
		System.out.println("Annual or perennial ");
		if(annualOrNot)
			System.out.print("yes");
		else
			System.out.print("no");
		System.out.println();
		System.out.println("Place to grow: "+placeToGrow);
		System.out.println("Number in storehouse: "+numberInStorehous);
		System.out.println("Colour: "+colour);
		System.out.print("Gives honey? ");
		if(honeyGiving)
			System.out.print("yes");
		else
			System.out.print("no");
		System.out.println();
	}
	void priceForOne(float priceForOnePlant)
	{
		price=priceForOnePlant*0.9f;
	}
	float discount(float value)
	{
		return price-value;
	}
	
}

public class GardenShop {
	public static void main(String[] args) {
		Trees spruce = new Trees("Spruce", 23.99f, false, "Sunny", 100, "coniferous", true);
		spruce.printInfo();
		spruce.priceForOne(20.99f);
		spruce.printInfo();
		System.out.println("Your discount is: "+spruce.discount(0.1f));
		FlowerPlants viola = new FlowerPlants("viola", 10.22f, true, "Any", 2000, "blue", false);
		viola.priceForOne(5);
		viola.printInfo();
		System.out.println("Your discount is:  "+viola.discount(0.50f));
		
	}
}
