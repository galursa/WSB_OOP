/*
 * Generate pattern
 * 1 0 0 1  i=1 j=4 howMany-i+1	 = 4-1+1=4
 * 0 1 1 0  i=2 j=3                4-2+1=3
 * 0 1 1 0  i=3 j=2				   4-3+1=2
 * 1 0 0 1  i=4 j=1
 * 
 *    1 2 3
 * 1| 1 0 1  1=1 i==j      i=1, j=3
 * 2| 0 1 0  2=2           i=2, j=2
 * 3| 1 0 1  3=3           i=3, j=1
 * 
 */

public class NestedLoopsNumbersPattern {
	public static void main(String[] args) {
		int howMany = 3;
		for(int i=1; i<=howMany; i++)
		{
			for(int j=1; j<=howMany; j++)
			{
				if(j==howMany-i+1)
				{
					System.out.print("1");
				}
				else {
					if(i==j)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
			}
			System.out.println();
		}
	}
}
