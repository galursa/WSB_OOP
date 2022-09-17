import java.util.Scanner;

class Parent
{
	int age;
	String sex;
	public interface Child{
		void giveName();
	}
}

class Son implements Parent.Child
{
	String name;
	public void giveName() {
		System.out.println("What is your name?");
		Scanner data = new Scanner(System.in);
		name = data.next();
		data.close();
	}
}

public class Family {
	public static void main(String[] args) {
		Parent mama = new Parent();
		mama.age = 30;
		mama.sex = "woman";
		Son littleSon = new Son();
		littleSon.giveName();
		System.out.println(littleSon.name);
	}
}
