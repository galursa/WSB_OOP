import java.util.Random;
/*
 We generate one dimentional array and we count how many "3" we have 
 1. We need declare and initiate array.
 2. We need to put random numbers in array.
 3. Count "3" in array
*/

public class CountThree
{
	public static void main(String[] args) {
	    int arrSize = 10;
	    int intArray[] = new int[arrSize];
	    Random rand = new Random();
	    for(int i = 0; i<arrSize; i++)
	    {
	        intArray[i] = rand.nextInt(5); 
	        System.out.print(intArray[i]+" ");
	    }
	    int numberOfThree = 0;
	    for(int i = 0; i<arrSize; i++)
	    {
	        if (intArray[i] == 3)
	        {
	            numberOfThree++;
	        }
	    }
	    System.out.println();
	    System.out.println("We have: "+numberOfThree+" of 3.");
	   
	}
}
