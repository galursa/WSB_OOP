import java.util.HashMap;
import java.util.Map;

public class MathFunctionsShortcuts {
	public static void main(String[] args) {
		/*
		 * we want to have dictionary with short and full names of some 
		 * mathematical functions
		 */
		
		Map<String,String> mathFunctions = new HashMap<String,String>();
		mathFunctions.put("cos", "cosine function");
		mathFunctions.put("sin", "sine function");
		mathFunctions.put("tan", "tangent function");
		mathFunctions.put("ctan","cotangent function" );
		mathFunctions.put("arccos","arcus cosine function");
		System.out.println(mathFunctions);
		mathFunctions.remove("arccos");
		System.out.println(mathFunctions);
		System.out.println("Does our dictonary contain key \"tan\"? "+mathFunctions.containsKey("tan"));
		System.out.println("Does our dictonary contain value \"sine function\"? "+mathFunctions.containsValue("sine function"));
		System.out.println("Does our dictonary contain key \"arccos\"? "+mathFunctions.containsKey("arccos"));
		System.out.println("Does our dictonary contain value \"arcus cosine function\"? "+mathFunctions.containsValue("arcus cosine function"));
		
	}
}
