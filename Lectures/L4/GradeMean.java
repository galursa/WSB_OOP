public class GradeMean {
	public static void main(String[] args) {
		double grades[] = {3.0, 4.5, 5.0, 3.5, 4.5};
		double mean=0;
		int howMany = grades.length;
		for(int i=0; i<howMany; i++)
		{
			mean+=grades[i];
		}
		System.out.print(mean/howMany);
	}
}
