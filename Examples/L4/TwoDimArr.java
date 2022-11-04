import java.util.Random;

public class TwoDimArr {
	/*
	Make two dimentional array, where size of each row will be one more greater than previous row 
	*/
	public static void main(String[] args) {
		int rows = 10;
		int randArray[][] = new int[rows][];
		Random rand = new Random();
		for(int i=0; i<rows; i++)
		{
			randArray[i] = new int[i+1];
			for(int j=0;j<randArray[i].length ; j++)
			{
				randArray[i][j] = rand.nextInt(20);
				System.out.format("%4d",randArray[i][j]);
			}
			System.out.println();
		}
	}
}
