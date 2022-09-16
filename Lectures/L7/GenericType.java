
class Coffee{
	public String gatunek;
}

class Tea{
	public String rodzaj;
}

public class GenericType {
	public static void main(String[] args) {
		Container<String> s = new Container<String>("Good morning");
		Container<Integer> i = new Container<Integer>(123);
		Container<Coffee> k = new Container<Coffee>(new Coffee());
		Container<Tea> h = new Container<Tea>(new Tea());
		System.out.println("Container Integer: "+i.returnElement());
		System.out.println("Container String: "+s.returnElement());
		System.out.println("Container Coffee: "+k.returnElement());
		System.out.println("Container Tea: "+h.returnElement());
		Coffee arabica = k.returnElement();
		System.out.println("What containera has after we assing it to object of Coffee type: "+arabica);
	}
}
