import java.util.Scanner;

/* Grades
--------
course: String
grades: double[]
--------------
Grades();
Grades(String course, float ... grade)
info(): void
average(double ... grade): double;
*/

class Grades{
    String course;
    double [] grades;
    Grades()
    {
        Scanner data = new Scanner(System.in);
        System.out.println("Write name of the course please: ");
        course = data.next();
        System.out.println("How many grades you want to write");
        int gradesSize;
        gradesSize = data.nextInt();
        grades = new double[gradesSize];
        for(int i=0; i<gradesSize; i++)
        {
            System.out.print(i+" : ");
            grades[i] = data.nextDouble();
        }
        System.out.println();
        data.close();
    }
    Grades(String course, double ... grade)
    {
        this.course = course;
        int i = 0;
        for(double element: grade)
        {
            i++;
        }
        grades = new double [i];
        int j=0;
        for(double element: grade)
        {
            grades[j] = element;
            j++;
        }
        
    }
    
    void info()
    {
        System.out.println("Name of course: "+course);
        System.out.println("Grades: ");
        for(double element : grades )
        {
            System.out.print(element+", ");
        }
        System.out.println();
    }
    double average(double ... grade)
    {
    	int i = 0;
    	double sum = 0.0;
    	for(double element : grade)
    	{
    		sum+=element;
    		i++;
    	}
    	return sum/i;
    }
}

public class GradesClass
{
	public static void main(String[] args) {
		Grades oop = new Grades();
		oop.info();
		System.out.println("Average = "+oop.average(3,3));
		Grades math = new Grades("Mathematics", 3,4,5);
		math.info();
		System.out.println("Average = "+oop.average(oop.grades));
	}
}
