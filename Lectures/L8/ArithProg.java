import java.util.Scanner;
import java.util.Arrays;

class ArithProgression {
	int r;
	int a1;
	int n;
	int[] elements; 
	void printA1andR()
	{
		System.out.println("Arithmetic progression:");
		System.out.println("a1 = "+a1+", r = "+r+". ");
	}
	int nthElement(int n)
	{
		return a1+(n-1)*r;
	}
	void printElements()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.print(nthElement(i)+" ");
		}
	}
	void printElements(int n)
	{
		for(int i=1; i<=n; i++)
		{
			System.out.print(nthElement(i)+" ");
		}
	}
	boolean compare(ArithProgression c)
	{
		if((c.r == r)&&(c.a1 == a1))
			return true;
		else 	
			return false;
	}
	ArithProgression newProgression(int param)
	{
		ArithProgression p = new ArithProgression();
		p.a1 = a1;
		p.r = r+param;
		return p;
	}
	int[] writeToArray(int size)
	{
		int[] array = new int[size];
		array[0]=a1;
		for(int i=1; i<size; i++)
		{
			array[i]=array[i-1]+r;
		}
		return array;
	}
	void calculateElements()
	{
		elements = new int[n];
		elements[0]=a1;
		for(int i=1; i<n; i++)
		{
			elements[i]=elements[i-1]+r;
		}
	}
}

public class ArithProg {
	public static void main(String[] args) {
		ArithProgression p1 = new ArithProgression();
		Scanner data = new Scanner(System.in);
		System.out.println("Write values to make arithmetic progression");
		System.out.print("Type a1:");
		p1.a1 = data.nextInt();
		System.out.print("Type r:");
		p1.r = data.nextInt();
		p1.printA1andR();
		System.out.print("Which one element you want to find. Write value of  n:");
		int en;
		en = data.nextInt();
		System.out.println(en+"-th element of arithmetic progression is: "+p1.nthElement(en));
		System.out.println("Printing first 5 elements of arithmetic progression:");
		p1.printElements();
		System.out.println();
		System.out.println("Printing "+en+" elements of arithmetic progression:");
		p1.printElements(en);
		ArithProgression p2 = new ArithProgression();
		p2.a1=1;
		p2.r=3;
		System.out.println();
		System.out.println("Are progressions equal? " + p1.compare(p2));
		ArithProgression p3;
		p3 = p1.newProgression(2);
		p3.printA1andR();
		int[] p4 = new int[en];
		p4 = p1.writeToArray(en);
		System.out.println(Arrays.toString(p4));
		p1.n = en;
		p1.calculateElements();
		System.out.println(Arrays.toString(p1.elements));
		data.close();

	}
}
