import java.util.Scanner;
import java.util.Arrays;

class ArithProgression2 {
	int r;
	int a1;
	int n;
	int[] elements; 
	ArithProgression2()
	{
		System.out.println("Arithmetic progression. Type data.");
		System.out.println("Type a1");
		Scanner data = new Scanner(System.in);
		a1 = data.nextInt();
		System.out.println("Type r");
		r = data.nextInt();
		System.out.println("Type number of elements");
		n = data.nextInt();
		data.close();
	}
	ArithProgression2(int a1, int r, int n)
	{
		this.a1 = a1;
		this.r = r;
		this.n = n;
	}
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
	boolean compare(ArithProgression2 c)
	{
		if((c.r == r)&&(c.a1 == a1))
			return true;
		else 	
			return false;
	}
	ArithProgression2 newProgression(int param)
	{
		ArithProgression2 p = new ArithProgression2();
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
	void isArithmetic(int ... someProg)
	{
		int prevEl = 0;
		int i = 0;
		int constR=0;
		boolean yes = true;
	    for(int el : someProg)
	    {
	    	
	        System.out.print(el + " ");
	        if(i==1)
	        {
	        	constR = el-prevEl;
	        	yes = true;
	        } else if (i>1)
	        {
	        	int newR = el-prevEl;
	        	if(newR==constR)
	        	{
	        		yes = true;
	        	} else
	        	{
	        		yes = false;
	        	}
	        }
	        prevEl = el; 
	        i++;
	    }
	    if (yes)
	    	System.out.println("It is an arithmetic progression.");
	    else
	    	System.out.println("It is NOT an arithmetic progression.");
	}
}

public class ArithProg2 {
	public static void main(String[] args) {
		ArithProgression2 p = new ArithProgression2();
		p.printA1andR();
		ArithProgression2 p2 = new ArithProgression2(1,1,7);
		p2.printA1andR();
		ArithProgression2 p3 = new ArithProgression2(1,2,3);
		p3.isArithmetic(1,2,3,4);
		p3.isArithmetic(2,4,6);
		p3.isArithmetic(5,2,4,2,4);

	}
}
