public class ForEachLoop {
	public static void main(String[] args) {
	int array[] = new int[20];
	for (int i=0; i<20;i++) {
		array[i]=i*i;
		System.out.print(array[i]+" ");
	}
	System.out.println();
	for(int element : array)
	{
		System.out.print(element+" ");
	}
	System.out.println();
	}
}
