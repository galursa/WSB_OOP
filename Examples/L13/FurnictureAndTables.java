import java.util.Random;
import java.util.Scanner;

/*
IDetails
--------
printInfo()
setPrice()
setDiscount()
giveName()
setDimentions()
float thickOfSeat 
float thickOfBoard
-----------


---------
Table
------
tableTop : String
height
breadth
depth
name: String
price: float
discount: float
---------
Table(String tableTop)
printInfo()
setPrice()
setDiscount()
giveName()
setDimentions()
--------------


-------
Chair
-------
seat : String
height
breadth
depth
name: String
price: float
discount: float
-----------
Chair(String seat)
printInfo()
setPrice()
setDiscount()
giveName()
setDimentions()
float thickOfSeat 
float thickOfBoard
-----------
*/

interface IDetails
{
	void printInfo();
	void setPrice();
	void setDiscount();
	void giveName();
	void setDimentions();
	float thickOfSeat = 3.5f; 
	float thickOfBoard = 4.5f;
}

class Table implements IDetails
{
	String tableTop;
	double height;
	double breadth;
	double depth;
	String name;
	double price;
	float discount;
	Table(String tableTop)
	{
		this.tableTop = tableTop;
		setPrice();
		setDiscount();
		giveName();
		setDimentions();
	}
	public void printInfo()
	{
		System.out.println("Table top: "+tableTop);
		System.out.println("Height: "+height);
		System.out.println("Breadth: "+breadth);
		System.out.println("Depth: "+depth);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Discount: "+discount);
	}
	public void setPrice()
	{
		System.out.println("Write price for table, please");
		Scanner data = new Scanner(System.in);
		price = data.nextDouble();
		
		
	}
	public void setDiscount()
	{
		Random rand = new Random();
		discount = rand.nextFloat();
	}
	public void giveName()
	{
		System.out.println("Write name for table, please");
		Scanner data = new Scanner(System.in);
		name = data.next();
	}
	public void setDimentions()
	{
		System.out.println("Write dimentions for table, please");
		Scanner data = new Scanner(System.in);
		System.out.print("Height: ");
		height = data.nextDouble();
		System.out.print("breadth: ");
		breadth = data.nextDouble();
		System.out.print("depth: ");
		depth = data.nextDouble();
		
	}
}

class Chair implements IDetails
{
	String seat;
	double height;
	double breadth;
	double depth;
	String name;
	double price;
	double discount;
	Chair(String seat)
	{
		this.seat = seat;
		setPrice();
		setDiscount();
		giveName();
		setDimentions();
	}
	public void printInfo()
	{
		System.out.println("Seat: "+seat);
		System.out.println("Height: "+height);
		System.out.println("Breadth: "+breadth);
		System.out.println("Depth: "+depth);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Discount: "+discount);
	}
	public void setPrice()
	{
		System.out.println("Write price for chair, please");
		Scanner data = new Scanner(System.in);
		price = data.nextDouble();
	}
	public void setDiscount()
	{
		discount = 0.1 * price;
	}
	public void giveName()
	{
		System.out.println("Write name for chair, please");
		Scanner data = new Scanner(System.in);
		name = data.next();
	}
	public void setDimentions()
	{
		System.out.println("Write dimentions for table, please");
		Scanner data = new Scanner(System.in);
		System.out.print("Height: ");
		height = data.nextDouble();
		height+= thickOfSeat;
		System.out.print("breadth: ");
		breadth = data.nextDouble();
		System.out.print("depth: ");
		depth = data.nextDouble();
	}
}

public class FurnictureAndTables {
	public static void main(String[] args) {
		Table circleTable = new Table("Round");
		circleTable.printInfo();
		Chair tulip = new Chair("Velvet");
		tulip.printInfo();
	}

}
