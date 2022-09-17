import java.util.Scanner;

public class StaticKeyword {
	   final static double GOLDEN_RATIO = 1.618;
	   static double cnstPi = 3.14;
	    static void printConstants()
	    {
	    	System.out.println("Constant = "+cnstPi);
	    }
	    static {
	    	Scanner data = new Scanner(System.in);
	    	System.out.println("Type data");
	    	double a, result;
			a = data.nextInt();
			result = a+cnstPi;
			System.out.println("a + pi = "+ result);
			data.close();
	    }
		public static void main(String[] args) {
			printConstants();
			System.out.println(GOLDEN_RATIO);
		}
}
