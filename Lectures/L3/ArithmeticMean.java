import java.util.Scanner;

public class ArithmeticMean {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("Write numbers please.");
		int i;
		double sum=0.0;
		for(i=1; i<5;i++)
		{
			if (data.hasNextDouble())
			{
				sum+=data.nextDouble();
			}
		}
		System.out.println("Mean =");
		sum=sum/(i-1);
		System.out.print(sum);
		data.close();
	}
}