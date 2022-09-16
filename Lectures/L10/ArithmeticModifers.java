import java.util.Scanner;

class AProgression {
    private int r;
    private int a1;
    private int n;
    private int s;
	AProgression()
	{
		System.out.println("Arithmetic progression type data");
		System.out.println("Type a1");
		Scanner data = new Scanner(System.in);
		a1 = data.nextInt();
		System.out.println("Type r");
		r = data.nextInt();
		System.out.println("Type numbers of elements");
		setN(data.nextInt());
		data.close();
	}
	AProgression(int a1, int r, int n)
	{
		this.a1 = a1;
		this.r = r;
		this.setN(n);
	}
	public void wyswietA1iR()
	{
		System.out.println("Arithmetic progression and its parameters");
		System.out.println("a1 = "+a1+", r = "+r+". ");
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
}
public class ArithmeticModifers {
	public static void main(String[] args) {
		AProgression p1 = new AProgression(1,1,5);
		p1.wyswietA1iR();
	}
}
