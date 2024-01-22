/*IMusicalInstruments
--

--
+void info()
+double discount(double value)
*/

interface IMusicalInstruments
{
	public void info();
	public double discount(double value);
}

/*
 * Piano
--
#companyName: String
#price: double
#kind: String
--
+void info()
+double discount(double value)

 */

class Piano implements IMusicalInstruments
{
	protected String companyName;
	protected double price;
	protected String kind;
	Piano(String companyName, double price, String kind )
	{
		this.companyName = companyName;
		this.price = price;
		this.kind = kind;
	}
	public void info() {
		System.out.println(kind+" : "+companyName);
		System.out.println("Price: "+price+" pln");
	}
	public double discount(double value)
	{
		return value*price;
	}
}

/*
 * Guitar
--
#companyName: String
#price: double
#kind: String
#numberOfStrings: int
--
+void info()
+double discount(double value)

 */

class Guitar implements IMusicalInstruments
{
	protected String companyName;
	protected double price;
	protected String kind;
	protected int numberOfStrings;
	Guitar(String companyName, double price, String kind,int numberOfStrings )
	{
		this.companyName = companyName;
		this.price = price;
		this.kind = kind;
		this.numberOfStrings =numberOfStrings; 
	}
	public void info()
	{
		System.out.println("Guitar: "+companyName);
		System.out.println(kind+" with "+numberOfStrings+" strings");
		System.out.println("Price: "+price);
	}
	public double discount(double value)
	{
		return price - value*price;
	}
}

public class MusicalInstruments {
	public static void main(String[] args)
	{
		Piano grandPiano = new Piano("Steinberg", 19999.99, "grand Piano");
		grandPiano.info();
		System.out.println();
		System.out.println("10% discount: "+grandPiano.discount(0.10)+" PLN");
		Guitar classGuitar = new Guitar("Admira Paloma", 399.99, "Classical guitar", 6);
		classGuitar.info();
		System.out.println("Price with 5% discount: "+classGuitar.discount(0.05));
	}
}
