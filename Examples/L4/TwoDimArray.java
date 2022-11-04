import java.util.Random;
import java.util.Scanner;
/*
    1. Make two-dimensional array 
    2. Read values from user
    3. Print array.
*/

public class TwoDimArray
{
	public static void main(String[] args) {
	    int numbers[][] = new int [3][5]; 
	    Scanner readValue = new Scanner(System.in);
	    for(int i=0; i<3; i++)
	    {
	        for(int j=0; j<5; j++ )
	        {
	            System.out.print("Numbers: "+i+", "+j+": ");
	            numbers[i][j] = readValue.nextInt();
	        }
	    }
	    readValue.close();
	    for(int i=0; i<3; i++)
	    {
	        for(int j=0; j<5; j++ )
	        {
	            System.out.format("%3d",numbers[i][j]);
	        }
	        System.out.println();
	    }
	    
	}
}
