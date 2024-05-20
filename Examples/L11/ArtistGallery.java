/*
 * Artist
--
#name: String
#surname: String
#livingCountry: String
--
+printInfo():void
 */
class Artist
{
	protected String name;
	protected String surname;
	protected String livingCountry;
	Artist(String name, String surname,String livingCountry)
	{
		this.name = name;
		this.surname = surname;
		this.livingCountry = livingCountry;
	}
	public void printInfo()
	{
		System.out.println("Artist:");
		System.out.println(name);
		System.out.println(surname);
		System.out.println("Is working in: "+livingCountry);
	}
}

/*
 * Drawings
--
#width: double
#height: double
#title: String
#technique: String
#price: double
#year: Integer
--
+printInfo():void
+howOld(): void

 */

class Drawings extends Artist
{
	protected double width;
	protected double height;
	protected String title;
	protected String technique;
	protected double price;
	protected int year;
	Drawings(String name, String surname,String livingCountry, double width, double height, String title, String technique, double price, int year)
	{
		super(name, surname, livingCountry);
		this.width = width;
		this.height = height;
		this.title = title;
		this.technique = technique;
		this.price = price;
		this.year = year;
	}
	public void printInfo()
	{
		super.printInfo();
		System.out.println("Drawing");
		System.out.println("Title: "+title);
		System.out.println("Technique: "+technique);
		System.out.println("Size: "+width+"x"+height);
		System.out.println("Year: "+year);
		System.out.println("Price: "+price);
	}
	public void howOld(int currentYear)
	{
		int old = currentYear-year;
		System.out.println("It is "+old+" old.");
	}
}

public class ArtistGallery {
	public static void main(String[] args)
	{
		Artist abc = new Artist("Ace", "Best", "Canada");
		abc.printInfo();		
		Drawings xyz = new Drawings("Adam", "Novak", "Poland", 50.0,70.0,"Summer", "Charcoal", 129.99, 2020);
		xyz.printInfo();
		xyz.howOld(2024);
	}
}
