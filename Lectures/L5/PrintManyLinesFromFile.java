import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintManyLinesFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("test.txt");
        Scanner date = new Scanner(myFile);
        while (date.hasNextLine()) {
            String data = date.nextLine();
            System.out.println(data);
        }
        date.close();
    }
}
