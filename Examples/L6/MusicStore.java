/*
 * MusicalInstrument
--
+name : String
+price: float
+kind: String
+howManyMusicianCanPlay:int
+needsElectricity: Boolean
+equipment: String
+standingOrSitting: String
--
+printInfo()
 */

class MusicalInstrument
{
	String name;
	float price;
	String kind;
	int howManyMusicianCanPlay;
	Boolean needsElectricity;
	String equipment;
	String standingOrSitting;
	void printInfo()
	{
		System.out.println("Name: "+name);
		System.out.println("Kind: "+kind);
		System.out.println("Needs extra equipment: "+equipment);
		System.out.print("Needs electricity: ");
		if(needsElectricity)
			System.out.print("yes");
		else
			System.out.print("no");
		System.out.println();
		System.out.print("It lets ");
		System.out.print(howManyMusicianCanPlay);
		System.out.print(" musician(s) to play in the same time");
		System.out.println();
		System.out.println("You play on it "+standingOrSitting);
		System.out.println("Price: "+price+" PLN");
	}
}


public class MusicStore {
	public static void main(String[] args) {
		System.out.println("WELCOME TO MUSICAL INSTRUMENT STORE:");
		MusicalInstrument flute = new MusicalInstrument();
		flute.name = "flute";
		flute.howManyMusicianCanPlay = 1;
		flute.kind = "wind";
		flute.needsElectricity = false;
		flute.standingOrSitting = "both";
		flute.equipment = "none";
		flute.price = 49.99f;
		flute.printInfo();
		MusicalInstrument piano = new MusicalInstrument();
		piano.name = "grand piano";
		piano.howManyMusicianCanPlay = 2;
		piano.kind = "keyboard";
		piano.needsElectricity = false;
		piano.standingOrSitting = "sitting";
		piano.equipment = "chair";
		piano.price = 2500.55f;
		piano.printInfo();
		
	}
}
