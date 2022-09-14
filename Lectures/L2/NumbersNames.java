import java.util.Random;
public class NumbersNames {
		public static void main(String[] args) {
			int number;
			//we generate random number
			Random randNum = new Random();
			number= randNum.nextInt(4)+1;
			switch(number) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			default:
				System.out.println("Unknown choice");
				
			}		
		}
	}
