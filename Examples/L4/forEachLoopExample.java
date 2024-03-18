import java.util.Random;

public class forEachLoopExample {
	public static void main(String[] args) {
		/*
		 * We want to generate random numbers and put them into 
		 * one-dimentional array
		 * Size of array will be generated randomly
		 * And we want to print elements of the array
		 * using for-each loop
		 */
		
		Random rand = new Random();
		int arraySize = rand.nextInt(5)+4;
		int randArray[] = new int[arraySize];
		for(int i=0; i<arraySize; i++)
		{
			randArray[i]= rand.nextInt(20);
		}
		
		for(int element : randArray)
		{
			System.out.print(element+" ");
		}
	}
}
