/*
Paint
--
kind: String
manufacturer: String
countryOfOrigin: String
price : dobule
pigments: String
nameOfColour: String
volume: int
watersoluble: Boolean
--
printInfo():void
*/


class Paint{
	String kind;
	String manufacturer;
	String countryOfOrigin;
	double price;
	String pigments;
	String nameOfColour;
	int volume;
	boolean watersoluble;
	void printInfo()
	{
		System.out.println("Kind: "+kind);
		System.out.println("Manufacturer: "+manufacturer);
		System.out.println("Country of origin: "+countryOfOrigin);
		System.out.println("Colour: "+nameOfColour);
		System.out.println("Pigments: "+pigments);
		System.out.println("Volume: "+volume+" ml");
		System.out.print("Watersoluble: ");
		if(watersoluble)
			System.out.print("yes");
		else
			System.out.print("no");
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("Price: "+price+" zlotych");
		System.out.println("-----------------------------");
	}
}


public class paintForShop {
	public static void main(String[] args) {
		Paint someAcrylic = new Paint();
		someAcrylic.kind = "Acrylic";
		someAcrylic.manufacturer = "Acrylic For Ever";
		someAcrylic.countryOfOrigin = "Poland";
		someAcrylic.volume = 120;
		someAcrylic.nameOfColour = "Yellow Ochre";
		someAcrylic.pigments = "PHY365";
		someAcrylic.price = 22.99;
		someAcrylic.watersoluble = true;
		someAcrylic.printInfo();
		System.out.println();
		Paint waterColors = new Paint();
		waterColors.countryOfOrigin = "China";
		waterColors.kind = "Watercolours";
		waterColors.manufacturer = "New Gong";
		waterColors.nameOfColour = "blue";
		waterColors.pigments = "udn12";
		waterColors.price = 15.34;
		waterColors.volume = 20;
		waterColors.watersoluble=true;
		waterColors.printInfo();
		
		
	}
}
