import java.util.Random;

public class RandArray {
	public static void main(String[] args) {
		Random randVal = new Random();
		int tabrandVal[][] = new int[3][4];
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<4;j++)
			{
				tabrandVal[i][j]=randVal.nextInt(10);
				System.out.print(tabrandVal[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
