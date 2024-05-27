import java.util.Random;

public class Sorting {
		static void selectionSort(int[] numbers, int size)
		{
			// 1.find the smallest one value
			// 2. we need to replace with the first one in the sequence)
			for(int i=0;i<size-1; i++)
			{
				int minIndex = i;
				for(int j=i+1; j<size; j++)
				{
					if(numbers[j]< numbers[minIndex])
					{
						minIndex=j;
					}
				}
				int temp = numbers[minIndex];
				numbers[minIndex] = numbers[i];
				numbers[i] = temp;
			}
		}
		
		static void printArray(int[] numbers, int size)
		{
			for(int i=0; i<size; i++)
			{
				System.out.print(numbers[i]+" ");
			}
			System.out.println();
		}
	
		public static void main(String[] args)
		{
			int size = 10;
			int[] randomNum = new int [size];
			Random rand = new Random();
			for(int i=0; i<size; i++)
			{
				randomNum[i] = rand.nextInt(10);
			}
			printArray(randomNum,size);
			selectionSort(randomNum,size);
			printArray(randomNum,size);
		}
}
