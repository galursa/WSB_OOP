import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ArrayToAndFromFile {
	public static void main(String[] args) throws FileNotFoundException{
		int numOfRows = 3;
		int numOfColumns = 7;
		int array[][] = new int[numOfRows][numOfColumns];
		Random randVal = new Random();
		for(int i=0; i<numOfRows; i++)
		{
			for(int j=0; j<numOfColumns; j++)
			{
				array[i][j] = randVal.nextInt(100);
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		try {
			FileWriter file = new FileWriter("array.txt");
			file.write(String.valueOf(numOfRows));
			file.write("\n");
			file.write(String.valueOf(numOfColumns));
			file.write("\n");
			for(int i=0; i<numOfRows; i++)
			{
				for(int j=0; j<numOfColumns; j++)
				{
					file.write(String.valueOf(array[i][j]));
					file.write(" ");
				}
				file.write("\n");
			}
			file.close();
			System.out.println("Data written to the file");
			
		}catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
		File file = new File("array.txt");
		Scanner data = new Scanner(file);
		int numOfRows2 = data.nextInt();
		int numOfColumns2 = data.nextInt();
		int array2[][] = new int[numOfRows2][numOfColumns2];
		int i = 0;
		while(data.hasNextLine()&&(i<numOfRows2))
		{
			for(int j=0; j<numOfColumns2; j++)
			{
				array2[i][j]= data.nextInt();
			}
			i++;
		}
		
		for(i=0; i<numOfRows2; i++)
		{
			for(int j=0; j<numOfColumns2; j++)
			{
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
		
		data.close();
	}
}
