/*We generate random number and check if it is divided by 3 and 4 in the same time */
import java.util.Random;

public class CheckRandInterval.java
{
	public static void main(String[] args) {
    Random rndVar = new Random();
    int number = rndVar.nextInt(15);
    if ((number%3==0)&&(number%4==0))
        System.out.println(number);
	else
	{
	    System.out.println( "The number is not divided by 3 and 4 in the same time");
	    System.out.println(number);
	}
	}
}
