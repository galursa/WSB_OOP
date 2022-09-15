public class ArrayDivBy4 {
	public static void main(String[] args) {
		int array[];
		array = new int[20];
		for(int i=4, j=0; i<20*4; i+=4, j++)
		{
			array[j]=i;
			System.out.print(array[j]+" ");
		}
	}
}
