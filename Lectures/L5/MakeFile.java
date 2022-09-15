import java.io.File;
import java.io.IOException;

public class MakeFile {
	public static void main(String[] args) {
		try {
		      File myFile = new File("numbers.txt");
		      if (myFile.createNewFile()) {
		        System.out.println("File is created: " + myFile.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occured.");
		      e.getMessage();
		    }
	}
}
