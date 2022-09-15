import java.io.FileWriter;   
import java.io.IOException;  

public class WriteToFile {
	  public static void main(String[] args) {
	    try {
	      FileWriter myFile = new FileWriter("Proverbs.txt");
	      myFile.write("An apple a day ");
	      myFile.write("keeps the doctor away \n");
	      myFile.write("A garlic a day\n");
	      myFile.write("keeps everyone away \n");
	      myFile.close();
	      System.out.println("File was written.");
	    } catch (IOException e) {
	      System.out.println("Cannot make a new file or another error occured.");
	      e.printStackTrace();
	    }
	  }
}
