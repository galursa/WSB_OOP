import java.util.Random;

public class IdentityMatrix {
	public static void main(String[] args) {
		/*
		 * We want to print shape
		 *   1 2 3
		 *   _____
		 *1| 1 0 0   row = 1, column =1
		 *2| 0 1 0   row = 2, column = 2
		 *3| 0 0 1   row = 3, column = 3
		 */
		Random rnd = new Random();
		int sqaureSize;
		sqaureSize = rnd.nextInt(5)+2;
		for(int i=0; i<sqaureSize; i++)
		{
			for(int j=0; j<sqaureSize; j++)
			{
				if(i==j)
				{
					System.out.print("1");
				} else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		
	}
	
}
