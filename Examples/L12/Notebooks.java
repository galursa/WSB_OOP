/*/Notebook/
--
#name : String
#thickness: int
#size: String
#sitesNum: int
#price: double
--
/+info():void/
/+setPrice(double price): void/
 * */

abstract class Notebook
{
	protected String name;
	protected int thickness;
	protected String size;
	protected int sitesNum;
	protected double price;
	abstract public void info();
	abstract public void setPrice(double price);
}

/*
 * /StudentNotebook/
--
#rulledOrCheckeqered: String
--
+info():void
+setPrice(double price): void
 */

class StudentNotebook extends Notebook
{
	protected String rulledOrCheckeqered;
	StudentNotebook(String name,int thickness, String size, int sitesNum, double price, String rulledOrCheckeqered )
	{
		this.name = name;
		this.thickness = thickness;
		this.size = size;
		this.sitesNum = sitesNum;
		this.price = price;
		this.rulledOrCheckeqered =rulledOrCheckeqered;
	}
	public void info()
	{
		System.out.println("Name: "+ name);
		System.out.println("Thickness: "+ thickness);
		System.out.println("Size: "+size);
		System.out.println("Number of pages: "+sitesNum);
		System.out.println("Price: "+ price);
		System.out.println("Pages are: "+rulledOrCheckeqered);
		System.out.println();
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
}

/*
 * /Sketchbook/
--
#purpose: String 
--
+info():void
+setPrice(double price): void
		*/

class Sketchbook extends Notebook
{
	protected String purpose;
	Sketchbook(String name,int thickness, String size, int sitesNum, double price,String purpose)
	{
		this.name = name;
		this.thickness = thickness;
		this.size = size;
		this.sitesNum = sitesNum;
		this.price = price;
		this.purpose = purpose;
	}
	public void info()
	{
		System.out.println("Name: "+ name);
		System.out.println("Thickness: "+ thickness);
		System.out.println("Size: "+size);
		System.out.println("Number of pages: "+sitesNum);
		System.out.println("Price: "+ price);
		System.out.println("Purpose: "+purpose);
		System.out.println();
	}
	public void setPrice(double price)
	{
		this.price = this.price*price;
	}
}




public class Notebooks {
	public static void main(String[] args) {
		StudentNotebook sNotebook = new StudentNotebook("Plain notebook", 120, "B5", 100, 20.50, "plain");
		sNotebook.info();
		sNotebook.setPrice(15.99);
		sNotebook.info();
		Sketchbook drawBook = new Sketchbook("Draw and paint sketchbook", 240, "A3", 10, 30, "for drawing and acrylic painting" );
		drawBook.info();
		drawBook.setPrice(0.95);
		drawBook.info();
	}
}
