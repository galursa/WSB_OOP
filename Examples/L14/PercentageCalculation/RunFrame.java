import java.awt.EventQueue;

public class RunFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Frame();
 			}
 		});
 	}
}
