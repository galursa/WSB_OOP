import java.io.FileWriter;   
import java.io.IOException; 
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
1. Generate numbers divided by 5 and we want to write them to file
5 10 15 20 25 ...

2. We want to read numbers from file
*/

public class Main
{
	public static void main(String[] args) throws FileNotFoundException {
		try{
		   FileWriter myFile = new FileWriter("numbers.txt");
		   myFile.write("Sequence \n");
		   for(int i=5; i<5*10; i+=5)
		    {
		        myFile.write(String.valueOf(i));
		        myFile.write(" ");
        		//System.out.print(i+" ");
		    }
		    myFile.close();
		    System.out.println("Numbers was written to the file");
		}catch(IOException e)
		{
		    System.out.println("An error occured");
		    e.printStackTrace();
		}
		File readFile = new File("numbers.txt");
		Scanner data = new Scanner(readFile);
		String line1 = data.nextLine();
		String line2 = data.nextLine();
		System.out.println(line1);
		System.out.println(line2);
		data.close();
		
	}
}
