/*
 * Paint
--
#companyName:String
#colourName: String
#colourNumber: Int
#price: double
--
+printInfo():void
 */

class Paint
{
	protected String companyName;
	protected String colourName;
	protected int colourNumber;
	protected double price;
	Paint(String companyName, String colourName, int colourNumber, double price)
	{
		this.companyName = companyName;
		this.colourName = colourName;
		this.colourNumber = colourNumber;
		this.price = price;
	}
	public void printInfo()
	{
		System.out.println("Company name: "+companyName);
		System.out.println("Colour name: "+colourName);
		System.out.println("Colour Number:" + colourNumber);
		System.out.println("Price: "+ price +" zloty");		
	}
}

/*
 * OilPaint
--
#brand: String
#sizeOfContainter: double
#pigments: String
#colourName: String
#colourNumber: int
#transparency: String
#lightSensitivity: String

--
+printInfo():void
 */

class OilPaint extends Paint
{
	protected String brand;
	protected double sizeOfContainter;
	protected String pigments;
	protected String colourName;
	protected int colourNumber;
	protected String transparency;
	protected String lightSensitivity;
	OilPaint(String companyName, String colourName, int colourNumber, double price, String brand, double sizeOfContainter, String pigments, String transparency, String lightSensitivity){
		super(companyName, colourName, colourNumber, price);
		this.brand = brand;
		this.sizeOfContainter = sizeOfContainter;
		this.pigments = pigments;
		this.transparency = transparency;
		this.lightSensitivity = lightSensitivity;
	}
	public void printInfo()
	{
		super.printInfo();
		System.out.println("Brand: "+brand);
		System.out.println("Size: "+sizeOfContainter);
		System.out.println("Pigments: "+pigments);
		System.out.println("Transparency: "+transparency);
		System.out.println("Sensitivity to light: "+lightSensitivity);
	}
}
public class PaintShop {
	public static void main(String[] args) {
		OilPaint white = new OilPaint("Royal Talens", "Titanium white", 105, 49.99, "vanGogh", 200, "PW6 / PW4", "not transparent", "+++");
		white.printInfo();
	}
}
