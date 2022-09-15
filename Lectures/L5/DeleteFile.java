import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		 File myFile = new File("numbers.txt"); 
		    if (myFile.delete()) { 
		      System.out.println("File was deleted: " + myFile.getName());
		    } else {
		      System.out.println("File could not been deleted");
		    } 
	}
}
