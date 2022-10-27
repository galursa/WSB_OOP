import java.io.FileWriter;
import java.io.IOException;

public class WriteAPoem {
	public static void main(String[] args) {
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
		
	}
}
