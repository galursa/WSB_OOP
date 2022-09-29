import java.util.Random;

public class TheGreatest {
	public static void main(String[] args) {
		/*We want to generate a few random numbers and we want to find
		 which one from them are the greatest */
		int great, number;
		Random rand1 = new Random();
		number = rand1.nextInt(100);
		great = number;
		for(int i=1; i<=10; i++)
		{
			
			number = rand1.nextInt(100);
			System.out.print(number+" ");
			if(number>great)
			{
				great = number;
			}
		}
		System.out.println();
		System.out.println("Greatest value is: "+great);
		
	}
}
