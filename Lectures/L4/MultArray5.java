public class MultArray5 {
	public static void main(String[] args) {
		int multiplication[][] = new int[5][];
		multiplication[0]= new int[5];
		multiplication[1]= new int[5];
		multiplication[2]= new int[5];
		multiplication[3]= new int[5];
		multiplication[4]= new int[5];
		for(int i=0; i<5;i++)
		{
			for(int j=0; j<5;j++)
			{
				multiplication[i][j]=(i+1)*(j+1);
				System.out.print(multiplication[i][j]+" ");
			}
			System.out.println();
		}
	}
}
