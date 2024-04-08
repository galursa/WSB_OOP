class HandCream
{
	String name; 
	String companyName; 
	String listOfIngriedients; 
	String expiryDate; 
	double price; 
	int sizeOfCream; 
	String howToUseIt; 
	void printInfo()
	{
		int howManyMinuses = listOfIngriedients.length()+"Ingredients: ".length();
		for(int i=0; i<howManyMinuses; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		System.out.println("Name: "+name);
		System.out.println("Made by: "+companyName);
		System.out.println("Best before: "+expiryDate);
		System.out.println("Price: "+price+" zl");
	    System.out.println("Size: "+sizeOfCream +" ml" );
		for(int i=0; i<howManyMinuses; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		System.out.println("Ingredients: "+listOfIngriedients);
		for(int i=0; i<howManyMinuses; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		System.out.println("You can: "+howToUseIt);
		for(int i=0; i<howManyMinuses; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
}


/*
 * HandCream
--
name: String
companyName: String
listOfIngriedients: String
expiryDate: String
price: double
sizeOfCream: int
howToUseIt: String
--
printInfo():void

 */


public class HandCreamCosmetic {
	public static void main(String[] args) {
		HandCream smallCream = new HandCream();
		smallCream.name = "Small and Handy";
		smallCream.companyName = "Cream Extreme";
		smallCream.listOfIngriedients = "water, shea butter, cocoa butter, emulsifier";
		smallCream.expiryDate = "10.05.2025";
		smallCream.price = 12.99;
		smallCream.sizeOfCream = 30;
		smallCream.howToUseIt = "Put small amount on hands and rub it";
		smallCream.printInfo();
		
	}
}
