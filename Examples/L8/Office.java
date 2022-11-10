import java.util.Arrays;
import java.util.Scanner;

/*
	 * OfficeSupplies
		--
		names : String[]
		quantity : int[]
		--
		addElement(howMany:Int):void
		printInfo():void
		
*/

class OfficeSupplies
{
	String[] names;
	int[] quantity;
	
	void addElement(int howMany)
	{
		names = new String[howMany];
		quantity = new int[howMany];
		Scanner data = new Scanner(System.in);
		
		for(int i=0; i<howMany; i++)
		{
			System.out.println("Write name: ");
			names[i] = data.next();
			System.out.println("Write quantity");
			quantity[i] = data.nextInt();
		}
		
		data.close();
	}
	void printInfo()
	{
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(quantity));
	}
}


public class Office {
	public static void main(String[] args) {
		OfficeSupplies writeTools = new OfficeSupplies();
		writeTools.addElement(2);
		writeTools.printInfo();
	}
}
