class Figures{
	public int side;
	public String name;
	public void printInfo() {
		System.out.println("Class plane figures");
		System.out.println("side = "+ side);
		System.out.println("name = "+ name);
	}
}

class Rect extends Figures{
	public  int side2;
	public void printRectInfo() {
		System.out.println("Rect Class");
		System.out.println("side 1, Rect class = "+ side);
		System.out.println("side 2 = "+ side2);
		System.out.println("name = "+ name);
	}
}
public class PlaneFigures {
	public static void main(String[] args) {
		Figures fig1 = new Figures();
		Rect fig2 = new Rect();
		fig1.side = 3;
		fig1.name = "Triangle";
		fig2.side = 4;
		fig2.side2 = 5;
		fig2.name = "Rectangle";
		fig1.printInfo();
		fig2.printInfo();
		
	}
}
