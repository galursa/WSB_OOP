class FlowersInPot{
	String spieces;
	boolean isFlowering;
	int yearsOfLifey;
	float maxHeight;
	int howManyTimesWatering;
	
	void showInfo()
	{
		System.out.println("Spieces: "+spieces);
		System.out.print("Is flowering: ");
		if(isFlowering)
			System.out.print("yes");
		else 
			System.out.print("no");
		System.out.println();
		System.out.println("It grows: "+yearsOfLifey+" years");
		System.out.println("Maximum height: "+maxHeight);
		System.out.println("How many times we need to water:  "+howManyTimesWatering);
	}
}

public class Flowers {
	public static void main(String[] args) {
		FlowersInPot viola = new FlowersInPot();
		viola.spieces = "African viola";
		viola.isFlowering = true;
		viola.yearsOfLifey = 10;
		viola.maxHeight = 10.00f;
		viola.howManyTimesWatering = 2;
		viola.showInfo();
		
		FlowersInPot kalanchoe = new FlowersInPot();
		kalanchoe.spieces = "Kalanchoe";
		kalanchoe.isFlowering = true;
		kalanchoe.yearsOfLifey = 1;
		kalanchoe.howManyTimesWatering = 2;
		kalanchoe.maxHeight = 30;
		kalanchoe.showInfo();
	}
}
