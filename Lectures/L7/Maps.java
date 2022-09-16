import java.util.HashMap;
import java.util.Map;

public class Maps {
	public static void main(String[] args) {
		Map<String, String> musicBands = new HashMap<String, String>();
		musicBands.put("DM", "Depeche Mode");
		musicBands.put("JLo", "Jennifer Lopez");
		System.out.print("First musician: ");
		System.out.println(musicBands.get("DM"));
		System.out.println("Whole dictionary");
		System.out.println(musicBands);
		Map<String, Integer> diversions = new HashMap<String, Integer>();
		diversions.put("TV", 2);
		diversions.put("Books", 3);
		diversions.put("Games", 1);
		System.out.print("How much time do I spend on games? ");
		System.out.print(diversions.get("Games"));
	}
}
