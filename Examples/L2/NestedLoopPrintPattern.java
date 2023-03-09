/*
 * Generate triangle
 * 
 *    12345
  1|  *            1  5    5-1+1 = 5
  2|  **           2  5    5-2+1 = 4  
  3|  ***          3  5    5-3+1= 3
  4|  ****
  5|  *****
  */
public class NestedLoopPrintPattern {
	public static void main(String[] args) {
		int howMany = 20;
		for(int i=1; i<=howMany; i++)
		{
			for(int j=howMany-i+1; j<=howMany; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
