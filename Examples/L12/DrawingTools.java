/*
 * abstract class Drawing
--
priceForBox : double
numberOfElements: int
producer : String
--
priceForOneElement(): double
printInfo():void
 */
/*
 * ColourPensils extends Drawing
--
kind: String
--
CoulorPensils
priceForOneElement(): double
printInfo():void
isFragile(): boolean
*/
/*
 * Pencil extends Drawing
--
hardness: String
--
Pencil
priceForOneElement(): double
printInfo():void
 */

abstract class Drawing
{
	protected double priceForBox;
	protected int numberOfElements;
	protected String producer;
	abstract double priceForOneElement();
	abstract void printInfo();
}

class ColourPencils extends Drawing
{
	protected String kind;
	ColourPencils(double priceForBox, int numberOfElements, String producer, String kind)
	{
		this.priceForBox = priceForBox;
		this.numberOfElements =numberOfElements;  
		this.producer = producer;
		this.kind = kind;
	}
	public double priceForOneElement()
	{
		return priceForBox / (double) numberOfElements;
	}
	public void printInfo()
	{
		System.out.println("Kind: "+kind);
		System.out.println("Producer: "+producer);
		System.out.println("Price: "+priceForBox);
		System.out.println("Number of Elements: "+numberOfElements);
		System.out.println("Price for one element: "+priceForOneElement());
		System.out.println("Is it fragile? "+isFragile());
	}
	public boolean isFragile()
	{
		if (kind == "Soft Pastels")
			return true;
		else 
			return false;
	}
	
}

class Pencil extends Drawing
{
	protected String hardness;
	Pencil(double priceForBox, int numberOfElements, String producer, String hardness)
	{
		this.priceForBox = priceForBox;
		this.numberOfElements =numberOfElements;  
		this.producer = producer;
		this.hardness = hardness;
	}
	
	public double priceForOneElement()
	{
		return priceForBox / (double) numberOfElements;
	}
	
	public void printInfo()
	{
		System.out.println("Producer: "+producer);
		System.out.println("Price: "+priceForBox);
		System.out.println("Number of Elements: "+numberOfElements);
		System.out.println("Hardness symbol: "+hardness);
		System.out.println("Price for one element: "+priceForOneElement());
	}
	
}


public class DrawingTools {
	public static void main(String[] args) {
		ColourPencils colours; 
		colours = new ColourPencils(30.95, 12, "Color your world", "Soft Pastels"); 
		colours.printInfo();
		Pencil pencil = new Pencil(10.99, 10, "Draws", "2B");
		pencil.printInfo();
		
	}
}
