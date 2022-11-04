import java.util.HashMap;
import java.util.Map;

public class WeightsUnits {
	public static void main(String[] args) {
		/* Make dictionary with shortcuts for units of weights */
		/* kg - kilogramm, g- gramm, dag - decagramm*/
		Map<String, String> unitsOfWeights = new HashMap<String, String>();
		unitsOfWeights.put("kg", "kilogramm");
		unitsOfWeights.put("g", "gramm");
		unitsOfWeights.put("dag", "decagramm");
		System.out.println("Units of weights.");
		System.out.println(unitsOfWeights);
		System.out.println("Chosen unit: ");
		System.out.println(unitsOfWeights.get("kg"));
		
		
	}
}
