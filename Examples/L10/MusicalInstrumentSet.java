/*super class
 * MusicalInstrument
--
#manufacturer: String
#kind: String
#price: double
--
+printInfo():void

sub classes

Piano
--
#typeOfPiano: String
#numberOfKeys: int
#numberOfPedal: int
--
+printPianoInfo()

Violin
--
#typeOfVioln: String
#numberOfStrings: int
#extraEquipment: String
--
+printViolinInfo()
 */


class MusicalInstrument
{
	protected String manufacturer;
	protected String kind;
	protected double price;
	MusicalInstrument(String manufacturer,String kind,double price)
	{
		this.manufacturer = manufacturer;
		this.price = price;
		this.kind = kind;		
	}
	public void printInfo()
	{
		System.out.println("Manufacturer: "+manufacturer);
		System.out.println("Kind: "+kind);
		System.out.println("Price: "+price);
	}
	public String getManufacturer()
	{
		return manufacturer;
	}
	public String getKind()
	{
		return kind;
	}
	public double getPrice()
	{
		return price;
	}
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}
	public void setKind(String kind)
	{
		this.kind = kind;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
}

class Piano extends MusicalInstrument
{
	 protected String typeOfPiano;
	 protected int numberOfKeys;
	 protected int numberOfPedal;
	 Piano(String typeOfPiano, int numberOfKeys, int numberOfPedal, String manufacturer, String kind,double price ){
		 super(manufacturer, kind, price);
		 this.typeOfPiano = typeOfPiano;
		 this.numberOfKeys = numberOfKeys;
		 this.numberOfPedal = numberOfPedal;
	 }
	 public void printPianoInfo()
	 {
		 System.out.println("Type of piano: "+typeOfPiano);
		 System.out.println("Number of keys: "+numberOfKeys);
		 System.out.println("Number of pedals: "+numberOfPedal);
	 }
	 public String getTypeOfPiano()
	 {
		 return typeOfPiano;
	 }
	 public int getNumberOfKeys()
	 {
		 return numberOfKeys;
	 }
	 public int getNumberOfPedal()
	 {
		 return numberOfPedal;
	 }
	 public void setTypeOfPiano(String typeOfPiano)
	 {
		 this.typeOfPiano = typeOfPiano;
	 }
	 public void setNumberOfKeys(int numberOfKeys)
	 {
		 this.numberOfKeys = numberOfKeys;
	 }
	 public void setNumberOfPedal(int numberOfPedal)
	 {
		 this.numberOfPedal=numberOfPedal;
	 }
	 
}

/*
 * Violin
--
#typeOfVioln: String
#numberOfStrings: int
#extraEquipment: String
--
+printViolinInfo()
 */

class Violin extends MusicalInstrument
{
	protected String typeOfViolin;
	protected int numberOfStrings;
	protected String extraEquipment;
	Violin(String typeOfViolin,int numberOfStrings,String extraEquipment,String manufacturer, String kind,double price)
	{
		 super(manufacturer, kind, price);
		 this.typeOfViolin = typeOfViolin;
		 this.numberOfStrings = numberOfStrings;
		 this.extraEquipment = extraEquipment;
	}
	public  void printViolinInfo()
	{
		System.out.println("Type of Violin: "+ typeOfViolin);
		System.out.println("Strings: "+numberOfStrings);
		System.out.println("Extra equipment: "+extraEquipment);
	}
}

public class MusicalInstrumentSet {
	public static void main(String[] args) {
		MusicalInstrument wood = new MusicalInstrument("Wood play", "Wood", 23.20);
		wood.printInfo();
		wood.setPrice(50.00);
		wood.printInfo();
		Piano grandPiano = new Piano("Grand Piano", 88, 3, "Yamaha", "Concert Piano", 5000.99 );
		grandPiano.printInfo();
		grandPiano.printPianoInfo();
		Violin violin = new Violin("Violin", 4, "Bow", "Stradivarius", "String", 120032.22);
		violin.printInfo();
		violin.printViolinInfo();
	}
}
