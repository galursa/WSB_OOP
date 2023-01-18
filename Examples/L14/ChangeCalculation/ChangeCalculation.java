import java.awt.EventQueue;

public class ChangeCalculation {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ChangeFrame();
 			}
 		});
	}
}
