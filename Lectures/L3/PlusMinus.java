import java.util.Random;
import java.util.Formatter;

public class PlusMinus {
	public static void main(String[] args) {
		Random randNum = new Random();
		int number;
		for(int i=0;i<10; i++)
		{
			number = randNum.nextInt(10);
			number -= 6; //number=number-6;
			Formatter fmt = new Formatter();
			fmt.format("%+d",number);
			System.out.println(fmt);
		}
	}
}
