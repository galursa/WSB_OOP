/*
ToolsForArtists
--
#manufacturer: String
#countryOfOrigin: String
#shipment: int
--
+printInfo():void
-------------------------------------
Pencils
--
#colours: String
#numberOfPencils: Int
#price: double
--
+printInfo(): void
+priceForSinglePencil():double
+pencilsRemain(): int

 */

class ToolsForArtists
{
	protected String manufacturer;
	protected String countryOfOrigin;
	protected int shipment;
	ToolsForArtists(String manufacturer, String countryOfOrigin, int shipment)
	{
		this.manufacturer = manufacturer;
		this.countryOfOrigin = countryOfOrigin;
		this.shipment = shipment;
	}
	public void printInfo()
	{
		System.out.println("Manufacturer: "+manufacturer);
		System.out.println("Country of origin: "+countryOfOrigin);
		System.out.println("How many days you need to wait for new item: "+shipment);
	}
}

class Pencils extends ToolsForArtists
{
	protected String colours;
	protected int numberOfPencils;
	protected double price;
	Pencils(String manufacturer, String countryOfOrigin, int shipment, String colours, int numberOfPencils, double price )
	{
		super(manufacturer,countryOfOrigin, shipment);
		this.colours = colours;
		this.numberOfPencils = numberOfPencils;
		this.price = price;
	}
	public void printInfo()
	{
		super.printInfo();
		System.out.println("Colours: "+colours);
		System.out.println("Number of pencils: "+numberOfPencils);
		System.out.println("Price: "+price);
	}

	
	public double priceForSinglePencil()
	{
		return price/numberOfPencils; //return price/(double)numberOfPencils;
	}
	public void sell()
	{
		if(numberOfPencils>0)
			numberOfPencils--;
		else 
			System.out.println("We do not have pencils. Please make an order.");
	}
	public int pencilsRemain()
	{
		return numberOfPencils;
	}
}

public class ArtistTools {
	public static void main(String[] args) {
		//String manufacturer, String countryOfOrigin, int shipment, String colours, int numberOfPencils, double price )
		Pencils colouredPencils = new  Pencils("Pen fun", "Poland", 7, "black, red, green", 100, 30.55);
		colouredPencils.printInfo();
		colouredPencils.sell();
		colouredPencils.printInfo();
		System.out.println("Price for single pencil: "+colouredPencils.priceForSinglePencil());
		System.out.println("Remains "+ colouredPencils.pencilsRemain()+" pencils.");
	}
}
