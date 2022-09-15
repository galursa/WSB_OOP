public class LowTriMatrix {
	public static void main(String[] args) {
		int lowTriMatrix[][] = new int[5][];
		for(int i=0; i<lowTriMatrix.length;i++)
		{
			lowTriMatrix[i] = new int[i+1];
			for(int j=0; j<lowTriMatrix[i].length;j++)
			{
				lowTriMatrix[i][j]=1;
				System.out.print(lowTriMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
