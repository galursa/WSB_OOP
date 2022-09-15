import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Print1LineFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("test.txt");
        Scanner date = new Scanner(myFile);
            String data = date.nextLine();
            System.out.println(data);
        date.close();
    }
}
