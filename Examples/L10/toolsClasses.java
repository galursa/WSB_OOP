import java.util.Scanner;

/*
Tools
------
#producent
#category
#countryOfOrigin
-------
Tools(producent, category, countryOfOrigin)
Tools()
info()
getters
setters

Paints extends Tools
------------------
#id : int
#kind: String
#howManyInBox : int
#price: float
#numberOfMonthsAfterOpen: float
------------------
Paints(id,kin,howManyInBox,price,expiryDate)
info()
priceForOne():float
getNumberOfMonthsAfterOpen(): float
*/


class Tools{
	protected String producent;
	protected String category;
	protected String countryOfOrigin;
	Tools(String producent, String category, String countryOfOrigin)
	{
		this.producent = producent;
		this.category = category;
		this.countryOfOrigin = countryOfOrigin;
	}
	
	Tools()
	{
		System.out.println("Write values: ");
		Scanner data = new Scanner(System.in);
		System.out.println("Producent: ");
		producent = data.next();
		System.out.println("Category: ");
		category = data.next();
		System.out.println("Country of origin: ");
		countryOfOrigin = data.next();
		data.close();
	}
	
	public void info()
	{
		System.out.println("Class Tools. ");
		System.out.println("Producent: "+producent);
		System.out.println("Category: "+category);
		System.out.println("Country of origin: "+countryOfOrigin);
	}
	
	public void setProducent(String producent)
	{
		this.producent = producent;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public void setCountryOfOrigin(String countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getProducent()
	{
		return producent;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public String getCountryOfOrigin()
	{
		return countryOfOrigin;
	}
	
	
}


class Paints extends Tools{
	protected int id;
	protected String kind;
	protected int howManyInBox;
	protected float price;
	protected float numberOfMonthsAfterOpen;
	
	Paints(int id, String kind, int howManyInBox, float price, float numberOfMonthsAfterOpen)
	{
		this.id = id;
		this.kind = kind;
		this.howManyInBox =howManyInBox;
		this.price = price;
		this.numberOfMonthsAfterOpen =numberOfMonthsAfterOpen;
	}
	public void info()
	{
		System.out.println("Class Tools. ");
		System.out.println("Producent: "+producent);
		System.out.println("Category: "+category);
		System.out.println("Country of origin: "+countryOfOrigin);
		System.out.println("Id: "+id);
		System.out.println("Kind : "+kind);
		System.out.println("How Many In Box: "+howManyInBox);
		System.out.println("Price: "+price);
		System.out.println("Number Of Months After Open: "+numberOfMonthsAfterOpen);
	}
	
	public float priceForOne()
	{
		return price/howManyInBox;
	}
	
	public float getNumberOfMonthsAfterOpen()
	{
		return numberOfMonthsAfterOpen;
	}
}







public class toolsClasses {
	public static void main(String[] args) {
		Tools tool1 = new Tools("ABC", "Books", "Poland");
		tool1.info();
		System.out.println(tool1.getCountryOfOrigin());
		tool1.setProducent("XYZ");
		System.out.println(tool1.getProducent());
		tool1.info();
		Paints acrylic = new Paints(1,"Acrylic", 10, 49.99f, 12.5f);
		acrylic.info();
		System.out.println(acrylic.getCategory());
		
	}
}
