/*To check if chosen number is included in intervals <4,10> or <15,20> */


public class checkInterval
{
	public static void main(String[] args) {
		double number = 11;
		if (((number>=4)&&(number<=10))||((number>=15)&&(number<=20)))
		{
		    System.out.println("Number "+number+" is included in specified intervals");
		} else
		{
		    System.out.println("Number "+number+" is not included in specified intervals");
		}
		
	}
}
