import java.util.Random;

public class RandomNumerals {
	public static void main(String[] args) {
	/*We want to generate a few random numbers withing range <1,5>
	  And we want to change each value to roman numeral */
	Random rnd = new Random(); 	
	int value;
	for(int i=1; i<=5; i++)
	{
		value = rnd.nextInt(5)+1;
		System.out.print(value+" : ");
		switch(value)
		{
		case 1:
			System.out.println("I");
			break;
		case 2:
			System.out.println("II");
			break;
		case 3:
			System.out.println("III");
			break;
		case 4:
			System.out.println("IV");
			break;
		case 5:
			System.out.println("V");
			break;
		default:
			System.out.println("Uknown choice");	
			
		}
	}
  }
}
