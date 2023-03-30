import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteAPoem {
	public static void main(String[] args) throws FileNotFoundException {
		/* 1. we want to write verses of poem to file 
		 * 2. and we want to read it from file 
		 * 3. and print with division to group of verses */	
		try {
			FileWriter file = new FileWriter("poem.txt");
			file.write("Today is a october day\n");
			file.write("Today is a autumn\n");
			file.write("Today is a happy day\n");
			file.write("Because we have Object Oriented Programming Course\n");
			file.close();
			System.out.println("File was made.");
		}catch (IOException err) {
			System.out.println("I cannot write to file\n");
			err.printStackTrace();
		}
		
		File fileToRead = new File("poem.txt");
		Scanner read = new Scanner(fileToRead);
		int i=1;
		while(read.hasNextLine()) {
			System.out.println(read.nextLine());
			i++;
			if(i%2==1)
				System.out.println();
		}
		
	}
}
