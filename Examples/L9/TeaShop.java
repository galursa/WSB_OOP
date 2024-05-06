/*
 * Tea
--
name: String
type: String
price: double
weight: double

--
Tea()
Tea(name: String, type: String, price: double, weight: double)
printInfo():void
priceAverage(double ... priceSeq): double 
 */

import java.util.Scanner;

class Tea
{
	String name;
	String type; 
	double price; 
	double weight;
	Tea()
	{
		System.out.println("Reading values.");
		Scanner data = new Scanner(System.in);
		System.out.print("Type name: ");
		name = data.next();
		System.out.print("Type kind: " );
		type = data.next();
		System.out.print("Type price: " );
		price = data.nextDouble();
		System.out.print("Type weight: " );
		weight = data.nextDouble();
		//data.close();		
	}
	Tea(String name, String type, double price,	double weight)
	{
		this.name = name;
		this.type = type;
		this.price = price;
		this.weight = weight;
	}
	void printInfo()
	{
		System.out.println("Tea name: "+ name);
		System.out.println("Tea kind: "+ type);
		System.out.println("Tea costs: "+ price + " zl per 100 gramms");
		System.out.println("Tea weights: "+ weight + " g");
	}
	
	double priceAverage(double ... priceSeq)
	{
		int i = 0;
		double sum = 0.0;
		for(double singleEl : priceSeq)
		{
			sum+=singleEl;
			i++;
		}
		return sum/i;
	}
}

public class TeaShop {
	public static void main(String[] args) {
		Tea greenTea = new Tea();
		greenTea.printInfo();
		Tea blackTea = new Tea("Earl Grey", "black tea", 12.99, 100);
		blackTea.printInfo();
		System.out.println("Price average: "+greenTea.priceAverage(2,2,2));
		System.out.println("Price average: "+greenTea.priceAverage(1.3, 2.3, 4.2, 5.1));
	}
}
