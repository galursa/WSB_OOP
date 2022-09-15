import java.util.Formatter;

public class PrecisionDivision {
	public static void main(String[] args) {
		double division, number = 1.0;
		for(int i=1; i<=10; i++)
		{
			division=number/i;
			Formatter lForm =  new Formatter();
			lForm.format("%3.15f %n", division);
			System.out.print(lForm);
		}
	}
}
