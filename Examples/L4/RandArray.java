import java.util.Random;

public class RandArray {
	/* We generate two arrays and fill them with random numbers
	 than we sum their content */
	public static void main(String[] args) {
		Random randNum = new Random();
		int arrSize = 10;
		int arr1[] = new int[arrSize];
		int arr2[] = new int[arrSize];
		int sumOfArrays[] = new int[arrSize];
		for(int i=0; i<arrSize; i++)
		{
			arr1[i] = randNum.nextInt(10);
			arr2[i] = randNum.nextInt(10);
			sumOfArrays[i] = arr1[i]+arr2[i];
			System.out.println(arr1[i]+" + "+arr2[i]+" = "+sumOfArrays[i]);
		}
		
	}
}
