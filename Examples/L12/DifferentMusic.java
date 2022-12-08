import java.util.Scanner;

/*
 * Music
--
#kind : String
#artist: String
#title: String
#price: double
#storage:String
--
printInfo(): void
price(): double



Classical Music
--
#instruments: String
--
printInfo(): void
price(): double



Pop Music
--
#numberOfMembers: int
--
printInfo(): void
price(): double
 */

 abstract class Music
 {
	 protected String kind; 
	 protected String artist;
	 protected String title;
	 protected double price;
	 protected String storage;
	 abstract void printInfo();
	 abstract double price();
 }
 
 class ClassicalMusic extends Music
 {
	 protected String instruments;
	 ClassicalMusic(String artist, String title, double price, String storage, String instruments ){
		 this.kind = "Classical Music";
		 this.artist = artist;
		 this.title = title;
		 this.price = price;
		 this.storage = storage;
		 this.instruments = instruments; 
	 }
	 void printInfo()
	 {
		 System.out.println("Kind of Music: "+kind);
		 System.out.println("Artist: "+artist);
		 System.out.println("Title: "+title);
		 System.out.println("Price: "+price);
		 System.out.println("Storage: "+storage);
		 System.out.println("Instruments: "+instruments);
	 }
	 double price()
	 {
		 return price;
	 }
 }
 
 
class PopMusic extends Music
{
	protected int numberOfMembers;
	PopMusic(String artist, String title, String storage, int numberOfMembers)
	{
		this.kind = "Pop Music";
		 this.artist = artist;
		 this.title = title;
		 this.storage = storage;
		 this.numberOfMembers = numberOfMembers;
		 this.price = price();
	}
	void printInfo()
	 {
		 System.out.println("Kind of Music: "+kind);
		 System.out.println("Artist: "+artist);
		 System.out.println("Title: "+title);
		 System.out.println("Price: "+price);
		 System.out.println("Storage: "+storage);
		 System.out.println("Members: "+numberOfMembers);
	 }
	 double price()
	 {
		 Scanner data = new Scanner(System.in);
		 System.out.println("Write price: ");
		 double value;
		 value = data.nextDouble();
		 price = value;
		 data.close();
		 return value;
	 }
}
 
 
 
public class DifferentMusic {
	public static void main(String[] args) {
		ClassicalMusic quartet = new ClassicalMusic("New Band","Band Band", 35.12, "CD", "Piano, violin, cello");
		quartet.printInfo();
		System.out.println("Price: "+quartet.price());
		PopMusic JLo = new PopMusic("Jennifer Lopez", "JLO", "Spotify", 1);
		JLo.printInfo();
	}
}
